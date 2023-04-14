package main.java.PageEvents;

import main.java.Base.BaseTest;
import main.java.Models.ShoppingCart;
import main.java.PageObjects.SelectProductsElements;
import main.java.Utils.ElementFetch;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static main.java.PageEvents.ShoppingCartEvents.ClickOnAddToCartButton;

public class SelectProductsEvents extends BaseTest {



    public ShoppingCart MyProducts() throws InterruptedException {
        Thread.sleep(7000);
        ElementFetch elementFetch = new ElementFetch();
        List<WebElement> myElements = elementFetch.getListWebElements("XPATH", SelectProductsElements.MyElements);
        ImplicitlyWait();
        ScrollDown1();
        ImplicitlyWait();
        return  OpenObjectNewTap(myElements);
    }

    public static ShoppingCart OpenObjectNewTap(List<WebElement> elements) throws InterruptedException {
        Actions actions = new Actions(driver);
         Integer price;
         Integer counter = 0;
         Integer amount = 0;
        ImplicitlyWait();

        for (int x = 0; x < elements.size(); x++) {
            BaseTest.ScrollToElement(elements.get(x));
            price = Integer.parseInt(elements.get(x).getText().replace(",", ""));
            System.out.println(elements.get(x).getText());

            if (price < 15000) {
                 counter++;
                 amount = amount + price;
                ImplicitlyWait();
                actions.keyDown(Keys.CONTROL).moveToElement(elements.get(x)).click().perform();
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                driver.switchTo().window(tabs.get(tabs.size() - 1));
                ClickOnAddToCartButton();
                ImplicitlyWait();
                CloseTheObjectTap();
                driver.switchTo().window(tabs.get(0));
            }
            System.out.println("Inside For");
        }
        ElementFetch elementFetch = new ElementFetch();
        Thread.sleep(5000);
        System.out.println("amount = " + amount);
        System.out.println("counter = " + counter);
        return ShoppingCart.builder().amount(amount).subTotal(counter).build();
    }

    public void RefreshThePage() {
        driver.navigate().refresh();
    }

}
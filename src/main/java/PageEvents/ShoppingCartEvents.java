package main.java.PageEvents;

import main.java.PageObjects.SelectProductsElements;
import main.java.PageObjects.ShoppingCartElements;
import main.java.PageObjects.VideoGamesPageElements;
import main.java.Utils.ElementFetch;
import org.testng.Assert;

import java.util.ArrayList;

import static main.java.Base.BaseTest.driver;

public class ShoppingCartEvents {



    public static void ClickOnProceedToBuy() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", ShoppingCartElements.ClickOnProceedToBuy).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickOnCart() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", ShoppingCartElements.Cart).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public static void ClickOnPaymentMethod() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", ShoppingCartElements.PaymentMethodRadioButton).click();
    }

    public static void ClickOnCancelPrime() {
        try {
            ElementFetch elementFetch = new ElementFetch();
            elementFetch.getWebElement("XPATH", ShoppingCartElements.CancelPrime).click();
        }
        catch (Exception e){
            System.out.println("No Prime Appear");
        }
    }

    public static void CheckTheSubTotalOfTheAddedProducts(Integer SubTotal) {
        ElementFetch elementFetch = new ElementFetch();
        String str= elementFetch.getWebElement("XPATH", ShoppingCartElements.SubTotalOfProducts).getText();
        String numberOnly= str.replaceAll("[^0-9]", "");
        Assert.assertEquals(numberOnly,SubTotal.toString());
    }

    public static void CheckTheAmountOfTheAddedProducts(Integer Amount) {
        ElementFetch elementFetch = new ElementFetch();
        String str= elementFetch.getWebElement("XPATH", ShoppingCartElements.CheckFinalTotalAmount).getText();
        String mainChapterNum = str.substring(0, str.indexOf("."));
        String numberOnly= mainChapterNum.replaceAll("[^0-9]", "");
        Assert.assertEquals(numberOnly,Amount.toString());
    }
}

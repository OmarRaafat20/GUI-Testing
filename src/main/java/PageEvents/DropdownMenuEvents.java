package main.java.PageEvents;

import main.java.PageObjects.Dropdownelements;
import main.java.Utils.ElementFetch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static test.java.BaseTest.driver;

public class DropdownMenuEvents {

    public void Cookies () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID",Dropdownelements.Cookibutton).click();
    }
    public void EnterEmail() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("Name", Dropdownelements.emailb).click();
        elementFetch.getWebElement("Name", Dropdownelements.emailb).sendKeys("omarsody@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    }

    public void SelectFromDropdown () {

        ElementFetch elementFetch = new ElementFetch();
        WebElement EmployeesMenu = elementFetch.getWebElement("NAME",Dropdownelements.employee);
        Select select = new Select(EmployeesMenu);
        select.selectByIndex(1);
    }
}

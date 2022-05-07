package main.java.PageEvents;

import main.java.PageObjects.RegistrationElements;
import main.java.Utils.ElementFetch;
import org.testng.Assert;
import test.java.BaseTest;

import java.time.Duration;

public class RegistrationEvents {

    public void ClickOnRegisterLink() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", RegistrationElements.RegisterButton).click();
        Assert.assertTrue(elementFetch.getWebElement("XPATH", RegistrationElements.asertionvalue1).isDisplayed(), "Title is not displayed");
    }

    public void enterFirstName() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.FirstName).click();
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        elementFetch.getWebElement("ID", RegistrationElements.FirstName).sendKeys("Omar");
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.FirstName).isDisplayed());
    }

    public void enterLastName() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.LastName).sendKeys("Raafat");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.LastName).isDisplayed());

    }

    public void address() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.address).sendKeys("6 October First");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.address).isDisplayed());
    }

    public void city() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.city).sendKeys("Egypt");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.city).isDisplayed());
    }

    public void state() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.state).sendKeys("Cairo Giza");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.state).isDisplayed());

    }

    public void zipCode() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.zipCode).sendKeys("0021");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.zipCode).isDisplayed());

    }

    public void phone() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.phonenumber).sendKeys("01015080473");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.phonenumber).isDisplayed());
    }

    public void SSN() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.ssn).sendKeys("856974120364");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.ssn).isDisplayed());
    }

    public void UserName() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.userName).sendKeys("OmarTango20");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.userName).isDisplayed());
    }

    public void Password() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.passWord).sendKeys("123456789");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.passWord).isDisplayed());
    }

    public void confirmPassword() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationElements.confirmPaasword).sendKeys("123456789");
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("ID", RegistrationElements.confirmPaasword).isDisplayed());
    }

    public void RegisterButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("CLASSNAME", RegistrationElements.Button).click();
        BaseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(elementFetch.getWebElement("CLASSNAME", RegistrationElements.Button).isDisplayed());
    }
}

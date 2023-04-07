package main.java.PageEvents;

import main.java.PageObjects.LoginPageElements;
import main.java.Utils.ElementFetch;
import main.java.base.BaseTest;
import org.testng.Assert;

public class LoginPageEvents {

    public void VerifyLoginPageOpen() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying that login page is open");
        Assert.assertTrue(elementFetch.getListWebElements
                ("XPATH", LoginPageElements.NewUserSignupText).size()>0, "Login Page didn't Open");
        Thread.sleep(50);
    }

    public void EnterName() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the Name ");
        //elementFetch.getWebElement("XPATH", LoginPageElements.Name).click();
        elementFetch.getWebElement("XPATH", LoginPageElements.Name).sendKeys("tango");
        Thread.sleep(50);
    }

    public void EnterEmail() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the Email ");
        //elementFetch.getWebElement("XPATH", LoginPageElements.Email).click();
        elementFetch.getWebElement("XPATH", LoginPageElements.Email).sendKeys("omarsody@gmail.com");
        Thread.sleep(50);
    }

    public void ClickONSignButton() throws InterruptedException {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Button Clicked  ");
        elementFetch.getWebElement("XPATH", LoginPageElements.SignUpButton).click();
    }
}

package main.java.PageEvents;

import main.java.PageObjects.LoginPageElements;
import main.java.Utils.ElementFetch;
import main.java.Base.BaseTest;


public class LoginPageEvents {

    public void PhoneNumberFiled()  {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the Name ");
        elementFetch.getWebElement("ID", LoginPageElements.PhoneNumberFiled).sendKeys("01015080473");
    }
    public void ClickOnContinueButton()  {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the Email ");
        elementFetch.getWebElement("ID", LoginPageElements.Continue).click();
    }
    public void EnterPassword()  {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the Email ");
        elementFetch.getWebElement("ID", LoginPageElements.Password).sendKeys("Tango@2020");
    }
    public void ClickOnSignInButton()  {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Entering the Email ");
        elementFetch.getWebElement("ID", LoginPageElements.ClickOnSignIn).click();
    }
}

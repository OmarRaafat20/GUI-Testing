package main.java.PageEvents;

import main.java.PageObjects.HomePageElements;
import main.java.Utils.ElementFetch;
import main.java.Base.BaseTest;

public class HomePageEvents {



    public void ClickOnSignInButton() {
        ElementFetch elementFetch = new ElementFetch();

            BaseTest.logger.info("Clicking on sign in button");
            elementFetch.getWebElement("XPATH", HomePageElements.SignInButton).click();
        }

    public void ClickOnAmazon() {
        ElementFetch elementFetch = new ElementFetch();
        try {
            BaseTest.logger.info("Clicking on sign in button");
            elementFetch.getWebElement("XPATH", HomePageElements.ClickOnAmazon).click();
        }
        catch (Exception e) {
            System.out.println("Element is Not Displayed");
        }
    }
}

package main.java.PageEvents;

import main.java.PageObjects.HomePageElemnts;
import main.java.Utils.ElementFetch;
import main.java.base.BaseTest;

public class HomePageEvents {

    public void ClickOnSignInButton() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking on sign in button");
        elementFetch.getWebElement("XPATH", HomePageElemnts.signUpButton).click();
    }

    public void ClickHomeIcon() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking on Home Icon");
        elementFetch.getWebElement("XPATH", HomePageElemnts.HomePageIcon).click();
    }
}

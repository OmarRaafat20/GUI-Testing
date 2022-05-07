package main.java.PageEvents;

import main.java.PageObjects.BankHomePageElements;
import main.java.Utils.ElementFetch;
import main.java.base.BaseTest;

public class BankHomePageEvents {

    public void HomePageOpen() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Login Page  open");
        elementFetch.getWebElement("CLASSNAME", BankHomePageElements.PageTitle);
        System.out.println(BankHomePageElements.PageTitle);

    }
}

package main.java.PageEvents;

import main.java.PageObjects.AllSideMenuPageElements;
import main.java.Utils.ElementFetch;

public class AllSideMenuPageEvents {

    public void ClickOnAllMenu() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", AllSideMenuPageElements.AllMenu).click();
    }

    public void SeeAllButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", AllSideMenuPageElements.SellAll).click();
    }

    public void ClickOnVideoGames() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", AllSideMenuPageElements.VideoGames).click();
    }

    public void ClickOnAllVideoGames() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", AllSideMenuPageElements.AllVideoGames).click();
    }
}

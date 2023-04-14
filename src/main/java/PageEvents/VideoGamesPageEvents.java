package main.java.PageEvents;

import main.java.Base.BaseTest;
import main.java.PageObjects.SelectProductsElements;
import main.java.PageObjects.VideoGamesPageElements;
import main.java.Utils.ElementFetch;

import java.util.ArrayList;

import static main.java.Base.BaseTest.driver;

public class VideoGamesPageEvents {

    public void ClickOnFreeShippingCheckBox() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", VideoGamesPageElements.FreeShippingCheckBox).click();
    }

    public void ClickOnConditionNew() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.ScrollToElement( elementFetch.getWebElement("XPATH", VideoGamesPageElements.DivToScroll));
        elementFetch.getWebElement("XPATH", VideoGamesPageElements.NewCondition).click();
    }

    public void ClickOnSortBy() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", VideoGamesPageElements.SortPrice).click();
    }

    public void ClickOnPriceFilter() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", VideoGamesPageElements.HighToLow).click();
    }


}

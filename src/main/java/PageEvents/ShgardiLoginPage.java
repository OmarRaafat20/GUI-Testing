package main.java.PageEvents;

import main.java.PageObjects.LoginPageElements;
import main.java.Utils.ElementFetch;

public class ShgardiLoginPage {

    public void EnterEmailField() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.EmailFiled).click();
        elementFetch.getWebElement("ID", LoginPageElements.EmailFiled).sendKeys("dashboard@mnasat.com");
    }

    public void EnterPasswordField() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.PasswordField).click();
        elementFetch.getWebElement("ID", LoginPageElements.PasswordField).sendKeys("QP@ssw0rd");
    }

    public void ClickOnSignInButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.SignInButton).click();
    }

    public void ClickOnStakeHoldersIcon() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.StakeHolders).click();
    }

    public void ClickOnCustomerIcon() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.Customer).click();
    }

    public void AdvancedSearch() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.AdvancedSearch).click();
    }

    public void AdvancedSearch_PhoneNumberFiled() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.PhoneNumberAdvancedSearch).click();
        elementFetch.getWebElement("ID", LoginPageElements.PhoneNumberAdvancedSearch).sendKeys("+201015080473");
    }

    public void AdvancedSearch_SearchButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.AdvancedSearchSearchButton).click();
    }

    public void ActionButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.ActionButton).click();
    }

    public void InboxNotification() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.InboxNotification).click();
    }

    public void InBoxNotificationMenu() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.inBoxNotificationMenu).click();
    }

    public void DefultMessageMenu() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.DefultMessage).click();
    }

    public void BlueButtonNotification() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.BlueButton).click();
    }

    public void CreateNotification_TitleArabic () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.ArTitle).click();
        elementFetch.getWebElement("ID", LoginPageElements.ArTitle).click();
        elementFetch.getWebElement("ID", LoginPageElements.ArTitle).sendKeys("Automation Test");
    }

    public void CreateNotification_TitleEnglish () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.EnTitle).click();
        elementFetch.getWebElement("ID", LoginPageElements.EnTitle).sendKeys("Automation Test 1");
    }

    public void CreateNotification_TextArabic () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.ArText).click();
        elementFetch.getWebElement("ID", LoginPageElements.ArText).sendKeys("أختبار تطبيق");
    }

    public void CreateNotification_TextEnglish () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.EnText).click();
        elementFetch.getWebElement("ID", LoginPageElements.EnText).sendKeys("أختبر التطبيق 2");
    }

    public void MessageTypeSelection () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.MessageType).click();
    }

    public void MessageTypeSelected () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", LoginPageElements.MessageTypeSelected).click();
    }

    public void ClickOnSendMessageButton() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.SendMessageBTN).click();
    }
}

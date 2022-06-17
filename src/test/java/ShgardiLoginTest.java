package test.java;

import main.java.PageEvents.ShgardiLoginPage;
import org.testng.annotations.Test;

public class ShgardiLoginTest extends BaseTest {


    @Test
    public void LoginTest() throws InterruptedException {

        ShgardiLoginPage shgardiLoginPage = new ShgardiLoginPage();

        shgardiLoginPage.EnterEmailField();
        shgardiLoginPage.EnterPasswordField();
        shgardiLoginPage.ClickOnSignInButton();
        shgardiLoginPage.ClickOnStakeHoldersIcon();

        shgardiLoginPage.ClickOnCustomerIcon();
        WaitMethod();
        shgardiLoginPage.ClickOnCustomerIcon();
        WaitMethod();

        shgardiLoginPage.AdvancedSearch();


        shgardiLoginPage.AdvancedSearch_PhoneNumberFiled();


        shgardiLoginPage.AdvancedSearch_SearchButton();

        ScrollDown();
        WaitMethod();

        shgardiLoginPage.ActionButton();

        MoveToTheNewTab();
        WaitMethod();

        ScrollDown();

        shgardiLoginPage.InboxNotification();
        WaitMethod();

        shgardiLoginPage.InBoxNotificationMenu();
        WaitMethod();

        shgardiLoginPage.DefultMessageMenu();

        shgardiLoginPage.BlueButtonNotification();


        shgardiLoginPage.CreateNotification_TitleArabic();
        shgardiLoginPage.CreateNotification_TitleEnglish();
        shgardiLoginPage.CreateNotification_TextArabic();
        shgardiLoginPage.CreateNotification_TextEnglish();


        shgardiLoginPage.MessageTypeSelection();
        shgardiLoginPage.MessageTypeSelected();
        WaitMethod();
        shgardiLoginPage.ClickOnSendMessageButton();
    }
}

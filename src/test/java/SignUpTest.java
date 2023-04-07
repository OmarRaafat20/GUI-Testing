package test.java;

import main.java.PageEvents.HomePageEvents;
import main.java.PageEvents.LoginPageEvents;
import main.java.PageEvents.RegistrationPageEvents;
import main.java.base.BaseTest;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void SignUp() throws InterruptedException {

        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.ClickHomeIcon();
        Thread.sleep(2000);
        homePageEvents.ClickOnSignInButton();
        Thread.sleep(2000);

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.VerifyLoginPageOpen();
        loginPageEvents.EnterEmail();
        Thread.sleep(2000);
        loginPageEvents.EnterName();
        Thread.sleep(2000);
        loginPageEvents.ClickONSignButton();
        Thread.sleep(2000);

        RegistrationPageEvents registrationPageEvents = new RegistrationPageEvents();
        registrationPageEvents.ClickOnRadioButtonMR();
        registrationPageEvents.SendPassword();
        Thread.sleep(2000);
        ScrollDown();
        registrationPageEvents.DropDownMenuDays();
        Thread.sleep(2000);
        registrationPageEvents.DaySelected();
        Thread.sleep(2000);
        registrationPageEvents.DropDownMonth();
        Thread.sleep(2000);
        registrationPageEvents.MonthSelected();
        Thread.sleep(2000);
        registrationPageEvents.DropDownYears();
        Thread.sleep(2000);
        registrationPageEvents.YearSelected();
        Thread.sleep(2000);
        registrationPageEvents.CheckBoxChecked1();
        Thread.sleep(2000);
        registrationPageEvents.CheckBoxChecked2();
        Thread.sleep(2000);
        registrationPageEvents.FirstName();
        Thread.sleep(2000);
        registrationPageEvents.LastName();
        Thread.sleep(2000);
        registrationPageEvents.Company();
        Thread.sleep(2000);
        registrationPageEvents.Address1();
        Thread.sleep(2000);
        registrationPageEvents.Address2();
        Thread.sleep(2000);
        registrationPageEvents.CountryMenu();
        Thread.sleep(2000);
        registrationPageEvents.CountrySelect();
        Thread.sleep(3000);
        ScrollDown();
        registrationPageEvents.State();
        Thread.sleep(2000);
        registrationPageEvents.City();
        Thread.sleep(2000);
    }
}

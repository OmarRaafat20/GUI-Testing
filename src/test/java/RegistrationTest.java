package test.java;

import main.java.PageEvents.RegistrationEvents;
import main.java.base.BaseTest;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void Login() {
        RegistrationEvents registrationEvents = new RegistrationEvents();
        registrationEvents.ClickOnRegisterLink();
        registrationEvents.enterFirstName();
        registrationEvents.enterLastName();
        registrationEvents.address();
        registrationEvents.city();
        registrationEvents.phone();
        registrationEvents.zipCode();
        registrationEvents.state();
        registrationEvents.SSN();
        registrationEvents.Password();
        registrationEvents.UserName();
        registrationEvents.confirmPassword();
        registrationEvents.RegisterButton();

    }

}

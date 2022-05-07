package test.java;

import main.java.PageEvents.RegistrationValidationEvents;
import org.testng.annotations.Test;

public class RegistrationValidationTest extends BaseTest {

    @Test
    public void ValidationForm () {

        RegistrationValidationEvents registrationValidationEvents = new RegistrationValidationEvents();

        registrationValidationEvents.ClickOnRegisterLink();
        registrationValidationEvents.ValidateFN();
        registrationValidationEvents.ValidateLN();
        registrationValidationEvents.validateAddress();
        registrationValidationEvents.validateCity();
        registrationValidationEvents.RegisterButtonClick();
        registrationValidationEvents.validateState();


    }
}

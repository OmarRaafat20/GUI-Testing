package main.java.PageEvents;


import main.java.PageObjects.RegistrationValidationElements;
import main.java.Utils.ElementFetch;
import org.testng.Assert;

public class RegistrationValidationEvents {

    public void ClickOnRegisterLink() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",RegistrationValidationElements.RegisterButton).click();
    }

    public void ValidateFN () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID",RegistrationValidationElements.FirstName).click();
        String attribut = elementFetch.getWebElement("ID",RegistrationValidationElements.FirstName).getAttribute("class");
        System.out.println(attribut);
    }
    public void ValidateLN () {

        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID",RegistrationValidationElements.LastName).click();
        String Sattribut = elementFetch.getWebElement("ID",RegistrationValidationElements.LastName).getText().toLowerCase();
        System.out.println(Sattribut);
    }

    public void validateAddress () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID",RegistrationValidationElements.address).click();
    }

    public void validateCity () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID",RegistrationValidationElements.city).click();
    }

    public void validateState () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID",RegistrationValidationElements.state).click();
    }
    public void RegisterButtonClick () {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH",RegistrationValidationElements.Button).click();
        Assert.assertTrue(elementFetch.getWebElement("ID",RegistrationValidationElements.ValidateFirstName).isDisplayed(),"Enter First Name");
        Assert.assertTrue(elementFetch.getWebElement("ID",RegistrationValidationElements.ValidationLastName).isDisplayed(),"Enter Last Name");
        Assert.assertTrue(elementFetch.getWebElement("ID",RegistrationValidationElements.ValidateAddress).isDisplayed(),"Enter Your Address");
        Assert.assertTrue(elementFetch.getWebElement("ID",RegistrationValidationElements.ValidateCity).isDisplayed(),"Enter Your City ");
        Assert.assertTrue(elementFetch.getWebElement("ID",RegistrationValidationElements.ValidateState).isDisplayed(),"Enter Your State ");
    }
}

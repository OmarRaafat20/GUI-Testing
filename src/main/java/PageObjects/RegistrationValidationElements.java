package main.java.PageObjects;

public interface RegistrationValidationElements {
    String RegisterButton = "//*[@id=\"loginPanel\"]/p[2]/a";
    String ValidateFirstName = "customer.firstName.errors";
    String FirstName = "customer.firstName";
    String LastName = "customer.lastName";
    String ValidationLastName = "customer.lastName.errors";
    String address = "customer.address.street";
    String ValidateAddress = "customer.address.street.errors";
    String city = "customer.address.city";
    String ValidateCity = "customer.address.city.errors";
    String state = "customer.address.state";
    String ValidateState = "customer.address.state.errors";

    String zipCode = "customer.address.zipCode";
    String ValidateZipCode = "";
    String phonenumber = "customer.phoneNumber";
    String ValidatePhone = "";
    String ssn = "customer.ssn";
    String userName = "customer.username";
    String passWord = "customer.password";
    String confirmPaasword = "repeatedPassword";
    String Button = "/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input";
}

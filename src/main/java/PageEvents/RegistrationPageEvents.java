package main.java.PageEvents;


import main.java.PageObjects.RegistrationPageElements;
import main.java.Utils.ElementFetch;
import main.java.base.BaseTest;


public class RegistrationPageEvents {

    public void ClickOnRadioButtonMR() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("MR is Selected ");
        elementFetch.getWebElement("ID", RegistrationPageElements.RadioButtonMR).click();
    }

    public void SendPassword() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Password is entered ");
        elementFetch.getWebElement("ID", RegistrationPageElements.Password).sendKeys("Tango@2020");
    }

    public void DropDownMenuDays() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Days Menu opened ");
        elementFetch.getWebElement("ID", RegistrationPageElements.DropDownMenuDays).click();
    }

    public void DaySelected() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Day is Selected ");
        elementFetch.getWebElement("XPATH", RegistrationPageElements.DaySelected).click();
    }

    public void DropDownMonth() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Month Menu Open ");
        elementFetch.getWebElement("ID", RegistrationPageElements.DropDownMenuMonth).click();
    }

    public void MonthSelected() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Month is Selected ");
        elementFetch.getWebElement("XPATH", RegistrationPageElements.MonthSelected).click();
    }

    public void DropDownYears() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Menu Opened ");
        elementFetch.getWebElement("ID", RegistrationPageElements.DropDownYears).click();
    }

    public void YearSelected() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("year Selected ");
        elementFetch.getWebElement("XPATH", RegistrationPageElements.YearsSelected).click();
    }

    public void CheckBoxChecked1() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationPageElements.CheckBox1).click();
    }

    public void CheckBoxChecked2() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", RegistrationPageElements.CheckBox2).click();
    }

    public void FirstName() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("First Name Entered ");
        elementFetch.getWebElement("ID", RegistrationPageElements.FirstName).sendKeys("Omar");
    }

    public void LastName() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Last Name Entered ");
        elementFetch.getWebElement("ID", RegistrationPageElements.LastName).sendKeys("Raafat");
    }

    public void Company() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Company is Selected ");
        elementFetch.getWebElement("XPATH", RegistrationPageElements.Company).sendKeys("EJADA");
    }

    public void Address1() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Address1 is Selected ");
        elementFetch.getWebElement("ID", RegistrationPageElements.Address1).sendKeys("OctoberCity");
    }

    public void Address2() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Address2 is Selected ");
        elementFetch.getWebElement("ID", RegistrationPageElements.Address2).sendKeys("GIZA");
    }

    public void CountryMenu() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Country Menu Opened ");
        elementFetch.getWebElement("ID", RegistrationPageElements.CountryMenu).click();
    }

    public void CountrySelect() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Country is Selected ");
        elementFetch.getWebElement("XPATH", RegistrationPageElements.CountySelected).click();
    }

    public void State() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("State is Selected ");
        elementFetch.getWebElement("ID", RegistrationPageElements.State).sendKeys("Cairo");
    }

    public void City() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("City is Selected ");
        elementFetch.getWebElement("ID",RegistrationPageElements.City).sendKeys("USA");
    }


}

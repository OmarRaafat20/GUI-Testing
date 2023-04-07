package main.java.PageObjects;

public interface RegistrationPageElements {

    String RadioButtonMR = "id_gender1";
    String Password = "password";
    String DropDownMenuDays = "days";
    String DaySelected = "//option[@value='15']";
    String DropDownMenuMonth = "months";
    String MonthSelected = "//*[@id=\"months\"]/option[2]";
    String DropDownYears = "years";
    String YearsSelected = "//*[@id=\"years\"]/option[4]";
    String FirstName = "first_name";
    String LastName = "last_name";
    String Company = "//*[@id=\"company\"]";
    String Address1 = "address1";
    String Address2 = "address2";
    String CountryMenu = "country";
    String CountySelected = "//*[@id=\"country\"]/option[2]";
    String CheckBox1 = "newsletter";
    String CheckBox2 = "optin";
    String State = "state";
    String City = "city";



}

package main.java.PageObjects;

public interface LoginPageElements {
    String NewUserSignupText = "//*[@id=\"form\"]/div/div/div[3]/div/h2";  //"//h2[contains(text(), 'new user')]"
    String Name = "//input[@data-qa='signup-name']";
    String Email = "//input[@data-qa='signup-email']";
    String SignUpButton = "//button[@data-qa='signup-button']";
}

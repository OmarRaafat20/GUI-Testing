package main.java.PageObjects;

public interface LoginPageElements {

    String EmailFiled = "email";
    String PasswordField = "password";
    String SignInButton = "btn_login kt_login_signin_submit";
    String StakeHolders = "//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/i[1]";
    String Customer = "/html/body/kt-base/div/div/kt-aside-left/div[1]/div/div/ul/li[2]/div/ul/li[1]/a/span";
    String AdvancedSearch = "mat-expansion-panel-header-0";
    String PhoneNumberAdvancedSearch = "phonrNumber";
    String AdvancedSearchSearchButton = "btn_search";
    String ActionButton = "/html/body/kt-base/div/div/div/div[2]/div/kt-identity/kt-customers-list/kt-generic-table/div/div[2]/table/tbody/tr[1]/td[6]/button/span/mat-icon";
    String InboxNotification = "mat-expansion-panel-header-8";
    String inBoxNotificationMenu = "/html/body/kt-base/div/div/div/div[2]/div/kt-identity/kt-view-customer-details/div[16]/div/mat-accordion/mat-expansion-panel/div/div/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span";
    String DefultMessage = "/html/body/div[5]/div[2]/div/div/div/mat-option[2]/span";
    String BlueButton = "/html/body/kt-base/div/div/div/div[2]/div/kt-identity/kt-view-customer-details/div[16]/div/mat-accordion/mat-expansion-panel/div/div/div/div[1]/button/span";
    String ArTitle = "mat-input-1";
    String EnTitle = "mat-input-2";
    String ArText = "mat-input-3";
    String EnText = "mat-input-4";
    String MessageType = "/html/body/div[5]/div[2]/div/mat-dialog-container/kt-notification/form/div/div[1]/mat-form-field/div/div[1]/div/mat-select/div/div[1]/span";
    String MessageTypeSelected = "/html/body/div[5]/div[4]/div/div/div/mat-option[1]/span";
    String SendMessageBTN = "btn_save";

}

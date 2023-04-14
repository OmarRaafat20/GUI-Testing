package test.java;

import main.java.Base.BaseTest;
import main.java.Models.ShoppingCart;
import main.java.PageEvents.*;
import org.testng.annotations.Test;

import static main.java.PageEvents.ShoppingCartEvents.*;


public class SignUpTest extends BaseTest {


    @Test
    public void SignUp() throws InterruptedException {

        HomePageEvents homePageEvents = new HomePageEvents();
      //  homePageEvents.ClickOnAmazon();
        homePageEvents.ClickOnSignInButton();

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.PhoneNumberFiled();
        loginPageEvents.ClickOnContinueButton();
        loginPageEvents.EnterPassword();
        loginPageEvents.ClickOnSignInButton();


        AllSideMenuPageEvents allSideMenuPageEvents = new AllSideMenuPageEvents();
        allSideMenuPageEvents.ClickOnAllMenu();
        allSideMenuPageEvents.SeeAllButton();
        ScrollDown1();
        allSideMenuPageEvents.ClickOnVideoGames();
        allSideMenuPageEvents.ClickOnAllVideoGames();

        VideoGamesPageEvents videoGamesPageEvents = new VideoGamesPageEvents();
        ImplicitlyWait();
        Thread.sleep(5000);;
        videoGamesPageEvents.ClickOnFreeShippingCheckBox();
        ImplicitlyWait();


        videoGamesPageEvents.ClickOnConditionNew();
        ImplicitlyWait();
        videoGamesPageEvents.ClickOnSortBy();
        ImplicitlyWait();
        videoGamesPageEvents.ClickOnPriceFilter();
        ImplicitlyWait();

        SelectProductsEvents selectProductsEvents = new SelectProductsEvents();
        selectProductsEvents.RefreshThePage();

        ShoppingCart subTotal =  selectProductsEvents.MyProducts();
        selectProductsEvents.RefreshThePage();
        selectProductsEvents.RefreshThePage();

        ImplicitlyWait();
        ScrollUp();
        ImplicitlyWait();
        ClickOnCart();
        ImplicitlyWait();
        Thread.sleep(3000);
        CheckTheSubTotalOfTheAddedProducts(subTotal.getSubTotal());
        Thread.sleep(3000);
        CheckTheAmountOfTheAddedProducts(subTotal.getAmount());
        ClickOnProceedToBuy();
        ImplicitlyWait();
        Thread.sleep(5000);
        ClickOnCancelPrime();
        ImplicitlyWait();
        ClickOnPaymentMethod();

    }
}


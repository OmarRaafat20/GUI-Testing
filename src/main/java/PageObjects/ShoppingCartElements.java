package main.java.PageObjects;

public interface ShoppingCartElements {


    String ClickOnCart = "//*[@id=\"nav-cart\"]";
    String Cart = "//*[@id=\"nav-cart\"]";

    String ClickOnProceedToBuy = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input";

    String PaymentMethodRadioButton = "//div[@class=\"a-spacing-top-mini a-fixed-left-grid-col pmts-loan-detail-row a-col-right\"] ";
    String AddToCart = "//*[@id=\"submit.add-to-cart\"]";
    String CancelPrime = "/html/body/div[5]/div[1]/div/div/div/div/ms3-selection/div/div/div[3]/form/div[1]/div";
    String SubTotalOfProducts = "//*[@id=\"sc-subtotal-label-buybox\"]";

    String CheckFinalTotalAmount = "//*[@id=\"sc-subtotal-amount-buybox\"]";

}



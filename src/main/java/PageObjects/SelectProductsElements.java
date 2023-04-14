package main.java.PageObjects;

public interface SelectProductsElements {

    String MyElements = "//span[@class='a-price-whole']";

    String NoWarrantyButton = "//*[@id=\"attachSiNoCoverage\"]/span/input";
    String ShoppingCartCounter = "//*[@id=\"nav-cart-count\"]";

    String Cart = "//*[@id=\"nav-cart\"]";

    String TotalAmountInText = "//*[@id=\"subtotals-marketplace-table\"]/table/tbody/tr[1]/td[2]";

    String ClickOnProceedToBuy = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input";

    String PaymentMethodRadioButton = "//div[@class=\"a-spacing-top-mini a-fixed-left-grid-col pmts-loan-detail-row a-col-right\"] ";
}

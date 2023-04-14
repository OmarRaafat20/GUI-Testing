package test.java;

import main.java.Base.BaseTest;
import main.java.PageEvents.SelectProductsEvents;
import org.testng.annotations.Test;

public class AddingProducts extends BaseTest {

    @Test
    public static void AddProducts() throws InterruptedException  {

        SelectProductsEvents selectProductsEvents = new SelectProductsEvents();
        selectProductsEvents.MyProducts();
    }

}

package test.java;

import main.java.PageEvents.BankHomePageEvents;
import org.testng.annotations.Test;

public class BankHomePageTest extends BaseTest {

    @Test
    public void Login () {
        BankHomePageEvents bankHomePageEvents = new BankHomePageEvents();

        bankHomePageEvents.HomePageOpen();
    }

}

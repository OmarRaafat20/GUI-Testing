package test.java;

import main.java.PageEvents.DropdownMenuEvents;
import org.testng.annotations.Test;

public class DropDownTest  extends BaseTest {

    @Test
    public void droptesting () {
        DropdownMenuEvents dropdownMenuEvents = new DropdownMenuEvents();

        dropdownMenuEvents.Cookies();
        dropdownMenuEvents.EnterEmail();
        dropdownMenuEvents.SelectFromDropdown();
    }
}

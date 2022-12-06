package steps;

import io.cucumber.java.Before;
import utilities.SeleniumDriver;

public class BeforeAction {
    @Before
    public static void setUp(){
        SeleniumDriver.setUpDriver();
    }
}

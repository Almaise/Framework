package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utilities.SeleniumDriver;

public class AfterAction {
    @After
    public static void tearDown(Scenario scenario){
        WebDriver driver = SeleniumDriver.getDriver();
        System.out.println(scenario.isFailed());
        if(scenario.isFailed()){
            
            try{
            byte[] screenshot = ((TakesScreenshot)driver).
                    getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot,"image/png","error");
                    }catch (Exception e) {
            e.printStackTrace();
            }
            }


        SeleniumDriver.tearDown();

    }
}

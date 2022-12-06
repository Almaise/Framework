package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
    private static WebDriver driver;
    private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT= 50;


    private SeleniumDriver(){


        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        waitDriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
    }

    public static void openPage(String url){
        driver.get(url);
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void setUpDriver(){
        if(seleniumDriver == null){
            seleniumDriver = new SeleniumDriver();
        }
    }
    public static void tearDown(){
        if(driver !=null){
            driver.quit();
        }
        seleniumDriver = null;
    }
}

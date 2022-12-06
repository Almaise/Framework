import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;




public class AppiumBasics extends BaseTest {

    @Test
    public void WiFiSettingsName() {


        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(AppiumBy.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
        String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(alertTitle,"WiFi settings");
        System.out.println(alertTitle);

        driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("1234");
        driver.findElements(By.className("android.widget.Button")).get(1).click();
    }

}

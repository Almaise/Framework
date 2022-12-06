
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongPress extends BaseTest {
    @Test
    public void LongPressGesture() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Custom Adapter']")).click();

        WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        longPressAction(ele);

        String menuText = driver.findElement(By.id("android:id/title")).getText();
        Assert.assertEquals(menuText, "Sample menu");
        Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());

    }
}

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

public class DragDropDemo extends BaseTest {
    @Test
    public void DragDropTest() {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
        WebElement source = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

        ((JavascriptExecutor)driver).executeScript("mobile: dragGesture", ImmutableMap.of("elementId",
                ((RemoteWebElement)source).getId(),
                "endX",599,
                "endY", 538
        ));
        String success = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
        System.out.println(success);

    }
}
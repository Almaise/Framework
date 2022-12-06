import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class eCommerce_tc_1 extends BaseTest {
    @Test
    public void FillForm() throws InterruptedException {
        //enter credentials.
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Arnold");
        driver.hideKeyboard();
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
        driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
        driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        //scroll+cart
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
//
//       //Product loop
//        int productCunt =  driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
//        for(int i = 0;i < productCunt; i++){
//           String productName = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
//           if(productName.equalsIgnoreCase("Jordan 6 Rings")){
//               driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
//           }
//        }
//         driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text","Cart"));
//
//       String currentTitle = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
//       Assert.assertEquals(currentTitle, "Jordan 6 Rings");

        //add 2 products and check if totalSum is displayed correctly
        driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
        driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));

        List<WebElement> productPrices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
        int count = productPrices.size();
        double totalSum = 0;
        for (int i = 0; i < count; i++) {
            String amountString = productPrices.get(i).getText();
            Double price = Double.parseDouble(amountString.substring(1));
            totalSum = totalSum + price;
        }
        String cartSum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
        Double cartSum_1 = Double.parseDouble(cartSum.substring(1));

        Assert.assertEquals(cartSum_1, totalSum);

        WebElement btnPress = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
        longPressAction(btnPress);

        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();

        Thread.sleep(6000);

        //Google browser
        Set<String> contexts = driver.getContextHandles();
        for( String contextName :contexts){
            System.out.println(contextName);
        }
        driver.context("WEBVIEW_com.androidsample.generalstore");
        driver.findElement(By.name("q")).sendKeys("Arnold");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.context("NATIVE_APP");
    }


}

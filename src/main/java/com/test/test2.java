package org.example.test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

public class test2 {
    public static void main(String[] args) {}
        void androidLaunchTest() throws InterruptedException, MalformedURLException {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setPlatformName("Android"); //optional
            options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);//optional
            options.setDeviceName("amuthan-test-device");
            options.setApp(System.getProperty("user.dir") + "/apps/Android-MyDemoAppRN.1.3.0.build-244.apk");

            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            driver.findElement(AppiumBy.accessibilityId("open menu")).click();
    /*new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(e->e.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]")));
 */
            driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]"))
                    .click();
            // Thread.sleep(5000);
            driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("wfwdfg");
            driver.quit();
            //Assertion
        }

}

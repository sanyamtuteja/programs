package org.example.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class test001 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)", "");
        By element = By.xpath("");
        WebElement we = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));

//        js.executeScript("argument[0].scrollIntoView(true);", we);
        js.executeScript("window.scrollBy(0,1000");

        driver.quit();
    }


}

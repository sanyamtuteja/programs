package org.example.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    By toLocation = By.cssSelector("#searchboxinput");

    static String directions = "//div[normalize-space()='Directions']";
    static String fromLocation = "input[placeholder='Choose starting point, or click on the map...']";

    static String distance = ".ivN21e.tUEI8e.fontBodyMedium";
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/maps");

        searchFrom("Noida");
        clickOnDirection();
        toFrom("Delhi");
        System.out.println("Distance between Delhi and Noida is : " + returnDistance());

        driver.quit();

    }

    public static void searchFrom(String str) {
//        driver.findElement(By.cssSelector(toLocation)).sendKeys(str,Keys.ENTER);
    }

    public static void clickOnDirection() {

        driver.findElement(By.xpath(directions)).click();
    }

    public static void toFrom(String s) {
        driver.findElement(By.cssSelector(fromLocation)).sendKeys(s);
        driver.findElement(By.cssSelector(fromLocation)).sendKeys(Keys.ENTER);

    }

    public static String returnDistance() {
        String fdistance = "";
        List<WebElement> list = driver.findElements(By.cssSelector(distance));
        for (int i = 0; i < 1; i++) {
            fdistance = list.get(i).getText();
//            System.out.println(fdistance);
        }
        return fdistance;
    }

    public void urlcheck() throws IOException {
        URL url = new URL("url");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        http.connect();
        http.getResponseCode();

    }}
package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory
{
    private static WebDriver driver;
    public static WebDriver getDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//christina.adel//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/#google_vignette");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        return driver;
    }

    public static void quitDriver()
    {
       // if (driver != null) {
            driver.quit();
          //  driver = null;
        //}
    }
}

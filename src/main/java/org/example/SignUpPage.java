package org.example;

import dev.failsafe.internal.util.Assert;
import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    private WebDriver driver;
    private JavascriptExecutor js;

    public SignUpPage(WebDriver driver)
    {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
    }

    public void goToSignUpPage(String url)
    {
        driver.get(url);
        js.executeScript("window.scrollBy(0, 1000)");
    }

    public void signUp(String name, String email, String password,String Date,String month,String year,String newsletter){
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]")).sendKeys(name);
        driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]")).sendKeys(email);
        driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
        // Enter Account Info
        driver.findElement(By.id("uniform-id_gender2")).click();
       WebElement element = driver.findElement(By.id("password"));
       js.executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[2]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[3]")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[36]")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        //Address info
        driver.findElement(By.id("first_name")).sendKeys("NewCairo");
        driver.findElement(By.id("last_name")).sendKeys("Egypt");
        driver.findElement(By.id("company")).sendKeys("AfaQy");
        driver.findElement(By.id("address1")).sendKeys("Fifthsettelment");
        driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select/option[3]")).click();
        driver.findElement(By.id("state")).sendKeys("test");
        driver.findElement(By.id("city")).sendKeys("test");
        driver.findElement(By.id("zipcode")).sendKeys("123231");
        driver.findElement(By.id("mobile_number")).sendKeys("01211432533");
        driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/a")).click();
        driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }
}

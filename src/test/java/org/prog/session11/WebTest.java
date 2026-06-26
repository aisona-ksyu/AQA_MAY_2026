package org.prog.session11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

//TODO: navigate to allo.ua
//TODO: find Sarch button
//TODO: search for iphone/android/whatever

public class WebTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void myWebTest() {
        driver.get("https://www.google.com/");
        List<WebElement> cookieLink = driver.findElements(
                By.xpath("//a[contains(@href, 'cookies')]"));
        if (!cookieLink.isEmpty() && cookieLink.get(0).isDisplayed()) {
            List<WebElement> cookieFormButtons =
                    driver.findElements(By.xpath("//a[contains(@href, 'cookies')]/../../../..//button"));
            cookieFormButtons.get(3).click();
        }
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium Demo");
        searchBox.sendKeys(Keys.ENTER);
        System.out.println("done!");
    }
}



















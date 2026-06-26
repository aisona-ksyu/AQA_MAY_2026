package org.prog.session11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Search {
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){ driver = new ChromeDriver(); }
    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }


    @Test
    public void mySearch() {
        driver.get("https://allo.ua/");
        WebElement searchBox = driver.findElement(By.id("search-form__input"));
        searchBox.sendKeys("Samsung S26 Ultra");
        searchBox.sendKeys(Keys.ENTER);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        List<WebElement> results = wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(
                        By.cssSelector(".product-card"), 0
                )
        );

        Assert.assertTrue(results.size() > 0, "Пошук не видав жодного результату!");
//        List<WebElement> results = driver.findElements(By.cssSelector(".product-card"));
//        System.out.println(results.size());
//        Assert.assertTrue(results.size() > 0, "Пошук не видав жодного результату!");

//        System.out.println("done!");
    }

    }



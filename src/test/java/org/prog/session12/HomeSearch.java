package org.prog.session12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeSearch {


        private WebDriver driver;

        @BeforeSuite
        public void beforeSuite() {
            ChromeOptions options = new ChromeOptions();
            options.setAcceptInsecureCerts(true);
            options.addArguments("start-maximized");
            driver = new ChromeDriver(options);

        }

        @AfterSuite
        public void afterSuite() {
            driver.quit();
        }


        @Test
        public void mySearch() {

            Actions actions = new Actions(driver);

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
            for (int i = 0; i < 3; i++) {
                WebElement product = results.get(i);

                actions.moveToElement(product).perform();

                WebElement price = product.findElement(By.cssSelector(".sum"));
                WebElement code = product.findElement(By.cssSelector(".product-sku__value"));

                System.out.println("Price: " + price.getText() + " UAH");
                System.out.println("Item code: " + code.getText());

                Assert.assertNotNull(price.getText());
                Assert.assertNotNull(code.getText());
            }

        }
    }
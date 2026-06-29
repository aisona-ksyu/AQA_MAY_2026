package org.prog.session12;

import org.apache.commons.lang3.RandomStringUtils;
import org.awaitility.Awaitility;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.Random;

//TODO: on allo ua page - for first 3 goods print and assert not null goods price and goods code
//TODO: Hint: use Actions to see code

public class WebTest {

    private WebDriver driver;

    private Random random = new Random();

    @BeforeSuite
    public void beforeSuite() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    @Test
    public void myWebTest() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://www.cloudflare.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        WebElement acceptCookies =
                wait.until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
//        acceptCookies.sendKeys(Keys.ENTER);
        js.executeScript("arguments[0].click();", acceptCookies);
        wait.until(ExpectedConditions.invisibilityOf(acceptCookies));
        System.out.println("ok");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screen = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(screen.getAbsolutePath());
    }

    @Test
    public void iFrameTest() {
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_buttons_basic");

        WebElement iframe = driver.findElement(By.id("fast-cmp-iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//button[@class='fast-cmp-button-primary']")).click();
        driver.switchTo().defaultContent();
        System.out.println("done");
    }

    @Test
    public void testAwait() {
        Awaitility.await()
                .atMost(Duration.ofSeconds(10))
                .pollInterval(Duration.ofSeconds(1))
                .alias("Ooops didnt work out!")
                .until(() -> isOneOfAMillion());
    }

    @Test
    public void testUtils() {
        System.out.println(RandomStringUtils.insecure().nextAlphanumeric(100));
    }

    public boolean isOneOfAMillion() {
        int i = random.nextInt(100);
        return i == 1;
    }
}



















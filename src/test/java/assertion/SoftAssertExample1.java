package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample1 {
    public WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.letskodeit.com/practice");
    }

    @Test
    public void verifyPracticePage() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        WebElement radioBtn = driver.findElement(By.id("bmwradio"));
        radioBtn.click();
        softAssert.assertTrue(radioBtn.isSelected(), "Radio button should be selected");
        /*softAssert.assertFalse(radioBtn.isSelected(), "Radio button should not be selected");*/
        WebElement textboxElement = driver.findElement(By.id("displayed-text"));
        softAssert.assertTrue(radioBtn.isSelected(), "verify displyed-text");
        System.out.println(textboxElement.isDisplayed());
        String pageTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        softAssert.assertEquals(pageTitle,"Practice Page");
        softAssert.assertEquals(driver.getTitle(),"Practice","Title is not Matching");

       /* softAssert.assertEquals(driver.getTitle(), "Practice", "Website title should match 'Practice'");*/
        System.out.println("Edubridge");
        Thread.sleep(3000);
        //softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}





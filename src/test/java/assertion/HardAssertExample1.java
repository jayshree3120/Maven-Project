package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class HardAssertExample1 {

    @Test
    public void verifyPracticePage() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement enabled=driver.findElement((By.id("enabled-example-input"))); //Enabled
        enabled.sendKeys("isenabled");
        Assert.assertTrue(enabled.isDisplayed(),"Enabled should  work");

        WebElement autoTexting= driver.findElement(By.id("autosuggest")); //Autosuggest
        autoTexting.sendKeys("abcd");
        Assert.assertTrue(autoTexting.isEnabled(),"Auto texting should work");

        WebElement radioBtn = driver.findElement(By.id("bmwradio"));
        radioBtn.click();
        Assert.assertTrue(radioBtn.isSelected(), "Radio button should be selected");

        String pageTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(pageTitle,"Practice Page");
        Assert.assertEquals(pageTitle,"Practice Page","Website title should be match");

        Thread.sleep(3000);
        driver.close();
    }
}

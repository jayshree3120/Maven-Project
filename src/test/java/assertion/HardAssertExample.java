package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
 @Test
    public void basicOfTestCase5() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
     /*driver.get("https://www.letskodeit.com/practice");*/
                driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
     String pageTitle= driver.getTitle();
     Assert.assertEquals(pageTitle,"Facebook");
     Assert.assertEquals(pageTitle,"Facebook – log in or sign up","Website title should be match");

        Thread.sleep(3000);
        driver.close();
    }
}

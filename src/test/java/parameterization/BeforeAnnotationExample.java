package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BeforeAnnotationExample {

    WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void browserExample(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origin=*");
            options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver(options);
        } else if (browserName.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--remote-allow-origin=*");
            options.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
            System.setProperty("webdriver.edge.driver", "C:\\Users\\SOPAN\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver(options);
        } else {
            throw new RuntimeException("Please select correct browser name");
        }
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    }

    @Parameters({"validUserName", "validPassword"})
    @Test
    public void verifyLoginWithValidUserNameValidPassword(String validUserName, String validPassword) {
        driver.findElement(By.id("login1")).sendKeys(validUserName);
        driver.findElement(By.id("password")).sendKeys(validPassword);
        driver.findElement(By.className("signinbtn")).click();
    }

    @Parameters({"validUserName", "invalidPassword"})
    @Test
    public void verifyLoginWithValidUserNameInvalidPassword(String validUserName, String invalidPassword) {
        driver.findElement(By.id("login1")).sendKeys(validUserName);
        driver.findElement(By.id("password")).sendKeys(invalidPassword);
        driver.findElement(By.className("signinbtn")).click();
    }

    @AfterMethod
    public void afterAnnotationExample() {
                driver.quit();
    }
}

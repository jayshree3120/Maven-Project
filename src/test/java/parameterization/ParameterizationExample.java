package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
    String validUserName = "jayshree3120@gmail.com";
    String validPassword = "Jayshree1256";
    String inValidUserName = "Jayshree@abd.com";
    String invalidPassword = "2483";

    @Parameters({"validUserName", "validPassword"})
    @Test
    public void verifyLoginWithValidUserNameValidPassword(String validUserName, String validPassword) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.id("login1")).sendKeys(validUserName);
        driver.findElement(By.id("password")).sendKeys(validPassword);
        driver.findElement(By.className("signinbtn")).click();
        driver.close();
    }
    @Parameters({"validUserName", "invalidPassword"})
    @Test
    public void verifyLoginWithValidUserNameInvalidPassword(String validUserName, String invalidPassword) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.id("login1")).sendKeys(validUserName);
        driver.findElement(By.id("password")).sendKeys(invalidPassword);
        driver.findElement(By.className("signinbtn")).click();
        driver.close();
    }

    @Parameters({"inValidUserName", "validPassword"})
    @Test
    public void verifyLoginWithInvalidUserNameValidPassword(String inValidUserName, String validPassword) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.id("login1")).sendKeys(inValidUserName);
        driver.findElement(By.id("password")).sendKeys(validPassword);
        driver.findElement(By.className("signinbtn")).click();
        driver.close();
    }

    @Parameters({"inValidUserName", "invalidPassword"})
    @Test
    public void verifyLoginWithInvalidUserNameInvalidPassword(String inValidUserName, String invalidPassword) {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.id("login1")).sendKeys(inValidUserName);
        driver.findElement(By.id("password")).sendKeys(invalidPassword);
        driver.findElement(By.className("signinbtn")).click();
        driver.close();
    }
}










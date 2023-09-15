package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DataProviderAnnotation {
    WebDriver driver;
    @DataProvider(name = "test-data")
    public Object[][] dataProviderFun() {
        return new Object[][]{
                {"Selenium", "Pune"},
                {"Java", "Pune"}
        };
    }
    @BeforeMethod
    public void browserExample() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }

    @Test(dataProvider = "test-data")
    public void verifySearch(String courseName, String cityName) throws InterruptedException {
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys(courseName + " " + cityName);
        textBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterAnnotationExample() {
        driver.quit();
    }
}





package annotation;
import failtestcases.RunFailTestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample {

    public WebDriver driver;

    @BeforeMethod
    public void beforeAnnotationExample() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
    }

   /* @Test(groups = "smoke")*/
    @Test(retryAnalyzer = RunFailTestScripts.class)
    public void testAnnotation1() {
        driver.get("https://www.abhibus.com/");
        // Add your test assertions and actions here
    }

    @Test
    public void testAnnotation2() {
        driver.get("https://www.amazon.in/");
        // Add your test assertions and actions here
        Assert.assertFalse(true, "Failing this test intentionally.");
    }

    @Test
    public void testAnnotation3() {
        driver.get("https://www.flipkart.com/");
        // Add your test assertions and actions here
    }

    @Test
    public void testAnnotation4() {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        // Add your test assertions and actions here
    }

    @Test
    public void testAnnotation5() {
        driver.get("https://www.facebook.com/");
        // Add your test assertions and actions here
    }

    @AfterMethod
    public void afterAnnotationExample() {
        driver.quit();  // Use quit() to close the browser and free resources
    }
}

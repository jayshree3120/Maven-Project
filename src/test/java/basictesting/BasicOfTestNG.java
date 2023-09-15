package basictesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BasicOfTestNG {

    @Test(groups = "smoke")
    public void basicOfTestCase1() {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.abhibus.com/");
        driver.close();
    }

        @Test
        public void basicOfTestCase2 () {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");
            driver.close();
        }

            @Test
            public void basicOfTestCase3 () {
                ChromeOptions options = new ChromeOptions();
                options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
                WebDriver driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.get("https://www.flipkart.com/");
                driver.close();
            }
    @Test
    public void basicOfTestCase4 () {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.close();
    }

    @Test
    public void basicOfTestCase5 () {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.close();
    }

            }




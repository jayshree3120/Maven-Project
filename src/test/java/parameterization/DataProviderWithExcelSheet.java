package parameterization;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcelSheet {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origin=*");
        options.setBinary("C:\\Users\\SOPAN\\Downloads\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOPAN\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }

    @DataProvider
    public Object[][] readExcelData() throws IOException {
        return getExcelData("C:\\Users\\SOPAN\\Desktop\\DataDriven.xlsx", "testData");
    }

    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        int noOfRows = sheet.getPhysicalNumberOfRows();
        int noOfCols = sheet.getRow(0).getLastCellNum();
        String[][] data = new String[noOfRows - 1][noOfCols];

        for (int i = 1; i < noOfRows; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < noOfCols; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }

        workbook.close();
        return data;
    }

    @Test(dataProvider = "readExcelData")
    public void verifySearch(String courseName, String cityName) throws InterruptedException {
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys(courseName + " " + cityName);
        textBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }
}



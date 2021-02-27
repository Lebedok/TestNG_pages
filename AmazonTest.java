package Selenium.pages.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

    WebDriver driver;
    AmazonHomePage amazonHomePage;

    @BeforeMethod

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        amazonHomePage = new AmazonHomePage(driver);

    }

    @Test

    public  void searchTest(){
        driver.get("https://amazon.com");
        amazonHomePage.searchBox.sendKeys("MSI gaming laptop");
        amazonHomePage.searchButton.click();
    }



}

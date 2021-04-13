package testAutomationUniversity;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestWithConfiguration {

    static WebDriver driver = null;

    @BeforeTest
    public static void beforeAll(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
    public static void afterAll(){
        driver.quit();
    }

    @Test
    public static void justATest(){
        driver.get("https://ebay.co.uk");
        String expectedComTitle = "Example title";
        Assert.assertEquals(expectedComTitle, driver.getTitle());
    }
}
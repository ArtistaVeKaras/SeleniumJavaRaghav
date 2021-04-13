package testAutomationUniversity;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

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
    public static void openAndClickCheckTheTitle(){
        driver.get("://ebay.co.uk");
        String expectedTitle = "Example title";
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    @Test
    public static void openTheOrgAndClickCheckTheTitle(){
        driver.get("https://ebay.co.uk");
        Assert.assertEquals("Example domain", driver.getTitle());
    }
}
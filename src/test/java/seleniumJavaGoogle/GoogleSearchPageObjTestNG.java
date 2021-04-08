package seleniumJavaGoogle;

import googlePages.GoogleSearchPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchPageObjTestNG {

    protected static WebDriver driver = null;

    /*
     best way to setup the drivers
     for chrome and firefox
     */
    @BeforeTest
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public static void searchGoogle() {
        setUp();
        GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
        String url = "https://duckduckgo.com/";
        driver.get(url);
        searchPageObj.SearchingInputFieldQ("Kill Bill");
        searchPageObj.ClickButtonSearch();
        Assert.assertEquals(driver.getCurrentUrl(), "https://duckduckgo.com/?q=Kill+Bill&t=h_&ia=web");
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
        System.out.println("Test Completed Successful");
    }
}

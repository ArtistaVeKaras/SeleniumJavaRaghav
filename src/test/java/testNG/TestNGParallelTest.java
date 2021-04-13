package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class TestNGParallelTest {

    static WebDriver driver = null;

    @BeforeTest
    @Parameters("browserName")
    public static void setUp(String browserName) {
        System.out.println("Current browser is :" + browserName);
        System.out.println("Thread id:" +Thread.currentThread().getName());

        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
       else if (browserName.equalsIgnoreCase("ie")) {
           WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }else {
           System.out.println("Driver not found!!");
        }
    }

    @Test
    public void test()throws Exception {
        driver.get("https://google.com");
        Thread.sleep(4000);
    }
    @AfterTest
    public void TearDown(){
        driver.quit();
    }
}

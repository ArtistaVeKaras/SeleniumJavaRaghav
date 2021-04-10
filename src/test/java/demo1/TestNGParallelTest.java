package demo1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class TestNGParallelTest {

    // run tests in multi browser in parallel
    static WebDriver driver = null;

    @BeforeTest
    @Parameters("browserName")
    public static void setUp(String browserName) {

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

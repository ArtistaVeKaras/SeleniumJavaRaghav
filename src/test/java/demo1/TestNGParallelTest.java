package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class TestNGParallelTest {
    /*/
       How to run tests in multi browser
       How to run tests in multi browser in parallel
        */
    static WebDriver driver = null;
    static String projectPath = System.getProperty("user.dir");

    @BeforeTest
    @Parameters("browserName")
    public static void setUp(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath+ "\\src\\test\\java\\util\\drivers\\chrome73\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath+ "\\src\\test\\java\\util\\drivers\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
        }
       else if (browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath+ "/src/test/java/util/drivers/chromedriver.exe");
            WebDriver driver = new InternetExplorerDriver();
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

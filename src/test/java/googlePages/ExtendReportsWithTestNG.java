package googlePages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import seleniumJavaGoogle.GoogleSearchPageObjTest;

import java.io.IOException;

/*
/Doing extent Report with TestNg
 */
public class ExtendReportsWithTestNG{

    //declaring and initializing the webdriver & variables so they can be accessed globally
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    static WebDriver driver = null;
    GoogleSearchPageObjTest google = new GoogleSearchPageObjTest();

    @BeforeSuite
    public void setup (){
      htmlReporter = new ExtentHtmlReporter("extent1.html");
      extent = new ExtentReports();
      extent.attachReporter(htmlReporter);

    }
    @BeforeTest
    public void beforeTest(){
        //setting project path and firefox driver
        String projectPath = System.getProperty("user.dir");
        System.out.println("ProjectPath : "+ projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/java/util/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }
    // main Test
    @Test
    public void test1() throws IOException {
        // creates a toggle for the given test, adds all log events under it
        //This was copy and paste from the link of extent reports to save time
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        driver.get("https://google.com");
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, Going to Google website)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
    }
    @AfterTest
    public void tearDown(){
        driver.close();
        System.out.println("Test Completed Successful");
    }
    //teardown after the test finished
    @AfterSuite
    public void shutDown1(){
        extent.flush();
    }
}

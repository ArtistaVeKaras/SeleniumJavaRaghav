package googlePages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

/*
/doing extent Report with TestNg
 */
public class ExtendReportsWithTestNG {

    //declaring the variables so they can be accessed globally
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    static WebDriver driver = null;

    @BeforeSuite
    public void setup(){
      htmlReporter = new ExtentHtmlReporter("extent.html");
      extent = new ExtentReports();
      extent.attachReporter(htmlReporter);
    }
    // main Test
    @Test
    public void test1() throws IOException {
        // creates a toggle for the given test, adds all log events under it
        //This was copy and paste from the link of extent reports to save time
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
        // log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");
        // info(details)
        test.info("This step shows usage of info(details)");
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
    }
    //teardown after the test finished
    @AfterSuite
    public void tearDown1(){
        extent.flush();
    }
}

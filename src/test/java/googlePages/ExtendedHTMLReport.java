package googlePages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendedHTMLReport {

    protected WebDriver driver = null;

    @Test
    public void ebay() throws IOException {
        setUp();
        extendedHtmlReport("Ebay Search", "Launch the ebay website and perform a search");
    }

    public static void extendedHtmlReport(String testName, String testDescription) throws IOException {

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extendReports.html");
        ExtentReports      extent       = new ExtentReports();

        extent.attachReporter(htmlReporter);

        ExtentTest test = extent.createTest(testName, testDescription);

        test.log(Status.INFO, "Starting the test case");
        test.pass("Pressing the Google search box button");
        test.pass("Closing the browser");
        test.info("Test Completed");
        test.addScreencastFromPath("screenshoot.png");
        extent.flush();
    }

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://ebay.com");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

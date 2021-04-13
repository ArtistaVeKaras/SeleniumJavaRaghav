package googlePages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.io.IOException;

public class ExtendReportHtmlDemo {

    static WebDriver driver = null;

    public static void main(String[] args) throws IOException {

        /* Extended report will only generate a report once the test has passed
         * And it will also not generate inside a folder
         */

        // the purpose of the test is to test ExtendHtmlReporter functionality
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extendReports.html");

        // create extend reports and attach report(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // create a toggle test for the given test, add all the logs events under it
        ExtentTest test = extent.createTest("Google Search Test one ", "Test the google search functionality");
        test.pass("");

        //SetUp ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Using the test log object to log the test reports
        test.log(Status.INFO, "Starting the test case");
        driver.get("https://ebay.com");

        // main test with extend report
        // driver.findElement(By.name("q")).sendKeys("automation");
        // test.pass("Going into the search box and entering the automation keyword");
        // driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]"))
        // .sendKeys(Keys.RETURN);
        test.pass("Pressing the Google search box button");
        driver.close();
        test.pass("Closing the browser");
        test.info("Test Completed");

        //test with snapshot
        test.addScreencastFromPath("screenshot.png");

        // calling flash writes everything to the log file
        extent.flush();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

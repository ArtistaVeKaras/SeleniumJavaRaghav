package googlePages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtendReportHtmlDemo {

    static WebDriver driver = null;
    public static void main(String[] args) {

        //the purpose of the test is to test ExtendHtmlReporter functionality
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extend.html");
        //create extend reports and attach report(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        //create a toggle test for the given test, add all the logs events under it
        ExtentTest test = extent.createTest("Google Search Test one ", "this is to test google search functionality");
        test.pass("");

        //just copying setup driver from the other test!! This is not  good practice
        // creating an object or using the extend class would be much cleaner for the code
        String projectPath = System.getProperty("user.dir");
        System.out.println("ProjectPath : "+ projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"/src/test/java/util/drivers/geckodriver.exe");
        driver = new FirefoxDriver();

        //Using the test log object to log the test reports
        test.log(Status.INFO,"Starting the test case");
        driver.get("https://google.com");
        test.pass("Test Completed");

        //main test with extend report
        driver.findElement(By.name("q")).sendKeys("automation");
        test.pass("Going into the search box and entering the automation keyword");
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
        test.pass("Pressing the Google search box button");
        driver.close();
        test.pass("Closing the browser");
        test.info("Test Completed");

        //calling flash writes everything to the log file
        extent.flush();
    }
}

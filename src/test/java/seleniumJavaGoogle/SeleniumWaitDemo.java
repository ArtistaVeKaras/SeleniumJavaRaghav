package seleniumJavaGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import util.DriverUtil;

import java.util.concurrent.TimeUnit;

public class SeleniumWaitDemo extends DriverUtil{
   /*/
    Why we use waits
The elements load time on a web page can vary Not all the elements are loaded at the same time
In applications developed using Ajax, Javascript etc, objects on web page may load at different time
To handle this, we need to use waits in Selenium With the help of waits, we can enable the script
to wait for sometime before throwing No Such Element exception
What is implicit wait Is used to define a time (period) until when webdriver should wait before throwing No Such Element exception
Syntax :
driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
note:
By default it is set to 0
Implicit wait is applicable for the entire session of browser
What is explicit wait
Explicit waits can be set for specific elements
Can be set for a specific condition
E.g. wait until element is clickable
Syntax :
WebDriverWait wait = new WebDriverWait(driver, 10);
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("abc")));
You can set an implicit wait for entire session and
Explicit wait for certain elements where you think it needs more time or you want to wait until some specific condition is try
    */

   public static DriverUtil util = new DriverUtil();
   //static WebDriver driver = null;

@Test
   public static void SeleniumDemo(){
    String projectPath = System.getProperty("user.dir");
    System.setProperty("webdriver.gecko.driver",projectPath+"/src/test/java/util/drivers/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    driver.get("https://google.com");
    driver.findElement(By.name("q")).sendKeys("Automation");
    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

   // WebDriverWait wait = new WebDriverWait(driver, 10);
    //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("what")));
    //this test will fail as expected
}
}


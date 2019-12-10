package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import util.DriverUtil;

public class WebDriverManagers extends DriverUtil {

    /* This class provides a much simpler version of setting up chrome driver
    *  with WebDriverManagers dependencies from bonigarcia github link
    *  there is no need to set up the chromepath as well downloading the drivers
    *  NOTE: although this is very slow when running the tests
    *  The dependencies needs to be added to the pom.xml file
    * */

    // Setting up webdrivermanagers without chrome drivers
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().version("2.36").setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        driver.quit();
        googleTest();
    }

    public static void googleTest(){
        WebDriverManager.chromedriver().version("2.36").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("automation");

    }
}

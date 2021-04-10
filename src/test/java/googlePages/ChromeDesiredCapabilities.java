package googlePages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ChromeDesiredCapabilities {
    /*
     * This cover how to set chrome capabilities withe the same test
     * Note: my chrome driver is not compatible with this version of selenium
     * Chrome version needs to be between 70 73 :-(
     */

    static WebDriver driver = null;

    public static void main(String[] args) {

        //Setting up chrome capabilities adding arguments as: start-maximized
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("excludeSwitches" , Arrays.asList("disable-pop-blocking"));

        //setting up chrome driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver = new ChromeDriver(options);

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("ABC");
        driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
        driver.close();
        driver.quit();
    }
}

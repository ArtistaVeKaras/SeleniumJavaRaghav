package seleniumJavaGoogle;

import googlePages.googleSearchText;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverManagers extends googleSearchText {

    /* This class provides a much simpler version of setting up chrome driver
     *  with WebDriverManagers dependencies from bonigarcia github link
     *  there is no need to set up the chromepath as well downloading the drivers
     *  NOTE: this is very slow when running the tests
     *  The dependencies needs to be added to the pom.xml file
     * */

    //setting a private/public driver
    public static WebDriver driver = null;

    public static void main(String[] args) {

        setDrivers();
        searchingGoogleAutomation();
    }

    // Launching the url
    public static void searchingGoogleAutomation() {

        String url = "https://duckduckgo.com/";
        driver.get(url);
        googleSearchText.searchingQField(driver).sendKeys("automation");
        googleSearchText.searchButtonClick(driver).sendKeys(Keys.RETURN);
    }

    // Setting up WebDriverManagers without downloading the exe drivers
    public static void setDrivers() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        //WebDriverManager.chromedriver().version("2.36").setup();
        //WebDriver driver = new ChromeDriver();

    }
}

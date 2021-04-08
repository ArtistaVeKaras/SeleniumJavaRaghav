package seleniumJavaGoogle;

import googlePages.GoogleSearchPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageObjTest {

    public static WebDriver driver = null;

    public static void main(String[] args) {
        searchGoogleTest();
    }

    public static void searchGoogleTest() {
        setUp();
        GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
        String url = "https://duckduckgo.com/";
        driver.get(url);
        searchPageObj.SearchingInputFieldQ("Kill Bill");
        searchPageObj.ClickButtonSearch();
    }

    // Just to prove a point that the above example can be simplified
    //by removing all those lines of code
    public static void setUp() {

        WebDriverManager.firefoxdriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("dogs and cats");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
        driver.close();
    }
}

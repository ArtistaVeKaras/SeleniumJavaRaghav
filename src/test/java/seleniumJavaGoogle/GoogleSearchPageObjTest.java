package seleniumJavaGoogle;

import googlePages.GoogleSearchPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchPageObjTest {

    public  static WebDriver driver = null;
    public static void main(String[] args) {
       searchGoogleTest();
    }
    public static void searchGoogleTest(){

        String projectPath = System.getProperty("user.dir");
        System.out.println("ProjectPath : "+ projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"\\src\\test\\java\\util\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
        String url = "https://duckduckgo.com/";
        driver.get(url);
        searchPageObj.SearchingInputFieldQ("Kill Bill");
        searchPageObj.ClickButtonSearch();
        //driver.close();
    }
}

package seleniumJavaGoogle;

import googlePages.GoogleSearchPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchPageObjTestNG {

    static WebDriver driver = null;
    public void DemoTest() {

    }
    /*
    /possible the best way to setup the drivers
     */
    @BeforeTest
    public static void setUp(){
        String projectPath = System.getProperty("user.dir");
        System.out.println("ProjectPath : "+ projectPath);
        System.setProperty("webdriver.gecko.driver", projectPath+"\\src\\test\\java\\util\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public static void searchGoogleTest(){
        setUp();
        GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
        String url = "https://duckduckgo.com/";
        driver.get(url);
        searchPageObj.SearchingInputFieldQ("Kill Bill");
        searchPageObj.ClickButtonSearch();
    }

    @AfterTest
    public void tearDwon(){
        //driver.close();
        //driver.quit();
        System.out.println("Test Completed Succesful");
    }
}

package applitools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Applitools {

    public static final String API_KEY = "X3Eo101KLteLrZB8FvLd100MTPoEedfGHU97pqxIrG2Ui3Jw110";

   static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        /*
          Link to perform Cross-browser Visual Testing
          https://applitools.com/blog/how-to-do-cross-browser-visual-testing-with/
         */

        System.setProperty("webdriver.chrome.driver", "src/test/java/util/drivers/chromedriver.exe");
//        WebDriverManager.chromedriver.exe().setup();
        driver = new ChromeDriver();
//        Eyes eyes = new Eyes();
        // This is your api key, make sure you use it in all your tests.
//        eyes.setApiKey(API_KEY);


        try {
            // Start visual UI testing
//            eyes.open("Hello World!","VisualTesting with BrowserStack",
//            new RectangleSize(800, 600));

            //Navigate to applitools webpage
            driver.get("https://applitools.com/helloworld");

            // Visual validation point #1
//            eyes.checkImage("helloworld");
            driver.findElement(By.name("button")).click();
            // Visual validation point #2
//            eyes.checkImage("Click");

            // End visual UI testing. Validate visual correctness.
//            eyes.close();
        } finally {
//            eyes.abortIfNotClosed();
            driver.quit();
        }
    }

    /* Ultrafast Grip Applitools
    *
     */
//    public static void ultraFastTest(WebDriver webDriver, Eyes eyes) {
//        // Navigate to the url we want to test
//        webDriver.get("https://demo.applitools.com");
//
//        // Call Open on eyes to initialize a test session
//        eyes.open( "Demo App", "Ultrafast grid demo", new RectangleSize(800, 600));
//
//        // check the login page
//        eyes.checkImage(Target.window().fully().withName("Login page"));
//
//        webDriver.findElement(By.id("log-in")).click();
//
//        // Check the app page
////        eyes.check(Target.window().fully().withName("App page"));
//
//        // Call Close on eyes to let the server know it should display the results
////        eyes.closeAsync();
//    }

}


//~ Formatted by Jindent --- http://www.jindent.com

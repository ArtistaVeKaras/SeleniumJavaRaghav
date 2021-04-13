package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessChromeDemo {
    /*
    /What are Headless Browsers
Headless Browsers are web browsers without a head or GUI (Graphical User Interface)
i.e. you cannot see anything on your screen, programs runs at backend.
Headless Browsers are software programs that access the web pages but do not show them to the user.
Headless Chrome
Html Unit Browser
Zombie.js
PhantomJS
TrifleJS
SlimmerJS
Running your test on a headless systems like linux os without gui.
When you want simulate multiple browser behaviour on a single machine.
To use minimal resources (because there is no GUI)
Need to run your test just for data creation
When should we NOT use Headless Browsers
Headless Browsers should not/cannot be used:
If you need to visually observe your test on the browser
It does not give you exact feedback of what your customers will actually experience on your website (Page loading speeds ...etc)
Headless Browsers sometimes may throw errors that is not observed on real browsers
Examples of Headless Browsers
https://gist.github.com/evandrix/3694955
Helpful Tips
You can use actual browsers on a headless machine
Real browsers can run in headless manner on systems with Linux with zero configurations. CI systems like Jenkins can be used.
Read about Xvfb - X virtual frame buffer
It is a display server that performs all graphical operations in memory without showing anything on the screen.
Therefore it does not require the system to have a screen or gui.
https://en.wikipedia.org/wiki/Xvfb
https://wiki.jenkins-ci.org/display/J...
http://stackoverflow.com/questions/31...
HtmlUnit browser can be run with Web Driver and not with Selenium RC.
     */

    @Test
    public void test(){
    	
        //The path needs to inspected C: does not exist in the linux system!!
        System.setProperty("webdriver.chrome.driver","/Users/claud/AutomationProjects/inteljProject/src/test/java/chrome73/chromedriver.exe");

        //Adding a headless argument this will be passed as an argument
        ChromeOptions options = new ChromeOptions();
        options.addArguments("Headless");
        WebDriver driver = new ChromeDriver(options);

        //going to google page and perform a search!!
        //maximising the window will cause the test to take longer to execute
        //driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.print(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("Automation");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
        driver.close();
        System.out.print("Test Completed");
    }
}

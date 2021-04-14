package docker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class DockerChromeTest {

    @Test
    public static void testDocker() throws MalformedURLException, InterruptedException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.CHROME);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);

        driver.get("https://hub.docker.com");

        Thread.sleep(4000);

        driver.quit();
    }
}

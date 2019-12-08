package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.DriverUtil;

import java.util.concurrent.TimeUnit;

public class LoginPages extends DriverUtil {

  //declaring the global variables by using the By class from Selenium
  public static By UsernameTextField = By.id("usernamelogin");
  public static By PasswordTextField = By.id("loginPassword");
  public static By LoginButton = By.id("LoginBtn");
  String BaseUrl = "http://test001-automatetillinfinity.co.uk/"; // instantiate the variable

    public void launchurl() throws InterruptedException { //creating a method to launch the url
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(BaseUrl);
    }

    public void username() {
        driver.findElement(UsernameTextField).sendKeys("Montego001");
    }

    public void usernameRegx(String testdata) {
        driver.findElement(UsernameTextField).sendKeys(testdata);
    }

    public void passwordRegx(String testdata)    {
        driver.findElement(PasswordTextField).sendKeys(testdata);  }

    public void loginbtn()
    {
        driver.findElement(LoginButton).click();
    }

    public void confirmHomePage () throws InterruptedException{
        Thread.sleep(5000);

       //confirm page method by using the assertion class
        String expectedTitle = "WEG Group";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

   }
}


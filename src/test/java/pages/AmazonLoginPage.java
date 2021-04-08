package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import util.DriverUtil;
import java.util.concurrent.TimeUnit;


public class AmazonLoginPage extends DriverUtil {

DriverUtil driverUtil = new DriverUtil();

    public static By usernameInput = By.name("email");
    public static By passwordInput = By.id("ap_password");
    public static By continueButton = By.id("continue");
    public static By SignInButton  = By.id("signInSubmit");
    String url = "https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1";

    public void launchAmazonUrl(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);

    }
    public void AmazonLoginPage(){
        String expectedTitle = driver.getTitle();
        String actulTitle = "Amazon Sign-In";
        Assert.assertEquals(expectedTitle, actulTitle);
        System.out.println(expectedTitle);
    }

    public void usernameAmazon(){
     driver.findElement(usernameInput).sendKeys("claudiooartista@hotmail.co.uk");

    }
    public void clickButtonAfterUserName(){
       driver.findElement(continueButton).click();

    }
    public void passwordInput(){
        driver.findElement(passwordInput).sendKeys("portugal");

    }
    public void SignInButton(){
        driver.findElement(SignInButton).click();
    }
    public void AmazonMainPage(){
            String expectedTitle = driver.getTitle();
            String actulTitle    = "Your Amazon.co.uk";
            Assert.assertEquals(expectedTitle, actulTitle);
    }
}

package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import pages.AmazonLoginPage;
import util.DriverUtil;

public class AmazonLoginSteps extends DriverUtil {

   DriverUtil driverUtil = new DriverUtil();
   AmazonLoginPage amwLoginPage = new AmazonLoginPage();

   @Before
   public void startSession(){
       driverUtil.setdrivers("firefox");
       //amwLoginPage.launchAmazonUrl();
   }

    @Given("^The user is the Login page$")
    public void the_user_is_the_Login_page() throws Throwable {
        amwLoginPage.launchAmazonUrl();
        amwLoginPage.AmazonLoginPage();
    }

    @When("^The user enter the username$")
    public void the_user_enter_the_username() throws Throwable {
        amwLoginPage.usernameAmazon();
    }

    @When("^The use clicks the continue button$")
    public void the_use_clicks_the_continue_button() throws Throwable {
       amwLoginPage.clickButtonAfterUserName();
    }

    @When("^The user enter the password$")
    public void the_user_enter_the_password() throws Throwable {
       amwLoginPage.passwordInput();
    }

    @When("^The user clicks the sign in button$")
    public void the_user_clicks_the_sign_in_button() throws Throwable {
       amwLoginPage.SignInButton();
    }

    @Then("^The use should be in the main page!!$")
    public void the_use_should_be_in_the_main_page() throws Throwable {
        amwLoginPage.AmazonMainPage();
    }
}

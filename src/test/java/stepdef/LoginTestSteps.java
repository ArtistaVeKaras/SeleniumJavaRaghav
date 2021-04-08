package stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPages;
import util.DriverUtil;

public class LoginTestSteps  {

    LoginPages loginpage = new LoginPages();
    DriverUtil driverutil = new DriverUtil();

    @Before
    public void starsession() {
        driverutil.setdrivers("firefox");
    }

    @Given("^am on the landing Page$")
    public void am_on_the_landing_Page() throws Throwable {
        loginpage.launchurl();
    }

    @When("^I enter my username and password$")
    public void iEnterMyUsernameAndPassword() throws Throwable {
         loginpage.username();
         //loginpage.passwordRegx();
    }

    @And("^I click the login button$")
    public void iClickTheLoginButton() throws Throwable {
        loginpage.loginbtn();
    }
    @Then("^am on the Home Page$")
    public void am_on_the_Home_Page() throws Throwable {
       // loginpage.confirmHomePage();
    }

    @After
    public void closeSession (){
        driverutil.tearDown();
    }
}

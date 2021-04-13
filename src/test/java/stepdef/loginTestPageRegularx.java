package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPages;

public class loginTestPageRegularx {

    LoginPages loginPageRex = new LoginPages();

    @Given("^am on the login page$")
    public void am_on_the_login_page() throws Throwable {
        loginPageRex.launchurl();

    }

    @When("^I enter my \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_enter_my_as(String value, String data) throws Throwable {
        if (value.equals("username")){
           loginPageRex.usernameRegx(data);

        } if (value.equals("password")){
           loginPageRex.passwordRegx(data);
           Thread.sleep(2000);

        } else {

            System.out.println("test not found");
        }
    }

    @And("^I click  login button$")
    public void iClickLoginButton() throws Throwable {
         loginPageRex.loginbtn();

    }

    @Then("^I shoud be on the login page$")
    public void shouldBeOnTheLoginPage() throws Throwable {

    }
}

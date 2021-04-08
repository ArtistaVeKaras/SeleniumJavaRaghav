package stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPages;


public class ScenarioOutlineExTable {

    LoginPages loginpage = new LoginPages();

    @When("^I enter mi \"([^\"]*)\" as \"([^\"]*)\" in the textfield$")
    public void iEnterMiAsInTheTextfield(String data, String value) throws Throwable {
        if(data.equalsIgnoreCase("Username")){
         loginpage.usernameRegx(value);
        }
        if (data.equalsIgnoreCase("Passwword")){
            loginpage.passwordRegx(value);
        } else{

            System.out.print("keyword not found");
        }
    }

    @And("^I click the on login button$")
    public void iClickTheOnLoginButton() throws Throwable {
        loginpage.loginbtn();

    }

    @Then("^I should be on home page$")
    public void iShouldBeOnHomePage() throws Throwable {


    }


}

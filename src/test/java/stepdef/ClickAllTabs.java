package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.ClickAllTabPage;
import pages.LoginPages;


public class ClickAllTabs {

   LoginPages loginpage = new LoginPages();
   ClickAllTabPage clickalltabs = new ClickAllTabPage();


    @Given("^am on the \"([^\"]*)\"$")
    public void am_on_the(String data) throws Throwable {
        if(data.equalsIgnoreCase("Home Page")){
            loginpage.confirmHomePage();
        }
        if(data.equalsIgnoreCase("ABTUS Page")){
            clickalltabs.confirmAboutusPage();
        }
            else {
            System.out.println("data not valid ");
        }
    }

    @When("^I click \"([^\"]*)\" Tab$")
    public void i_click_Tab(String value) throws Throwable {
        switch (value){
            case  "TYJ":
                clickalltabs.tradeYourJet();
                break;
            case  "BYJ":
                clickalltabs.bookYourJet();
                break;
            case  "JT":
                clickalltabs.justTrade();
                break;
            case  "ABTUS":
                clickalltabs.aboutUs();
                break;
            default: System.out.println("System not valid");

        }
    }




}
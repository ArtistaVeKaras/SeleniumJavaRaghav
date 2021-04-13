package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import util.DriverUtil;

public class VerifyLoginLogoutSteps extends DriverUtil {

    DriverUtil driverutil = new DriverUtil();

//    why do you need to create an object?
//    creating an object will give you access to all the methods of that particular class

    @Given("^am on the \"([^\"]*)\" page and the title is \"([^\"]*)\"$")
    public void am_on_the_page_and_the_title_is(String value, String data) {
      switch (value){
        case "Login":
            String actualLoginPageTitle = driver.getTitle();
            String expectedLoginPageTitle = data;
            Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle);
            break;

    }
      }


    @When("^I enter \"([^\"]*)\" in the textfield as \"([^\"]*)\"$")
    public void i_enter_in_the_textfield_as(String param, String data) throws Throwable {
     if(param.equalsIgnoreCase("username")){
         driver.findElement(By.name("username")).sendKeys(data);
     }if (param.equalsIgnoreCase("password")){
         driver.findElement(By.name("password")).sendKeys(data);
        }else{
         System.out.println("data not found");
        }
    }


    @When("^I click  \"([^\"]*)\" button on the \"([^\"]*)\" page$")
    public void i_click_button_on_the_page(String arg1) throws Throwable {
       driver.findElement(By.id("LoginBtn")).click();
    }

    @Then("^I should on the \"([^\"]*)\" page and the title is displayed as \"([^\"]*)\"$")
    public void i_should_on_the_page_and_the_title_is_displayed_as(String keyword, String title) throws Throwable {
        if(keyword.equalsIgnoreCase("Home")) {
            String actualTitlePage = driver.getTitle();
            String expectedTitlePage = title;
            Assert.assertEquals(actualTitlePage, expectedTitlePage);
        }

    }

}

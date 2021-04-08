package stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import pages.DataTablePages;

public class DataTable {


    DataTablePages datatable = new DataTablePages();


    @When("^I enter my Username and Password details as below$")
    public void iEnterMyUsernameAndPasswordDetailsAsBelow(cucumber.api.DataTable usernamedetails) throws Throwable {

        datatable.multipleData(usernamedetails);
    }
}

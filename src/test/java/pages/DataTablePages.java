package pages;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import util.DriverUtil;

import java.util.List;

public class DataTablePages extends DriverUtil {

    By usernameTextField = By.id("usernamelogin");
    By passwordTextField = By.id("loginPassword");

    public void multipleData(DataTable MyData){

        List<List<String>> data = MyData.raw();
        driver.findElement(usernameTextField).sendKeys(data.get(0).get(0));
        driver.findElement(passwordTextField).sendKeys(data.get(0).get(1));

    }
}

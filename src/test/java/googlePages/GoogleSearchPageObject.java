package googlePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

protected WebDriver driver =null;
private final By SearchFiledInput = By.xpath("//*[@id=\"search_form_input_homepage\"]");
private final By ClickButton = By.id("search_button_homepage");

public GoogleSearchPageObject(WebDriver driver){
    this.driver = driver;
}

public void SearchingInputFieldQ(String test){
    driver.findElement(SearchFiledInput).sendKeys(test);
 }

 public void ClickButtonSearch(){
    driver.findElement(ClickButton).sendKeys(Keys.RETURN);
 }
}

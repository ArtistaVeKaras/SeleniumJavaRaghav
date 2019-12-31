package googlePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleSearchText {

 private static  WebElement element = null;
    public static WebElement searchingQField(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"search_form_input_homepage\"]"));
        return element;
    }
   public static WebElement searchButtonClick(WebDriver driver){
        driver.findElement(By.id("search_button_homepage"));
        return element;
   }
}

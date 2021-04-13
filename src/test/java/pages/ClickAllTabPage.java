package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.DriverUtil;

public class ClickAllTabPage  extends DriverUtil {

    LoginPages loginPage = new LoginPages();

    By tradeYourJetrjet = By.id("TradeYourJet");// search for this element on the web inspect element
    By bookYourJet  = By.id("bookyourjettab");
    By justTrade    = By.id("justtradetab");
    By aboutUs      = By.id("aboutustab");
    By confirmAboutUs = By.cssSelector(".content-header");// why the css.selector and not element??

    public void launchur() throws InterruptedException {
        loginPage.launchurl();
    }

    public void tradeYourJet() throws InterruptedException{
        driver.findElement(tradeYourJetrjet).click();
    }
    public void bookYourJet() throws InterruptedException  {
        driver.findElement(bookYourJet).click();
    }
    public void justTrade() throws InterruptedException   {
        driver.findElement(justTrade).click();
    }
    public void aboutUs()    throws InterruptedException  {
        driver.findElement(aboutUs).click();
    }

    public void confirmAboutusPage() {

        Boolean actualTitle = driver.findElement(confirmAboutUs).isDisplayed();
        String expectedTitle = "";
        Assert.assertEquals(expectedTitle, actualTitle);

    }


}

package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import util.DriverUtil;

public class ClickAllTabPage  extends DriverUtil {

    LoginPages loginPage = new LoginPages();

    By tradeyourjet = By.id("TradeYourJet");// search for this element on the web inspect element
    By bookyourjet  = By.id("bookyourjettab");
    By justtrade    = By.id("justtradetab");
    By aboutus      = By.id("aboutustab");
    By confirmaboutus = By.cssSelector(".content-header");// why the css.selector and not element??

    public void launchur() throws InterruptedException {
        loginPage.launchurl();
    }

    public void tradeYourJet() throws InterruptedException{
        driver.findElement(tradeyourjet).click();
    }
    public void bookYourJet() throws InterruptedException  {
        driver.findElement(bookyourjet).click();
    }
    public void justTrade() throws InterruptedException   {
        driver.findElement(justtrade).click();
    }
    public void aboutUs()    throws InterruptedException  {
        driver.findElement(aboutus).click();
    }

    public void confirmAboutusPage() {

        Boolean actualTitle = driver.findElement(confirmaboutus).isDisplayed();
        boolean expectedTitle = true;
        Assert.assertEquals(actualTitle, expectedTitle);

    }


}

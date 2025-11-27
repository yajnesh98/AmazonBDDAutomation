package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.BaseClass;
import org.testng.Assert;
import utils.WaitUtils;

import java.time.Duration;


public class LoginPage extends BaseClass {

    private By amazonTagName = By.id("nav-logo-sprites");
    private By searchBar = By.id("twotabsearchtextbox");
    private By searchIcon = By.id("nav-search-submit-button");
    private By searchIQOO = By.xpath("//*[contains(text(),'iQOO')]");


    public void launchAmazon_Url() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        System.out.println("Amazon app is launched");
        WaitUtils.waitForSometime(2);
    }

    public void amazonTag(){
        WebElement amazontn = driver.findElement(amazonTagName);
        if(amazontn.isDisplayed()){
            System.out.println("Amazon web page is displayed");
        }else{
            System.out.print("Amazon web page is not displayed");
        }
    }

    public void verifySearchBox(){
        WebElement searchfield = driver.findElement(searchBar);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.textToBePresentInElementLocated(
//                By.id("message"),
//                "Success"));
       wait.until(ExpectedConditions.visibilityOf(searchfield));
       if(searchfield.isDisplayed()){
           System.out.println("Search Box is Visible");
       }else{
           System.out.println("Search Box is not Visible");
       }
    }

    public void enterInSearchbox(String textInput){
        WebElement searchBoxInput = driver.findElement(searchBar);
        //wait.until(ExpectedConditions.textToBePresentInElementLocated(searchBar, "Mobile"));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar)).sendKeys("Mobile");
        searchBoxInput.sendKeys(textInput);
        System.out.println("User Entered in Search Box");
        WaitUtils.waitForSometime(3);
    }

    public void verifyAndClickSearchIcon(){
        WebElement searchBoxInput = driver.findElement(searchIcon);
        if(searchBoxInput.isDisplayed()){
            System.out.println("Search Icon is Visible");
            try {
                searchBoxInput.click();
                System.out.println("Search Icon is clicked");
            } catch (Exception e) {
                System.out.println("Search Icon is not clicked");
                Assert.fail("Search Icon is not clicked");
            }
        }else{
            System.out.println("Search Icon is not Visible");
        }
        WaitUtils.waitForSometime(3);
    }

    public void searchIQOO(String mobile){
        WebElement searchIQ = driver.findElement(searchIQOO);
        if(searchIQ.isDisplayed()){
            System.out.println("IQOO Phone is Visible");
            try {
                searchIQ.click();
                System.out.println("IQOO Phone is clicked");
            } catch (Exception e) {
                System.out.println("IQOO Phone is not clicked");
                Assert.fail("IQOO Phone is not clicked");
            }
        }else{
            System.out.println("IQOO Phone is not Visible");
        }
        WaitUtils.waitForSometime(3);
    }
}

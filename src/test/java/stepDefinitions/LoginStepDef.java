package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClass.LoginPage;

public class LoginStepDef {

    LoginPage lp = new LoginPage();

    @Given("Launch the browser using amazon url")
    public void launch_the_browser_using_amazon_url() throws InterruptedException {
        lp.launchAmazon_Url();
    }

    @Then("Amazon web page is displayed")
    public void amazonWebPageIsDisplayed() {
        lp.amazonTag();
    }

    @And("Check search tab is displayed")
    public void checkSearchTabIsDisplayed() {
         lp.verifySearchBox();
    }

    @When("User enter {string} in search tab")
    public void userEnterInSearchTab(String textInput) {
        lp.enterInSearchbox(textInput);
    }

    @Then("Verify and click on Search Icon")
    public void verifyAndClickOnSearchIcon() {
        lp.verifyAndClickSearchIcon();
    }

    @When("User clicked {string} phone")
    public void userClickedPhone(String textInput) {
        lp.searchIQOO(textInput);
    }
}

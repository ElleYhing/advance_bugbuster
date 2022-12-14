package step_definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommomPage;
import pages.HomePage;
import utils.BrowserUtils;

public class HomeSteps implements CommomPage {
    HomePage page;
    public HomeSteps() {
        page = new HomePage();

    }
    @Given("I open url of homepage")
    public void iOpenUrlOfHomepage() {
        BrowserUtils.getDriver();
    }

    @Then("Verify header text is {string}")
    public void verifyHeaderTextIs(String headerTxt) {
        BrowserUtils.assertEquals(BrowserUtils.getDriver().getTitle(), headerTxt);
    }
}

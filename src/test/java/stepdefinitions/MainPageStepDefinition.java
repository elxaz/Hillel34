package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MainPageSteps;

public class MainPageStepDefinition {

    @Steps
    MainPageSteps mainPageSteps;

    @Given("^I access main page \"([^\"]*)\"$")
    public void i_access_main_page(String arg1) {
        mainPageSteps.goToMainPage();
    }

    @When("^I click at Advanced Search$")
    public void i_click_at_Advanced_Search() {
        mainPageSteps.clickToAdvancedSearch();
    }

}

package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.AdvancedSearchPageSteps;

public class AdvancedSearchPageDefinition {

    @Steps
    AdvancedSearchPageSteps advancedSearchSteps;

    @Given("^Advanced Search$")
    public void advanced_Search() {
        advancedSearchSteps.isAdvancedSearch();
    }

    @When("^I choose followed categories$")
    public void i_choose_followed_categories() {
        advancedSearchSteps.choosingAllTheCategories();
    }

    @When("^Click at search button$")
    public void click_at_search_button() {
        advancedSearchSteps.clickAtSearchButton();
    }

}

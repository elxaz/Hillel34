package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ListOfCarsSteps;


public class ListOfCarsDefinition {

    @Steps
    ListOfCarsSteps listOfCarsSteps;

    @Given("^List of cars by followed categories$")
    public void list_of_cars_by_followed_categories() {
        listOfCarsSteps.isListOfCars();
    }

    @When("^I click to the first car of the list$")
    public void i_click_to_the_first_car_of_the_list() {
        listOfCarsSteps.clickOnTheFirstCar();
    }

    @Then("^I can see its page$")
    public void i_can_see_its_page() {
        listOfCarsSteps.isCarPage();
    }

}

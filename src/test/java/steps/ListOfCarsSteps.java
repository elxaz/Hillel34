package steps;

import org.junit.Assert;
import pages.ListOfCarsPage;

public class ListOfCarsSteps {

    ListOfCarsPage listOfCarsPage;

    public void isListOfCars () {
        Assert.assertTrue(listOfCarsPage.isSearch.isDisplayed());
    }

    public void clickOnTheFirstCar () {
        listOfCarsPage.firstCar.click();
    }

    public void isCarPage() {
        Assert.assertTrue(listOfCarsPage.isCar.isDisplayed());
    }

}

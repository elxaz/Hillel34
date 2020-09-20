package steps;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.AdvancedSearchPage;

public class AdvancedSearchPageSteps {

    AdvancedSearchPage advancedSearchPage;


    public void isAdvancedSearch() {
        Assert.assertTrue(advancedSearchPage.isAdvancedSearch.isDisplayed());
    }

    public void choosingAllTheCategories() {
        WebDriver webdriver = advancedSearchPage.getDriver();
        JavascriptExecutor jse = (JavascriptExecutor) webdriver;
        advancedSearchPage.previouslyUsedCheck.click();
        advancedSearchPage.sedanCheck.click();
        advancedSearchPage.hatchbackCheck.click();
        advancedSearchPage.compartmentCheck.click();
        advancedSearchPage.countrySelect.click();
        advancedSearchPage.countrySelectChoose.click();
        advancedSearchPage.priceFromField.sendKeys("1000");
        advancedSearchPage.priceToField.sendKeys("10000");
        advancedSearchPage.bargainingCheck.click();
        jse.executeScript("arguments[0].click()", advancedSearchPage.patrolCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.dieselCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.gasolineCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.electricCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.mechanicCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.automaticCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.fullDriveCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.frontWheelDriveCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.backWheelDriveCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.sortingCheck);
        jse.executeScript("arguments[0].click()", advancedSearchPage.countOnPageCheck);

    }

    public void clickAtSearchButton() {
        advancedSearchPage.searchButton.click();
    }
}

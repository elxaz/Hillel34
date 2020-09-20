package steps;

import pages.MainPage;

public class MainPageSteps {

    MainPage mainPage;

    public void goToMainPage() {
        mainPage.open();
    }

    public void clickToAdvancedSearch() {
        mainPage.advancedSearchButton.click();
    }

}

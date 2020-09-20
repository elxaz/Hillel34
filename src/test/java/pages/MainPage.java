package pages;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @FindBy(xpath = "//a[@class='ext-end']//span")
    public WebElement advancedSearchButton;

}

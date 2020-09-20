package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/uk/advanced-search/?indexName=auto&country.origin.id[0]=643&categories.main.id=1&region.id[0]=10&region.id[1]=12&body.id[0]=3&body.id[1]=4&body.id[2]=6&price.USD.gte=1000&price.USD.lte=10000&fuel.id[0]=1&fuel.id[1]=2&fuel.id[2]=3&fuel.id[3]=6&fuel.id[4]=8&fuel.id[5]=9&gearbox.id[0]=1&gearbox.id[1]=2&gearbox.id[2]=3&gearbox.id[3]=4&gearbox.id[4]=5&drive.id[0]=1&drive.id[1]=2&drive.id[2]=3&sort[0].order=price.asc&auction=1/")
public class AdvancedSearchPage extends PageObject {

    @FindBy(xpath = "//div[@class='app-content extended']//h1")
    public WebElement isAdvancedSearch;

    @FindBy(xpath = "//div[@class='rows check__vin']//label[2]")
    public WebElement previouslyUsedCheck;

    @FindBy(xpath = "//div[@class='boxed checked-list three-col']//label[2]")
    public WebElement sedanCheck;

    @FindBy(xpath = "//div[@class='boxed checked-list three-col']//label[3]")
    public WebElement hatchbackCheck;

    @FindBy(xpath = "//div[@class='boxed checked-list three-col']//label[5]")
    public WebElement compartmentCheck;

    @FindBy(xpath = "//select[@id='at_country']")
    public WebElement countrySelect;

    @FindBy(xpath = "//select[@id='at_country']//option[42]")
    public WebElement countrySelectChoose;

    @FindBy(xpath = "//input[@id='at_price-from']")
    public WebElement priceFromField;

    @FindBy(xpath = "//input[@id='at_price-to']")
    public WebElement priceToField;

    @FindBy(xpath = "//body/div[@id='app']/div/div[@class='app-content extended']/form[@class='ext-item']/section[@class='rows']/div[@class='indent']/div/div[1]/label[1]")
    public WebElement bargainingCheck;

    @FindBy(xpath = "//label[contains(text(), 'Бензин')]")
    public WebElement patrolCheck;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/section[5]/div[1]/div[1]/div[1]/input[2]")
    public WebElement dieselCheck;

    @FindBy(xpath = "//section[5]//div[1]//div[1]//div[1]//label[3]")
    public WebElement gasolineCheck;

    @FindBy(xpath = "//div[@id='gearBlock']//div[@class='indent']//label[1]")
    public WebElement electricCheck;

    @FindBy(xpath = "//div[@id='gearBlock']//div[@class='indent']//label[1]")
    public WebElement mechanicCheck;

    @FindBy(xpath = "//div[@id='gearBlock']//label[2]")
    public WebElement automaticCheck;

    @FindBy(xpath = "//div[@id='drive']//label[1]")
    public WebElement fullDriveCheck;

    @FindBy(xpath = "//div[@id='drive']//label[2]")
    public WebElement frontWheelDriveCheck;

    @FindBy(xpath = "//div[@id='drive']//label[3]")
    public WebElement backWheelDriveCheck;

    @FindBy(xpath = "//section[6]//div[1]//div[1]//div[1]//label[2]")
    public WebElement sortingCheck;

    @FindBy(xpath = "//input[@id='countpage-10']")
    public WebElement countOnPageCheck;

    @FindBy(xpath = "//button[@class='button small']")
    public WebElement searchButton;

}


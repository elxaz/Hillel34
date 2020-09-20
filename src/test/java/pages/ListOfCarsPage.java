package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/uk/search/?indexName=auto&country.origin.id[0]=643&categories.main.id=1&region.id[0]=10&region.id[1]=12&body.id[0]=3&body.id[1]=4&body.id[2]=6&price.USD.gte=1000&price.USD.lte=10000&fuel.id[0]=1&fuel.id[1]=2&fuel.id[2]=3&fuel.id[3]=6&fuel.id[4]=8&fuel.id[5]=9&gearbox.id[0]=1&gearbox.id[1]=2&gearbox.id[2]=3&gearbox.id[3]=4&gearbox.id[4]=5&drive.id[0]=1&drive.id[1]=2&drive.id[2]=3&sort[0].order=price.asc&auction=1/")
public class ListOfCarsPage extends PageObject {

    @FindBy(xpath = "//a[@id='topFilterLinkToAdvancedSearch']")
    public WebElement isSearch;

    @FindBy(xpath = "//section//section[1]//div[4]//div[2]//div[1]//div[1]//a[1]//span[1]")
    public WebElement firstCar;

    @FindBy(xpath = "//section[@id='userInfoBlock']//div[@class='seller_info_title grey']")
    public WebElement isCar;

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class YandexMarketElectronicsPage {

    @FindBy(xpath = "//div[@data-apiary-widget-name='@MarketNode/NavigationTree']")
    public WebElement blockSubItems;
    public YandexMarketElectronicsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void marketCategoryPage (String itemName) {
        blockSubItems.findElement(By.xpath("//a[@class='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS' and text()='" + itemName + "']")).click();
    }

}
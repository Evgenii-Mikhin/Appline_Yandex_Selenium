package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import steps.BaseSteps;

public class YandexMarketMainPage {
    @FindBy(xpath = "//span[contains(text(),'Электроника')]")
    public WebElement electronicaButton;

    public YandexMarketMainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public void selectMenuItems(String itemName) {
       // PageFactory.initElements(BaseSteps.getDriver(), this);
       // WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), Integer.parseInt(TestProperties.getInstance().getProperties().getProperty("defaultTimeout")));
      //  wait.until(ExpectedConditions.visibilityOf(electronicaButton));
        //electronicaButton.click();
        electronicaButton.findElement(By.xpath("//span[contains(text(),'" + itemName+ "')]")).click();

   }}


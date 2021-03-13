package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;
import util.TestProperties;

import java.util.List;

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
        //JavascriptExecutor js = (JavascriptExecutor) BaseSteps.getDriver();
       // js.executeScript("arguments[0].click()", electronicaButton);
        //return this;

   }}


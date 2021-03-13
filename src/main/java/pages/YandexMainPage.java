package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.ArrayList;
import java.util.List;

public class YandexMainPage {
    @FindBy(xpath = "//div[contains(text(),'Маркет')]")
    public WebElement marketButton;

    public YandexMainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMarketButton() {
        marketButton.click();
        List<String> tabs = new ArrayList(BaseSteps.getDriver().getWindowHandles());
       // String mainTab = BaseSteps.getDriver().getWindowHandle(); //Запомнить текущее окно
        BaseSteps.getDriver().switchTo().window(tabs.get(0));
        BaseSteps.getDriver().close();
        BaseSteps.getDriver().switchTo().window(tabs.get(1));
        //for (String windowHandle : BaseSteps.getDriver().getWindowHandles()) { //данный метод позволяет вернуть имена всех окон котрые открыты и переключатся на новое окно. таким образом мы перелючимся на последнее окно
         //   BaseSteps.getDriver().switchTo().window(windowHandle);

        }
    }

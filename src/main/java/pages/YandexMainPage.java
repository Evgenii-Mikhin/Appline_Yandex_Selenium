package pages;
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
        List<String> tabs = new ArrayList(BaseSteps.getDriver().getWindowHandles()); //Перейти на новое окно
        BaseSteps.getDriver().switchTo().window(tabs.get(0));
        BaseSteps.getDriver().close();
        BaseSteps.getDriver().switchTo().window(tabs.get(1));

        }
    }

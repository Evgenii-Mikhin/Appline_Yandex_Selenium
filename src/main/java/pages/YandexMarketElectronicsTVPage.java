package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class YandexMarketElectronicsTVPage {
    @FindBy(xpath = "//span[contains(text(),'Все фильтры')]")
    WebElement allFilters;

    @FindBy(xpath = "//input[@class='_2xtC2uTwPF']")
    public WebElement priceTV;

    @FindBy(id = "153074")
    WebElement lg;

    @FindBy(id = "153061")
    WebElement samsung;

    @FindBy(xpath = "//a[@class='_2qvOOvezty _3qN-vKmEan _1Rc6LxE3Tr']")
    public WebElement clickToGo;

    @FindBy(xpath = "//div[@class='_3JNssUMLmP _1BSH6M5zD0 v3cFcxod7n']")
    WebElement dropdownControl;

    @FindBy(xpath = "//button[contains(text(),'Показывать по 12')]")
    WebElement twelveElements;

    @FindBy(xpath = "//div[@data-zone-name='snippetList']")
    WebElement blockElrmrnts;

    @FindBy(xpath = "//button[contains(text(),'Показать ещё')]")
    WebElement showMoreButton;

    @FindBy(xpath = "//h3[@data-zone-name='title']")
   static List<WebElement> zonaTitleElement;

    @FindBy(id = "header-search")
    WebElement headerSearch;

    static String firstItemText;

    public YandexMarketElectronicsTVPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void clickAllFilters() {
        allFilters.click();
    }

    public void minPriceFromTV(String value) { // Ввод минимальной стоимости
        priceTV.click();
        priceTV.clear();
        priceTV.sendKeys(value);
    }

    public void сheckboxTVPage(String item3) { //Выбор производителя
        switch (item3) {
            case "LG":
                lg.click();
                break;
            case "Samsung":
                samsung.click();
                break;
        }
    }
    public void applyFilters() { //Применить фильтры
        clickToGo.click();
    }

    public void twelveElement() { //Перейти на отображение 12 элементов на странице
        dropdownControl.click();
        twelveElements.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkElementsOnPage(int item) {
        List<WebElement> list = blockElrmrnts.findElements(By.xpath("//article[@data-zone-name='snippet-card']"));
        assertEquals(item, list.size());
    }

    public static String getTextOfFirstBlockElement() { //Сохранить наименование первого товара
        firstItemText = zonaTitleElement.get(0).getText();
        System.out.println(firstItemText);
        return firstItemText;

    }
   public void inputFirstItemText() { //Ввести наименование первого товара в строку поиска
        headerSearch.clear();
        headerSearch.sendKeys(firstItemText);
        headerSearch.submit();

    }

    public void checkTitleOfElement() { //Найти и проверить, что наименование товара соответствует запомненному значению."
        String headerSearchText =headerSearch.getAttribute("value");
        System.out.println(headerSearchText);
        System.out.println(firstItemText);
        assertEquals(headerSearchText, firstItemText);

    }
}
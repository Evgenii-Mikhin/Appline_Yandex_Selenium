package steps;
import cucumber.api.java.en.When;
public class ScenarioSteps {
    BaseSteps baseSteps = new BaseSteps();
    StepsYandexMainPage stepsYandexMainPage = new StepsYandexMainPage();
    StepsYandexMarketMainPage stepsYandexMarketMainPage = new StepsYandexMarketMainPage();
    StepsYandexMarketElectronicsPage stepsYandexMarketElectronicsPage = new StepsYandexMarketElectronicsPage();
    StepsYandexMarketElectronicsTVPage stepsYandexMarketElectronicsTVPage = new StepsYandexMarketElectronicsTVPage();

    @When("^Переход в ЯндексМаркет\"$")
    public void selectMarketButton() {
        stepsYandexMainPage.selectMarketButton();
    }

    @When("^перейти в раздел \"(.+)\"$")
    public void selectMenuItems(String menuItem1) {
        stepsYandexMarketMainPage.selectMenuItems(menuItem1);
    }

    @When("^перейти в подраздел \"(.+)\"$")
    public void marketCategoryPage(String menuItem2) {
        stepsYandexMarketElectronicsPage.marketCategoryPage(menuItem2);
    }
    @When("^открыть все фильтры\"$")
    public void clickAllFilters(){
        stepsYandexMarketElectronicsTVPage.clickAllFilters();
    }

    @When("^поле 'цена от' заполняется значением \"(.*)\"$")
    public void minPriceFromTV(String value){
        stepsYandexMarketElectronicsTVPage.minPriceFromTV(value);
    }

    @When("^выбрать производителя \"(.+)\"$")
    public void сheckboxTVPage(String Item3) {
        stepsYandexMarketElectronicsTVPage.сheckboxTVPage(Item3);
    }

    @When("^применить фильтры\"$")
    public void applyFilters(){ stepsYandexMarketElectronicsTVPage.applyFilters(); }

    @When("^выбрать отображение 12 элементов на странице\"$")
    public void twelveElement(){ stepsYandexMarketElectronicsTVPage.twelveElement(); }

    @When("^проверить, что количество показанных элементов \"(.+)\"$")
    public void checkElementsOnPage(int Item) {
        stepsYandexMarketElectronicsTVPage.checkElementsOnPage(Item);}

     @When("^запомнить первый эелемент в списке\"$")
     public void getTextOfFirstBlockElement(){ stepsYandexMarketElectronicsTVPage.getTextOfFirstBlockElement(); }

    @When("^в поисковую строку ввести запомненное значение\"$")
    public void inputFirstItemText(){ stepsYandexMarketElectronicsTVPage.inputFirstItemText(); }

    @When("^найти и проверить, что наименование товара соответствует запомненному значению.\"$")
    public void checkTitleOfElement(){ stepsYandexMarketElectronicsTVPage.checkTitleOfElement(); }

    }

package steps;
import pages.YandexMarketElectronicsTVPage;
import ru.yandex.qatools.allure.annotations.Step;

public class StepsYandexMarketElectronicsTVPage {
    @Step("открыть все фильтры")
    public void clickAllFilters() {
        new YandexMarketElectronicsTVPage().clickAllFilters();
    }

    @Step("поле 'цена от' заполняется значением {0}")
    public void minPriceFromTV(String value) {
        new YandexMarketElectronicsTVPage().minPriceFromTV(value);
    }

    @Step("выбрать производителя {0}")
    public void сheckboxTVPage (String Item3){
            new YandexMarketElectronicsTVPage().сheckboxTVPage(Item3);
        }

    @Step("применить фильтры")
    public void applyFilters() {
        new YandexMarketElectronicsTVPage().applyFilters();
    }

    @Step("выбрать отображение 12 элементов на странице")
    public void twelveElement() {
        new YandexMarketElectronicsTVPage().twelveElement(); }

    @Step("проверить, что количество показанных элементов = \"{0}\"")
    public void checkElementsOnPage(int item) {
        new YandexMarketElectronicsTVPage().checkElementsOnPage(item); }

    @Step("запомнить первый эелемент в списке")
    public void getTextOfFirstBlockElement() {
        new YandexMarketElectronicsTVPage().getTextOfFirstBlockElement(); }

    @Step("в поисковую строку ввести запомненное значение")
    public void inputFirstItemText() {
        new YandexMarketElectronicsTVPage().inputFirstItemText(); }

    @Step("найти и проверить, что наименование товара соответствует запомненному значению.")
    public void checkTitleOfElement() {
        new YandexMarketElectronicsTVPage().checkTitleOfElement(); }

    }

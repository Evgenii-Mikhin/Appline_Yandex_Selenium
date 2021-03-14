package steps;
import pages.YandexMarketElectronicsPage;
import ru.yandex.qatools.allure.annotations.Step;

public class StepsYandexMarketElectronicsPage {
        @Step("перейти в подраздел {0}")
        public void marketCategoryPage(String menuItem2) {
            new YandexMarketElectronicsPage().marketCategoryPage(menuItem2);
        }
}

package steps;

import pages.YandexMarketMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class StepsYandexMarketMainPage {
    @Step("перейти в раздел {0}")
    public void selectMenuItems(String menuItem1) {
        new YandexMarketMainPage().selectMenuItems(menuItem1);
    }
}

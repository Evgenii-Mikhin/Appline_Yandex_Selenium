package steps;

import pages.YandexMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class StepsYandexMainPage {
    @Step("Переход в ЯндексМаркет")
    public void selectMarketButton() {
        new YandexMainPage().selectMarketButton();
    }
    }


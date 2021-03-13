package steps;

import cucumber.api.java.en.When;
import pages.YandexMarketMainPage;

public class ScenarioSteps {
    BaseSteps baseSteps = new BaseSteps();
    StepsYandexMainPage stepsYandexMainPage = new StepsYandexMainPage();
    StepsYandexMarketMainPage stepsYandexMarketMainPage = new StepsYandexMarketMainPage();


    @When("^Переход в ЯндексМаркет\"$")
    public void selectMarketButton() {
        stepsYandexMainPage.selectMarketButton();
    }

    @When("^перейти в раздел \"(.+)\"$")
     public void selectMenuItems(String menuItem1) {
      stepsYandexMarketMainPage.selectMenuItems(menuItem1);

}}
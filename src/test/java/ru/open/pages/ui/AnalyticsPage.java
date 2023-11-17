package ru.open.pages.ui;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AnalyticsPage {
    @Step("Переходим с главной страницы на страницу Аналитика")
    public void openAnalyticsPage() {
        $(withText("Аналитика")).click();

    }
    @Step("Переходим со страницы Аналитика на страницу Лента")
    public void openNewslinePage() {
        $(withText("Лента")).click();

    }

    @Step("Проверяем, что мы находимся, на нужной странице")
    public void checkAnalyticsPage(String name) {
        $(".Heading-module__heading--Nu085").shouldHave(text(name));
    }

    @Step("Открыть календарь")
    public void openCalendar() {
        $(byText("Период")).click();
    }

    @Step("Выставить значения в календаре")
    public void setValue(String month, String firstDay, String lasDay) {
        SelenideElement selenideElement = $(byText(month)).parent();

        selenideElement.$(".Calendar-module__days--wybwI").find(byText(firstDay)).click();
        selenideElement.$(".Calendar-module__days--wybwI").find(byText(lasDay)).click();
    }

    @Step("Применить значения в календаре")
    public void submitCalendar() {
        $(byText("Применить")).click();
    }

    @Step("Применить значения у первой новости")
    public void checkDateNews(String month, String lasDay) {
        $$(".NewsCurrent_wrapper__bu4Yf").first().shouldHave(text(lasDay + " " + month));
    }

    @Step("Открыть календарь дивидентов")
    public void openDividentCalendar() {
        $(byText("Календарь дивидендов")).click();
    }

    @Step("Двойное нажатие на Доходность")
    public void clickOnDividents() {
        $$(".Table_tableLabel__brFYk").get(1).doubleClick();
    }

    @Step("Проверяем первую бумагу")
    public void checkFirstPaper(String name) {
        $$(".Table_tableCell__PtnWM").first().shouldHave(text(name));
    }

    @Step("Поиск бумаги")
    public void searchPaper(String name) {
        $(".PureInput_input__type-search__A3GDo").setValue(name).pressEnter();
    }

    @Step("Поиск новости")
    public void searchNews(String name) {
        $(".Input-module__inner--XLARg").setValue(name).pressEnter();
    }

    @Step("Открыть Новости депозитария")
    public void openDividentNews() {
        $(byText("Новости депозитария")).click();
    }

    @Step("Проверка новостей")
    public void checkNews(String name) {
        $(".NewsCurrent_wrapperList__r9TN5").shouldHave(text(name));
    }
}

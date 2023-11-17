package ru.open.pages.ui;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogPage {
    public SelenideElement catalog = $(byText("Каталог"));

    @Step("Переход на страницу Каталог")
    public void openCatalogPage() {
        catalog.click();
    }

    @Step("Проверка открытия страницы Каталог")
    public void checkCatalogPage(String txt) {
        $("h1").shouldHave(text(txt));
    }

    @Step("Открытие страницы с Акциями")
    public void openStocks() {
        $(byText("Акции")).click();
    }

    @Step("Открытие страницы с Облигациями")
    public void openBonds() {
        $(byText("Облигации")).click();
    }

    @Step("Открытие страницы с готовыми продуктами")
    public void openSolutions() {
        $(byText("Готовые решения"));
    }

    @Step("Поиск по бумаге(Акции/Облигации)")
    public void searchPaper(String name) {
        $(".PureInput_input__type-search__A3GDo").setValue(name).pressEnter();
    }

    @Step("Проверка результатов поиска")
    public void checkSearchPaper(String name) {
        $$(".Section_section__mIvNR").findBy(text(name)).shouldBe(visible);
    }

    @Step("Открыть страницу со стратегиями ИИС")
    public void openStrategy() {
        $(byText("ИИС")).click();
    }

    @Step("Проверка списка предложений по стратегии ИИС")
    public void checkSolutions(String[] names) {
        $$(".Heading-module__heading--h2--CLKcG").shouldHave(texts(names));
    }
}

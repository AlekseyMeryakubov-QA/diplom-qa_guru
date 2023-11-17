package ru.open.pages.ui;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPage {

    private final ElementsCollection menuPanel = $$(".Header-module__header--JyiEs");
    public SelenideElement company = $(byText("Компания"));

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("");
    }

    public MainPage checkMenuPanelExist(List<String> menu) {
        for (String menuElement : menu) {
            menuPanel.findBy(text(menuElement)).should(exist);
        }

        return this;
    }

    @Step("Переход на страницу Компания")
    public void openMenu() {
        company.click();
    }

    @Step("Открытие страницы с Акциями")
    public void openOfficePage() {
        $(byText("Офисы")).click();
    }


    @Step("Проверка страницы с Офисами")
    public void checkOfficePage() {
        $(".SmartLink-module_link__nlqcS").click();
    }
}

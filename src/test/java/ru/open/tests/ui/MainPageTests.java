package ru.open.tests.ui;

import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.open.pages.ui.MainPage;
import ru.open.tests.TestBase;
import ru.open.tests.TestData;

import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();

    TestData variables = new TestData();

    @Test
    @DisplayName("Проверка элементов списка из меню на главной странице")
    @Severity(SeverityLevel.NORMAL)
    @Epic("UI тесты")
    @Tag("WEB")
    @Tag("ALL")
    void checkEmptyField() {
        step("Открытие главной страницы сайта", () ->
                mainPage.openMainPage());
        step("Проверка существования элементов из списка", () ->
                mainPage.checkMenuPanelExist(variables.menuPanel));
    }

    @Test
    @DisplayName("Тест на проверку страницы с Офисами")
    @Severity(SeverityLevel.MINOR)
    void testOfficesPage() {
        mainPage.openMainPage();
        mainPage.openMenu();
        mainPage.openOfficePage();
        mainPage.checkOfficePage();
    }

}

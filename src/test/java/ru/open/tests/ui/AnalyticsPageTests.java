package ru.open.tests.ui;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.open.pages.ui.AnalyticsPage;
import ru.open.pages.ui.MainPage;
import ru.open.tests.TestBase;

@Feature("Тесты на странице Аналитика")
@Epic("UI тесты")
@Tag("WEB")
@Tag("ALL")
public class AnalyticsPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    AnalyticsPage analyticsPage = new AnalyticsPage();

    @Test
    @DisplayName("Простой тест на проверку ссылки на страницу с Аналитикой")
    @Severity(SeverityLevel.MINOR)
    void testHeaderLinksAnalytics() {
        mainPage.openMainPage();
        analyticsPage.openAnalyticsPage();
        analyticsPage.checkAnalyticsPage("Свежий взгляд");
    }

    @Test
    @DisplayName("Тест на проверку выдачи новостей с периодом календаря")
    @Severity(SeverityLevel.NORMAL)
    void testNewsCalendar() {
        mainPage.openMainPage();
        analyticsPage.openAnalyticsPage();
        analyticsPage.openNewslinePage();
        analyticsPage.openCalendar();
        analyticsPage.setValue("октябрь 2023", "1", "31");
        analyticsPage.submitCalendar();
        analyticsPage.checkDateNews("октября", "31");
    }

    @Test
    @DisplayName("Тест на проверку сортировки бумаг по Доходности")
    @Severity(SeverityLevel.MINOR)
    void testDividentPaper() {
        mainPage.openMainPage();
        analyticsPage.openAnalyticsPage();
        analyticsPage.openDividentCalendar();
        analyticsPage.clickOnDividents();
        analyticsPage.checkFirstPaper("ТрансКонтейнер");
    }

    @Test
    @DisplayName("Тест на проверку поиска по списку бумаг")
    @Severity(SeverityLevel.NORMAL)
    void testDividentPaperSearch() {
        mainPage.openMainPage();
        analyticsPage.openAnalyticsPage();
        analyticsPage.openDividentCalendar();
        analyticsPage.searchPaper("Мегафон");
        analyticsPage.checkFirstPaper("Мегафон");
    }

    @Test
    @DisplayName("Тест на проверку поиска по списку новостей")
    @Severity(SeverityLevel.MINOR)
    void testNewsSearch() {
        mainPage.openMainPage();
        analyticsPage.openAnalyticsPage();
        analyticsPage.openDividentNews();
        analyticsPage.searchNews("Ростелеком");
        analyticsPage.checkNews("Ростелеком");
    }
}

package ru.open.tests.ui;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.open.pages.ui.MainPage;
import ru.open.pages.ui.TariffPage;
import ru.open.tests.TestBase;

@Feature("Тесты на странице Тарифов")
@Epic("UI тесты")
@Tag("WEB")
@Tag("ALL")
public class TariffPageTests extends TestBase {
    MainPage mainPage = new MainPage();
    TariffPage tariffPage = new TariffPage();

    @Test
    @DisplayName("Простой тест на проверку ссылки на страницу с Тарифами")
    @Severity(SeverityLevel.MINOR)
    void testHeaderLinksTariff() {
        mainPage.openMainPage();
        tariffPage.openTariffPage();
        tariffPage.checkTariffPage();
    }

    @Test
    @DisplayName("Проверка количества тарифов")
    @Severity(SeverityLevel.MINOR)
    void testTariffLists() {
        mainPage.openMainPage();
        tariffPage.openTariffPage();
        tariffPage.checkTariffLists();
    }

    @DisplayName("Проверка содержимого тарифов")
    @Severity(SeverityLevel.NORMAL)
    @ValueSource(strings = {
            "Всё включено",
            "Инвестиционный",
            "Премиальный",
            "Спекулятивный"
    })
    @ParameterizedTest()
    void testTariffContent(String testData) {
        mainPage.openMainPage();
        tariffPage.openTariffPage();
        tariffPage.checkTariffContent(testData);
    }
}



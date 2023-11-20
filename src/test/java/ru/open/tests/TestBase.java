package ru.open.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import ru.open.config.ConfigManager;
import ru.open.config.WebConfig;
import ru.open.config.WebConfigProject;
import ru.open.helpers.Attach;
import ru.open.pages.ui.MainPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;


@ExtendWith({AllureJunit5.class})
public class TestBase {
    protected MainPage mainPage = new MainPage();

    private static final WebConfig config = ConfigManager.Instance.read();

    @BeforeAll
    public static void beforeAll() {
        WebConfigProject webConfigForProject = new WebConfigProject(config);
        webConfigForProject.applyWebConfig();

    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }
}

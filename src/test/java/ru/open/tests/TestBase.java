package ru.open.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.open.helpers.Attach;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;


@ExtendWith({AllureJunit5.class})
public class TestBase {


    @BeforeAll
    static void beforeAll() {
    Configuration.baseUrl = "https://open-broker.ru/invest/";
    Configuration.browserSize = System.getProperty("browser","1920x1080");
    Configuration.browser =System.getProperty("browser","chrome");
    Configuration.browserVersion = System.getProperty("browseVersionr","100.0");
    Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

    DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map .<String, Object>of(
                "enableVNC", true,
                        "enableVideo", true
    ));
    Configuration.browserCapabilities = capabilities;
}

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }

    @AfterEach
    void close(){
        closeWebDriver();
    }
}






//    private static WebDriverProvider driver = new WebDriverProvider();
//    static WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
//    static String Host;
//    @BeforeAll
//    static void beforeAll() {
//        Host = System.getProperty("tag");
//        if (Host.equals("Mobile")) {
//            setUp();
//        } else
//            driver.configure();
//    }
//    public static void setUp() {
//        if (webDriverConfig.remote()) {
//            Configuration.browser = BrowserstackMobileDriver.class.getName();
//        } else {
//            Configuration.browser = LocaleMobileDriver.class.getName();
//        }
//        Configuration.browserSize = null;
//    }
//
//    @BeforeEach
//    public void beforeEach() {
//        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
//
//        if (Host.equals("Mobile")){
//            open();
//        }
//    }
//
//    @AfterEach
//    public void afterEach() {
//        if (Host.equals("Mobile")) {
//            String sessionId = sessionId();
//
//            Mobile_Attach.screenshotAs("Last screenshot");
//            Mobile_Attach.pageSource();
//        }
//    }
//}


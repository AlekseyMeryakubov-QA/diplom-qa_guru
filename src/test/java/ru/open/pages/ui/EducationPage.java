package ru.open.pages.ui;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EducationPage {
    public SelenideElement study = $(byText("Обучение"));

    @Step("Переходим с главной страницы на страницу Обучение")
    public void openStudyPage() {
        study.click();
    }

    @Step("Проверка того, что страница открыта с авторизованным пользователем")
    public void checkAuthorisation() {
        $(byText("Профиль")).shouldBe(visible);
    }

    @Step("Переход на страницу редактирования данных пользователя")
    public void openCustomerRedactor() {
        $(byText("Профиль")).click();
    }

    @Step("Изменение имени пользователя через UI")
    public void changeCustomerName(String name) {
        $$(".PureInput_input__input__2RhRG").first().setValue(name);
    }

    @Step("Сохранение данных")
    public void clickSubmit() {
        $(byText("Сохранить")).click();
    }

    @Step("Проверка всплывающего сообщения о том, что данные сохранены")
    public void checkRename() {
        $(byText("Данные успешно сохранены")).shouldBe(visible);
    }

    @Step("Проверка того, что у пользователя новое Имя")
    public void checkName(String name) {
        $$(".PureInput_input__input__2RhRG").first().shouldHave(value(name));
    }
}

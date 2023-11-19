package ru.open.tests;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Locale;

public class TestData {
    Faker faker = new Faker(new Locale("ru"));

    public List<String>
            menuPanel = List.of("Инвестиции", "Аналитика",
            "Обучение", "Компания", "Вопросы и ответы");
    public String getName() {
        return faker.name().firstName();
    }

    public String getTelNum() {
        return faker.phoneNumber().phoneNumber();
    }
}

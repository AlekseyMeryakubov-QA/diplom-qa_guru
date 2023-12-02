# Проект по автоматизации тестирования </a><a name="Открытие">  <a target="_blank" href="https://open-broker.ru/"> Открытие инвестии </a></a>
<a href="https://open-broker.ru/invest/"><img alt="OpenBroker" src="images/logo/Открытие.png"/></a>

## Содержание:

- [Технологии и инструменты](#Technology)
- [Реализованные проверки](#Checks)
- [Сборка в Jenkins](#Jenkins)
- [Запуск из терминала](#RemoteLaunch)
- [Allure TestOps отчет](#AllureTestOps)
- [Allure отчет](#Allure)
- [Отчет в Telegram](#Telegram)
- [Видео примеры прохождения тестов](#Video)

<h1 align="left">
<a name="Technology"><i>Технологии и инструменты</i></a>
</h1>

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/AllureTestOps.png" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://rest-assured.io/"><img src="images/logo/Rest-Assured.png" width="50" height="50"  alt="Jenkins"/></a>


<h1 align="left">
<a name="Checks"><i>Реализованные проверки</i></a>
</h1>

- Набор разнообразных UI тестов



## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a><a name="Jenkins"> Jenkins <a target="_blank" href="https://jenkins.autotests.cloud/job/qa_guru_21_diplom_2/"> job </a></a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/qa_guru_21_diplom_2/"><img src="images/Jenkins.PNG" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:
- tag (Вид тестов WEB) - обязательный параметр
- Host (Удаленно или локально) - обязательный параметр
- browser (браузер, по умолчанию chrome)
- version (версия браузера, по умолчанию 99.0)
- size (размер окна браузера, по умолчанию 1920x1080)

## <a name="RemoteLaunch">Запуск тестов из терминала</a>

Локальный запуск (UI тестов локально):
```
gradle clean test -Dtag=WEB -Dremote=false 
```

Удаленный запуск с Jenkins:
```
clean
test
-Dtag=${Tag}
-Dhost=${Host}
-Dbrowser=${Browser}
-DbrowserVersion=${Browser_version}
-DbrowserSize=${Browser_Size}
```
## <img src="images/logo/AllureTestOps.png" width="25" height="25"  alt="Allure"/></a><a name="AllureTestOps"> Отчет в <a target="_blank" href="https://allure.autotests.cloud/launch/32606">Allure TestOps</a></a>

### Страница проекта

<p align="center">
<img title="Allure Overview Dashboard" src="images/Первая страница.PNG">
</p>

### Страница запуска

<p align="center">
<img title="Allure Overview Dashboard" src="images/Главная_страница.PNG">
</p>

### Реализованные тесты

<p align="center">
<img title="Allure Overview Dashboard" src="images/Набор кейсов.PNG">
</p>


### Список ошибок

<p align="center">
<img title="Allure Overview Dashboard" src="images/Набор ошибок.PNG">
</p>

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a><a name="Allure"> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/qa_guru_21_diplom_2/9/allure/">Allure report</a></a>

### Основное окно

<p align="center">
<img title="Allure Overview Dashboard" src="images/Allure.PNG">
</p>

### Тесты

<p align="center">
<img title="Allure Tests" src="images/Tests.PNG">
</p>

### Графики

<p align="center">
<img title="Allure Graphics" src="images/Graphs.PNG">
</p>

## <img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a><a name="Telegram"> Уведомление в Telegram при помощи бота</a>

<p align="center">
<img title="Allure Overview Dashboard" src="images/Telegram.PNG" >
</p>


## <img src="images/logo/Selenoid.svg" width="25" height="25"  alt="Allure"/></a><a name="Video"> Видео прохождения теста</a>

<p align="center">
<img title="Selenoid Video" src="images/b8d6d3f36c113950.gif" width="350" height="153"  alt="video"> 
<img title="Selenoid Video" src="images/cdbb275e1308bf2.gif" width="350" height="153"  alt="video"> 
</p>


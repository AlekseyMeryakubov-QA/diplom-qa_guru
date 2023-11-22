# Проект по автоматизации тестирования Открытие инвестиции
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
<a name="Checks"><i>Реализованные проверки</i></a>
</h1>

- Набор разнообразных UI тестов
- Несколько API тестов


## <img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a><a name="Jenkins"> Jenkins <a target="_blank" href="https://jenkins.autotests.cloud/job/qa_guru_21_diplom_2/"> job </a></a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/qa_guru_21_diplom_2/"><img src="images/Jenkins.PNG" alt="Jenkins"/></a>
</p>

### Параметры сборки в Jenkins:
- tag (Вид тестов WEB,API) - обязательный параметр
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

### Тест с использованием API

<p align="center">
<img title="Allure Overview Dashboard" src="images/Api.PNG">
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
<img title="Selenoid Video" src="images/3a411e3c8853f2fb.gif" width="250" height="153"  alt="video">
<img title="Selenoid Video" src="images/b8d6d3f36c113950.gif" width="250" height="153"  alt="video"> 
<img title="Selenoid Video" src="images/cdbb275e1308bf2.gif" width="250" height="153"  alt="video"> 
</p>


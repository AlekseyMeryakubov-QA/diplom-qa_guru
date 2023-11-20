package ru.open.tests.api;


//@Feature("Тесты на Странице с обучением")
//@Epic("API тесты")
//@Tag("API")
//public class EducationApiTests extends TestBase {
//    EducationApi educationApiPage = new EducationApi();
//    MainPage mainPage = new MainPage();
//    TestData testData = new TestData();
//    EducationPage educationPage = new EducationPage();
//
//    String cookieName = "api/cookie.json";
//    String bodyJson = "api/body.json";

//    @Test
//    @DisplayName("Тест на авторизацию")
//    @Severity(SeverityLevel.NORMAL)
//    public void authorisationApiTest() throws IOException {
//        AuthorisationResponseModel authorisationResponseModel = new AuthorisationResponseModel();
//
//        JsonNode jsonNode = educationApiPage.parseJson(cookieName);
//        authorisationResponseModel.setCookies(educationApiPage.authorisationApi(jsonNode));
//        mainPage.openMainPage();
//        educationApiPage.setCookies(authorisationResponseModel.getCookies());
//        educationPage.openStudyPage();
//        educationPage.checkAuthorisation();
//    }
//
//    @Test
//    @DisplayName("Тест на изменение Имени пользователя через UI с авторизацией с API")
//    @Severity(SeverityLevel.NORMAL)
//    public void changeCustomerDataTestUI() throws IOException {
//        AuthorisationResponseModel authorisationResponseModel = new AuthorisationResponseModel();
//        JsonNode jsonNode = educationApiPage.parseJson(cookieName);
//
//        authorisationResponseModel.setCookies(educationApiPage.authorisationApi(jsonNode));
//
//        mainPage.openMainPage();
//        educationApiPage.setCookies(authorisationResponseModel.getCookies());
//        educationPage.openStudyPage();
//        educationPage.openCustomerRedactor();
//        educationPage.changeCustomerName(testData.getName());
//        educationPage.clickSubmit();
//        educationPage.checkRename();
//    }
//
//    @Test
//    @DisplayName("Тест на изменение Имени пользователя через API с авторизацией с API")
//    @Severity(SeverityLevel.NORMAL)
//    public void changeCustomerDataTestApi() throws IOException {
//
//        ObjectNode jsonNodeBody = (ObjectNode) educationApiPage.parseJson(bodyJson);
//        AuthorisationResponseModel authorisationResponseModel = new AuthorisationResponseModel();
//        String name = testData.getName();
//
//        JsonNode jsonNode = educationApiPage.parseJson(cookieName);
//        authorisationResponseModel.setCookies(educationApiPage.authorisationApi(jsonNode));
//
//        educationApiPage.changeToken(authorisationResponseModel, jsonNodeBody);
//        educationApiPage.changeName(name, jsonNodeBody);
//        educationApiPage.customerNameApi(authorisationResponseModel, jsonNodeBody);
//        mainPage.openMainPage();
//        educationApiPage.setCookies(authorisationResponseModel.getCookies());
//        educationPage.openStudyPage();
//        educationPage.openCustomerRedactor();
//        educationPage.checkName(name);
//    }
//}

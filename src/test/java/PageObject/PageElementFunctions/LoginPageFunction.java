package PageObject.PageElementFunctions;


import io.qameta.allure.Step;
import java.time.Duration;

import static PageObject.PageElement.TestProjectPage.projectsButton;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static utils.Configuration.getConfigurationValue;
import static PageObject.PageElement.LoginPage.*;


public class LoginPageFunction {

    @Step("Открываем страницу по ссылке {jiraUrl}")
    public static void openPage(String url) {
        open(url);
    }

    @Step("Авторизуемся в системе под пользователем {login}")
    public static void authorization(String login) {
        loginField.shouldBe(visible).sendKeys(getConfigurationValue("login"));
        passwordField.sendKeys(getConfigurationValue("password"));
        passwordField.pressEnter();
    }
}
package PageObject.JiraTest;

import Hooks.WebHooks;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.ScreenShooter;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import static utils.Configuration.getConfigurationValue;
import static PageObject.PageElementFunctions.NewBugCaseFunctions.*;
import static PageObject.PageElementFunctions.LoginPageFunction.*;
import static PageObject.PageElementFunctions.TestProjectPageFunctions.*;
//import static PageObject.PageElementFunctions.NewBugCaseFunctions.clickNewCaseButton;
//import static PageObject.PageElementFunctions.NewBugCaseFunctions.searchNewTestCase;
//import static PageObject.PageElementFunctions.TestProjectPageFunctions.inputNameTask;

public class JiraTest extends WebHooks {

    @Test
    @Tag("Test1")
    @DisplayName("ТК 1. Авторизоваться в edujira.ifellow.ru")
    public void Test_1() {
        setDriverFromProperties();
        openPage(getConfigurationValue("jiraUrl"));
        authorization(getConfigurationValue("login"));
        Configuration.reportsFolder = "build/reports/tests";
        driverClose();
    }

    @Test
    @Tag("Test2")
    @DisplayName("ТК 2. Открыть страницу проекта TestProject и список задач")
    public void Test_2() {
        setDriverFromProperties();
        openPage(getConfigurationValue("jiraUrl"));
        authorization(getConfigurationValue("login"));
        clickProjectButton();
        Configuration.reportsFolder = "build/reports/tests";
        driverClose();
    }

    @Test
    @Tag("Test3")
    @DisplayName("ТК 3. Открыть список задач в проекте TestProject и вывести общее количество заведенных задач")
    public void Test_3() {
        setDriverFromProperties();
        openPage(getConfigurationValue("jiraUrl"));
        authorization(getConfigurationValue("login"));
        clickProjectButton();
        clickTaskList();
        Configuration.reportsFolder = "build/reports/tests";
        driverClose();
    }

    @Test
    @Tag("Test4")
    @DisplayName("ТК 4. Открыть задачу TestSelenium_bug, проверить статус и привязку к версии - Version 2.0")
    public void Test_4() {
        setDriverFromProperties();
        openPage(getConfigurationValue("jiraUrl"));
        authorization(getConfigurationValue("login"));
        inputNameTask(getConfigurationValue("task"));
        Configuration.reportsFolder = "build/reports/tests";
        driverClose();
    }
    @Test
    @Tag("Test5")
    @DisplayName("ТК 5. Создать новый тест-кейс с описанием")
    public void Test_5() {
        setDriverFromProperties();
        openPage(getConfigurationValue("jiraUrl"));
        authorization(getConfigurationValue("login"));
        clickNewCaseButton(getConfigurationValue("topic"));
        Configuration.reportsFolder = "build/reports/tests";
        driverClose();
    }

    @Test
    @Tag("Test6")
    @DisplayName("ТК 6. Поиск вновь заведённого тест-кейса и его закрытие")
    public void Test_6() {
        setDriverFromProperties();
        openPage(getConfigurationValue("jiraUrl"));
        authorization(getConfigurationValue("login"));
        searchNewTestCase(getConfigurationValue("task2"));
        Configuration.reportsFolder = "build/reports/tests";
        driverClose();
    }
    @Rule
    public ScreenShooter makeScreenshotOnFailure = ScreenShooter.failedTests().succeededTests();
}

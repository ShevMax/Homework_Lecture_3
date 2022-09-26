package PageObject.PageElementFunctions;


import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static PageObject.PageElement.TestProjectPage.*;
import static com.codeborne.selenide.Condition.visible;
import static utils.Configuration.getConfigurationValue;


public class TestProjectPageFunctions {

    @Step("Метод для перехода в проект {TestProject} и вывода списка задач")
    public static void clickProjectButton() {
        projectsButton.shouldBe(visible,Duration.ofSeconds(4)).click();
        taskList.shouldBe(visible,Duration.ofSeconds(3)).click();
    }
    @Step("Метод для вывода списка задач и общего их количества")
    public static void clickTaskList() {
        switchFilter.shouldBe(visible,Duration.ofSeconds(3)).click();
        allTasks.shouldBe(visible,Duration.ofSeconds(3)).click();
        valueAllTasks.getText();
        System.out.println("Общее количество заведённых задач = " + valueAllTasks);
    }

    @Step("Метод поиска задачи {TestSelenium_bug} в поле Поиск, проверка её статуса и номера версии")
    public static void inputNameTask(String task) {
        searchString.shouldBe(visible).sendKeys(getConfigurationValue("task"));
        searchString.pressEnter();
        checkStatus.shouldBe(visible,Duration.ofSeconds(5)).getValue();
        checkVersion.shouldBe(visible,Duration.ofSeconds(5)).getValue();
        System.out.println("Статус задачи TEST-21967 - " + checkStatus + "\n" + "Номер версии - " + checkVersion);



    }

}

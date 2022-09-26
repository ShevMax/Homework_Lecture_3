package PageObject.PageElementFunctions;


import io.qameta.allure.Step;

import java.time.Duration;

import static PageObject.PageElement.NewBugCase.*;
import static PageObject.PageElement.TestProjectPage.searchString;
import static com.codeborne.selenide.Condition.visible;
import static utils.Configuration.getConfigurationValue;

public class NewBugCaseFunctions {
    @Step("Метод для нажатия кнопки отрытия нового тест-кейса")
    public static void clickNewCaseButton(String topic) {
        newCaseButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        configureFieldsButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        clickFieldsButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        clickUserFieldsButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        configureFieldsButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        fieldTopic.shouldBe(visible).sendKeys(getConfigurationValue("topic"));
        fieldTypeTask.shouldBe(visible, Duration.ofSeconds(4)).click();
        clickFieldTypeTask.shouldBe(visible, Duration.ofSeconds(4)).pressEnter();
        clickCreateButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        clickCancelButton.shouldBe(visible, Duration.ofSeconds(4)).click();
    }

    @Step("Метод поиска вновь заведёного тест-кейса {TEST-22567} в поле Поиск, перевод статуса в Закрыто")
    public static void searchNewTestCase(String task2){
        searchString.shouldBe(visible).sendKeys(getConfigurationValue("task2"));
        searchString.pressEnter();
        changePerformerButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        changeStatusButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        changeStatusButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        businessProcessButton.shouldBe(visible, Duration.ofSeconds(6)).click();
        executedProcessButton.shouldBe(visible, Duration.ofSeconds(4)).click();
        tagsField.setValue("Тест кейс выполнен");
        taskField.shouldBe(visible).sendKeys(getConfigurationValue("task"));
        taskField.pressEnter();
        executedProcessButton2.shouldBe(visible, Duration.ofSeconds(4)).click();
    }


}

package PageObject.PageElement;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class NewBugCase {

// кнопка отрытия нового тест-кейса
    public static SelenideElement newCaseButton = $x("//a[@id='create_link']");

// кнопка Настроить поля в Создании задачи
    public static SelenideElement configureFieldsButton = $x("//span[@class='aui-icon aui-icon-small aui-iconfont-configure']");

// кнопка выбора поля в Настройке поля
    public static SelenideElement clickFieldsButton = $x("//select[@id='configure-fields']");

// выбор значение поля Пользовательские поля
    public static SelenideElement clickUserFieldsButton = $x("//option[@class='qf-configurable']");

// поле Тип задачи в окне Создание задачи
    public static SelenideElement fieldTypeTask  = $x("//div[@class='aui-ss issuetype-ss aui-ss-select aui-ss-has-entity-icon']");

// Тип задачи Ошибка в поле Тип задачи окна Создание задачи
    public static SelenideElement clickFieldTypeTask = $x("//input[@id='issuetype-field']");


// поле Тема в окне Создание задачи
    public static SelenideElement fieldTopic = $x("//input[@class='text long-field']");

// поле выбора Приоритета в окне Создание задачи
    public static SelenideElement fieldPrioritySelection = $x("//div[@id='priority-single-select']");

// кнопка Создать в окне Создания задачи
    public static SelenideElement clickCreateButton = $x("//input[@id='create-issue-submit']");

// кнопка Отменить в окне Создание задачи
    public static SelenideElement clickCancelButton = $x("//button[@class='aui-button aui-button-link cancel']");

// кнопка Назначить меня в качестве Исполнителя по вновь заведенному тест-кейсу
    public static SelenideElement changePerformerButton = $x("//a[@id='assign-to-me']");

// кнопка изменения статуса вновь заведенного тест-кейса
    public static SelenideElement changeStatusButton = $x("//span[@class='trigger-label' and text()='В работе']");

// кнопка Бизнесс-процесс в окне вновь заведенного тест-кейса
    public static SelenideElement businessProcessButton = $x("//a[@id='opsbar-transitions_more']");

// кнопка Исполнено в окне Бизнес-процесс
    public static SelenideElement executedProcessButton = $x("//span[@class='trigger-label' and text()='Исполнено']");

// кнопка Выполнено в окне Бизнес-процесс
    public static SelenideElement executedProcessButton2 = $x("//span[@class='trigger-label' and text()='Выполнено']");

// поле Метки в окне Исполнено
    public static SelenideElement tagsField = $x("//span[@class='icon noloading drop-menu']");

// поле Задача в окне Исполнено
    public static SelenideElement taskField = $x("//span[@class='icon drop-menu noloading']");














}

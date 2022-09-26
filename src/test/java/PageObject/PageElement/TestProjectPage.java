package PageObject.PageElement;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class TestProjectPage {

// переход в проект TestProject
    public static SelenideElement projectsButton = $x("//img[@alt='Jira']");

// кнопка подменю Задачи
    public static SelenideElement taskList = $x("//span[@class='aui-icon aui-icon-large icon-sidebar-issues aui-iconfont-issues']");

// переключение фильтра на Все задачи
    public static SelenideElement switchFilter = $x("//button[@id='subnav-trigger']");

// кнопка Переключить фильтр
    public static SelenideElement allTasks = $x("//a[@data-item-id='allissues']");

// значение общего количества открытых задач
    public static SelenideElement valueAllTasks = $x("//div[@class='showing']/child::span");

// поле Поиск для последующего ввода задачи TestSelenium_bug
    public static SelenideElement searchString = $x("//input[@accesskey='Q']");

// проверка статуса
    public static SelenideElement checkStatus = $x("//span[@id='status-val']");

// проверка версии
    public static SelenideElement checkVersion = $x("//span[@id='fixVersions-field']");
//a[contains(@title,'Version')]


}

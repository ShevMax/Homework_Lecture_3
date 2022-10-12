package Hooks;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static PageObject.PageFunctions.LoginPageFunction.openPage;
import static utils.Configuration.getConfigurationValue;

public class WebHooks {

    @BeforeEach()
    public void setDriverFromProperties(){
        Configuration.startMaximized = true;
        openPage(getConfigurationValue("jiraUrl"));
    }

    @AfterEach()
    public void driverClose(){
        WebDriverRunner.closeWebDriver();
        Configuration.reportsFolder = "build/reports/tests";
    }
}

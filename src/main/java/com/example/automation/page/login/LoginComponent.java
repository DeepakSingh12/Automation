package com.example.automation.page.login;

import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;


@PageFragment
public class LoginComponent extends Base {

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService; 

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "kc-login")
    private WebElement login;

    public void completeForm() throws IOException {
        if (this.wait.until((d) -> this.username.isDisplayed())) {
            seleniumUtilities.populateTextLogin(this.username, System.getProperty("Username"));
            seleniumUtilities.waitForPageLoad();
            seleniumUtilities.populateTextLogin(this.password, System.getProperty("Password"));
            seleniumUtilities.waitForPageLoad();
            screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
            seleniumUtilities.clickLogin(this.login);
        }

    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.username.isDisplayed() && this.username.isEnabled()));
    }

}

package com.example.automation.page.createApplication.view;

import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class ViewComponent extends Base {
    private static final String path = "ApplicationsViewForm:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService; 


    @FindBy(id = path + "editapplicationButton1")
    private WebElement editapplicationButton1;

    @FindBy(id = path + "dataQualityButton1")
    private WebElement dataQualityButton1;

    public void clickEditButton() throws IOException {
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(editapplicationButton1);
    }

    public void clickDQButton() throws IOException {
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(dataQualityButton1);
    }


    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.editapplicationButton1.isDisplayed() && this.editapplicationButton1.isEnabled()));
    }
}

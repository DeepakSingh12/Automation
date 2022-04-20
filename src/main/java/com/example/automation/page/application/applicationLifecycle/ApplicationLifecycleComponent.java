package com.example.automation.page.application.applicationLifecycle;

import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;
import com.example.automation.sanchez.services.WaitForService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class ApplicationLifecycleComponent extends Base {

    //private static final String path = "applifecycleCard:form:appsDataTable:globalFilter:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService;

    @Autowired
    private WaitForService waitForService;

    @FindBy(xpath = "//*[@id='applifecycleCard:form:appsDataTable:globalFilter:0']/..")
    private WebElement all;

    @FindBy(xpath = "//*[@id='applifecycleCard:form:appsDataTable:globalFilter:1']/..")
    private WebElement future;

    @FindBy(xpath = "//*[@id='applifecycleCard:form:appsDataTable:globalFilter:2']/..")
    private WebElement phasingIn;

    @FindBy(xpath = "//*[@id='applifecycleCard:form:appsDataTable:globalFilter:3']/..")
    private WebElement productive;

    @FindBy(xpath = "//*[@id='applifecycleCard:form:appsDataTable:globalFilter:4']/..")
    private WebElement phasingOut;

    @FindBy(xpath = "//*[@id='applifecycleCard:form:appsDataTable:globalFilter:5']/..")
    private WebElement retirementScheduled;

    @FindBy(xpath = "//*[@id='applifecycleCard:form:appsDataTable:globalFilter:6']/..")
    private WebElement retired;

    public void clickAllQuickFilters() throws InterruptedException, IOException {
        seleniumUtilities.click(all);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(future);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(phasingIn);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(productive);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(phasingOut);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(retirementScheduled);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(retired);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.all.isDisplayed() && this.all.isEnabled()));
    }

}

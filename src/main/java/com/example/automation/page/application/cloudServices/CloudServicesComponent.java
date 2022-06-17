package com.example.automation.page.application.cloudServices;

import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class CloudServicesComponent extends Base {

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/div/section/div/div/h3")
    private WebElement header;

    @FindBy(xpath = "//*[@id='pvExplorationHost']/div/div/exploration/div/explore-canvas/div/div[2]/div/div[2]/div[2]/visual-container-repeat/visual-container[2]/transform/div/div[3]/div/visual-modern/div/div/div[2]/div")
    private WebElement internaluseonly;

    @FindBy(xpath = "//div[@aria-label='Materiality of Service Non Material Arrangement']/div/span")
    private WebElement nonMaterialArrangement;

    @FindBy(xpath = "//div[@aria-label='Materiality of Service Non Material Arrangements']/div/span")
    private WebElement nonMaterialArrangements;

    @FindBy(xpath = "//div[@aria-label='Materiality of Service Public']/div/span")
    private WebElement Public;

    public void checkCloudServices() throws IOException, InterruptedException {
        waitForService.waitForPulse(10);
        seleniumUtilities.selectDropdownPowerBI("Project Approval Status", "Approved");
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.selectDropdownPowerBI("Materiality of Service", "Confidential");
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.selectDropdownPowerBI("Materiality of Service", "Internal Use Only");
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.selectDropdownPowerBI("Materiality of Service", "Non Material Arrangement");
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.selectDropdownPowerBI("Materiality of Service", "Non Material Arrangements");
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.selectDropdownPowerBI("Materiality of Service", "Public");
       

    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.header.isDisplayed() && this.header.isEnabled()));
    }

}

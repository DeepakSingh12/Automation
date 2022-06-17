package com.example.automation.page.application.dataQuality;

import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.JavaScriptServices;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;
import com.example.automation.sanchez.services.WaitForService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class DataQualityComponent extends Base {

    private static final String path = "DataQualityListForm:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService;

    @Autowired
    private WaitForService waitForService;

    @Autowired
    private JavaScriptServices javaScriptServices;

    @FindBy(xpath = "//*[@id='DataQualityListForm:j_idt16:3']/..")
    private WebElement myBU;

    @FindBy(xpath = "//*[@id='DataQualityListForm:j_idt16:2']/..")
    private WebElement mySegment;

    @FindBy(xpath = "//*[@id='DataQualityListForm:j_idt16:1']/..")
    private WebElement myDivision;

    @FindBy(xpath = "//*[@id='DataQualityListForm:j_idt16:0']/..")
    private WebElement viewAll;

    @FindBy(xpath = "//*[@id='DataQualityListForm:appCS:horizontal_toggler']")
    private WebElement acsToogle;

    @FindBy(xpath = "//*[@id='DataQualityListForm:appTS:horizontalTime_toggler']")
    private WebElement atsToogle;

    @FindBy(xpath = "//*[@id='DataQualityListForm:appCS:orgstatusExcelExport']/img")
    private WebElement acsExcelDownload;

    @FindBy(xpath = "//*[@id='DataQualityListForm:appTS:orgstatusExcelExportTime']/img")
    private WebElement atsExcelDownload;

    @FindBy(xpath = "//*[@id='DataQualityListForm:datalist:0:ajax1']")
    private WebElement nameofApplication;

    @FindBy(id = path + "datalist:nameOfApplicationInput")
    private WebElement name;

    public void clickAllQuickFilters() throws InterruptedException, IOException{
        seleniumUtilities.click(myBU);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(mySegment);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(myDivision);
        waitForService.waitForPulse(15);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(viewAll);
        waitForService.waitForPulse(15);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(acsToogle);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(acsExcelDownload);
        waitForService.waitForPulse(5);
        javaScriptServices.scrollDown();
        javaScriptServices.scrollDown();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(atsToogle);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(atsExcelDownload);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());


    }

    public void searchAndEditApplication(String appName) throws InterruptedException, IOException {
        javaScriptServices.scrollDown();
        javaScriptServices.scrollDown();
        waitForService.waitForPulse(5);
        seleniumUtilities.populateText(name, appName);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        waitForService.waitForPulse(5);
        seleniumUtilities.click(nameofApplication);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.myBU.isDisplayed() && this.myBU.isEnabled()));
    }

}

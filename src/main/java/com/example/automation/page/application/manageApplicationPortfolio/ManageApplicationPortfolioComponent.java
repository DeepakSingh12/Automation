package com.example.automation.page.application.manageApplicationPortfolio;

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
public class ManageApplicationPortfolioComponent extends Base {

        @Autowired
        private SeleniumService seleniumUtilities;

        @Autowired
        private ScreenshotService screenshotService;

        @Autowired
        private WaitForService waitForService;

        // Quick Filters

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt18:3']/..")
        private WebElement myBU;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt18:2']/..")
        private WebElement mySegment;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt18:1']/..")
        private WebElement myDivision;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt18:0']/..")
        private WebElement viewAll;

        // Attributes Selection

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:0']/..")
        private WebElement Identity;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:1']/..")
        private WebElement Business;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:2']/..")
        private WebElement Finance;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:3']/..")
        private WebElement Integrations;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:4']/..")
        private WebElement Ownership;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:5']/..")
        private WebElement Criticality;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:6']/..")
        private WebElement Lifecycle;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:7']/..")
        private WebElement Infrastructure;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:8']/..")
        private WebElement Security;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:j_idt31:9']/..")
        private WebElement All;

        @FindBy(xpath = "taskContainer:ApplicationsListForm:datalist:nameOfApplicationInput")
        private WebElement nameOfApplication;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:datalist:appExcelExport']")
        private WebElement excelDownload;

        @FindBy(xpath = "//*[@id='taskContainer:ApplicationsListForm:createButton']")
        private WebElement creatButton;

        @FindBy(xpath = "taskContainer:ApplicationsListForm:datalist:appExcelExport")
        private WebElement excelBtn;

        public void clickAllQuickFilters() throws InterruptedException, IOException {
                seleniumUtilities.click(myBU);
                waitForService.waitForPulse(3);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(mySegment);
                waitForService.waitForPulse(3);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(myDivision);
                waitForService.waitForPulse(15);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(viewAll);
                waitForService.waitForPulse(15);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
        }

        public void clickAllAttributeSelection() throws InterruptedException, IOException {

                seleniumUtilities.click(Identity);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Business);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Finance);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Integrations);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Ownership);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Criticality);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Lifecycle);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Infrastructure);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Security);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(All);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(creatButton);

        }

        @Override
        public boolean isAt() {
                return this.wait.until((d) -> (this.myBU.isDisplayed() && this.myBU.isEnabled()));
        }

}

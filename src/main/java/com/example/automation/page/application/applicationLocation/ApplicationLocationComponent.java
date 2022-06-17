package com.example.automation.page.application.applicationLocation;

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
public class ApplicationLocationComponent extends Base {

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService;

    @Autowired
    private WaitForService waitForService;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab']/ul/li[2]/a")
    private WebElement applicationDeployment;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab']/ul/li[1]/a")
    private WebElement applicationUsage;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt18:4']/..")
    private WebElement onlyMyArea;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt18:3']/..")
    private WebElement myBU;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt18:2']/..")
    private WebElement mySegment;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt18:1']/..")
    private WebElement myDivision;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt18:0']/..")
    private WebElement all;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt62:4']/..")
    private WebElement onlyMyAreaDeployement;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt62:3']/..")
    private WebElement myBUDeployement;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt62:2']/..")
    private WebElement mySegmentDeployement;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt62:1']/..")
    private WebElement myDivisionDeployement;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:j_idt62:0']/..")
    private WebElement allDeployement;

    @FindBy(id = "ApplicationsLocationForm:appLocationCard:applocationtab:appsDataTable:j_idt33:filter")
    private WebElement nameOfApplication;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:appsDataTable:0:j_idt36']/a[1]/span")
    private WebElement editTick;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:appsDataTable:0:j_idt40:0:j_idt44']/div[2]/span")
    private WebElement southAfrica;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:appsDataTable:0:j_idt40:2:j_idt44']/div[2]/span")
    private WebElement botswana;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:appsDataTable:0:j_idt40:4:j_idt44']/div[2]/span")
    private WebElement kenya;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:appsDataTable:0:j_idt36']/a[2]/span")
    private WebElement saveTick;

    @FindBy(id = "ApplicationsLocationForm:appLocationCard:applocationtab:deployedAppsDataTable:j_idt78:filter")
    private WebElement nameOfApplicationDeployment;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:deployedAppsDataTable:0:j_idt82']/a[1]/span")
    private WebElement editTickDeployment;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:deployedAppsDataTable:0:j_idt86:0:j_idt90']/div[2]/span")
    private WebElement southAfricaDeployment;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:deployedAppsDataTable:0:j_idt86:1:j_idt90']/div[2]/span")
    private WebElement botswanaDeployment;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:deployedAppsDataTable:0:j_idt86:2:j_idt90']/div[2]/span")
    private WebElement kenyaDeployment;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:deployedAppsDataTable:0:j_idt82']/a[2]/span")
    private WebElement saveTickDeployment;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:appsDataTable:appLifeCycleExcelExport']/img")
    private WebElement excelDownoad;

    @FindBy(xpath = "//*[@id='ApplicationsLocationForm:appLocationCard:applocationtab:deployedAppsDataTable:appLifeCycleExcelExport']/img")
    private WebElement excelDownoadDeployments;

    public void clickApplicationDeployment() throws IOException, InterruptedException {
        seleniumUtilities.click(applicationDeployment);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void clickApplicationUsage() throws IOException, InterruptedException {
        seleniumUtilities.click(applicationUsage);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }

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
        seleniumUtilities.click(all);
        waitForService.waitForPulse(15);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(onlyMyArea);
        waitForService.waitForPulse(15);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void clickAllQuickFiltersDeployement() throws InterruptedException, IOException {
        seleniumUtilities.click(myBUDeployement);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(mySegmentDeployement);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(myDivisionDeployement);
        waitForService.waitForPulse(15);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(allDeployement);
        waitForService.waitForPulse(15);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(onlyMyAreaDeployement);
        waitForService.waitForPulse(15);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void editApplicationUsage() throws InterruptedException, IOException {
        seleniumUtilities.populateText(nameOfApplication, "What");
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(editTick);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(southAfrica);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(botswana);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(kenya);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(saveTick);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void editApplicationDeployment() throws InterruptedException, IOException {
        seleniumUtilities.populateText(nameOfApplicationDeployment, "What");
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(editTickDeployment);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(southAfricaDeployment);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(botswanaDeployment);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(kenyaDeployment);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(saveTickDeployment);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void downloadExcelDataApps() throws InterruptedException, IOException {
        waitForService.waitForPulse(10);
        seleniumUtilities.click(excelDownoad);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void downloadExcelDataDeployment() throws InterruptedException, IOException {
        waitForService.waitForPulse(10);
        seleniumUtilities.click(excelDownoadDeployments);
        waitForService.waitForPulse(10);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
    }



    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.applicationUsage.isDisplayed() && this.applicationUsage.isEnabled()));
    }

}

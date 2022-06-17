package com.example.automation.page.landing;

import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class LandingComponent extends Base {

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService; 

    @FindBy(id = "quickAppCreate")
    private WebElement creatBtn;

    @FindBy(id = "governance")
    private WebElement governanceBtn;

    @FindBy(id = "govRegistrationForm")
    private WebElement govRegistrationFormBtn;

    @FindBy(id = "drParticipation")
    private WebElement drParticipation;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[8]/ul/li[1]/a")
    private WebElement drParticipationForm;

    @FindBy(id = "haSurvey")
    private WebElement haSurvey;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[9]/ul/li[1]/a")
    private WebElement haArchitectureSurvey;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[9]/ul/li[3]/a")
    private WebElement haSurveyBulkImport;

    @FindBy(id = "help1")
    private WebElement application;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[3]/ul/li[1]/a")
    private WebElement dataQuality;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[3]/ul/li[3]/a")
    private WebElement manageApplicationPortfolio;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[3]/ul/li[5]/a")
    private WebElement applicationLifecycle;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[3]/ul/li[7]/a")
    private WebElement applicationLocation;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[3]/ul/li[11]/a")
    private WebElement cloudServices;

    @FindBy(xpath = "//*[@id='panelWholePage']/div[1]/header/nav/ul/li[6]/a")
    private WebElement bulkImport;

    public void clickCreateTab() throws IOException, InterruptedException {
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(creatBtn);
        waitForService.waitForPulse(3);

    }

    public void clickBulkImportTab() throws IOException, InterruptedException {
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(bulkImport);
        waitForService.waitForPulse(3);

    }

    public void clickGovernanceTabandRegistration() throws IOException, InterruptedException {
        seleniumUtilities.click(governanceBtn);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(govRegistrationFormBtn);
        waitForService.waitForPulse(3);

    }

    public void clickdrParticipationandForm() throws IOException, InterruptedException {
        seleniumUtilities.click(drParticipation);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(drParticipationForm);
        waitForService.waitForPulse(3);

    }

    public void clickHASurvey() throws IOException, InterruptedException {
        seleniumUtilities.click(haSurvey);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(haArchitectureSurvey);
        waitForService.waitForPulse(3);

    }

    public void clickHASurveyBulkImport() throws IOException, InterruptedException {
        seleniumUtilities.click(haSurvey);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(haSurveyBulkImport);
        waitForService.waitForPulse(3);

    }

    public void clickDataQuailty() throws IOException, InterruptedException {
        seleniumUtilities.click(application);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(dataQuality);
        waitForService.waitForPulse(3);
    }

    public void clickmanageApplicationPortfolio() throws IOException, InterruptedException {
        seleniumUtilities.click(application);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(manageApplicationPortfolio);
        waitForService.waitForPulse(3);
    }

    public void clickApplicationLifecycle() throws IOException, InterruptedException {
        seleniumUtilities.click(application);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(applicationLifecycle);
        waitForService.waitForPulse(3);
    }

    public void clickApplicationLocation() throws IOException, InterruptedException {
        seleniumUtilities.click(application);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(applicationLocation);
        waitForService.waitForPulse(3);
    }

    public void clickCloudServices() throws IOException, InterruptedException {
        seleniumUtilities.click(application);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(cloudServices);
        waitForService.waitForPulse(3);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.creatBtn.isDisplayed() && this.creatBtn.isEnabled()));
    }

}

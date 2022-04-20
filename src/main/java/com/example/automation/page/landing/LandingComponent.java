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

    public void clickCreateTab() throws IOException {
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(creatBtn);
        seleniumUtilities.waitForPageLoad();

    }

    public void clickBulkImportTab() throws IOException {
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(bulkImport);
        seleniumUtilities.waitForPageLoad();

    }

    public void clickGovernanceTabandRegistration() throws IOException {
        seleniumUtilities.click(governanceBtn);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(govRegistrationFormBtn);
        seleniumUtilities.waitForPageLoad();

    }

    public void clickdrParticipationandForm() throws IOException {
        seleniumUtilities.click(drParticipation);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(drParticipationForm);
        seleniumUtilities.waitForPageLoad();

    }

    public void clickHASurvey() throws IOException {
        seleniumUtilities.click(haSurvey);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(haArchitectureSurvey);
        seleniumUtilities.waitForPageLoad();

    }

    public void clickDataQuailty() throws IOException {
        seleniumUtilities.click(application);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(dataQuality);
        seleniumUtilities.waitForPageLoad();
    }

    public void clickmanageApplicationPortfolio() throws IOException {
        seleniumUtilities.click(application);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(manageApplicationPortfolio);
        seleniumUtilities.waitForPageLoad();
    }

    public void clickApplicationLifecycle() throws IOException {
        seleniumUtilities.click(application);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(applicationLifecycle);
        seleniumUtilities.waitForPageLoad();
    }

    public void clickApplicationLocation() throws IOException {
        seleniumUtilities.click(application);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(applicationLocation);
        seleniumUtilities.waitForPageLoad();
    }

    public void clickCloudServices() throws IOException {
        seleniumUtilities.click(application);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(cloudServices);
        seleniumUtilities.waitForPageLoad();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.creatBtn.isDisplayed() && this.creatBtn.isEnabled()));
    }

}

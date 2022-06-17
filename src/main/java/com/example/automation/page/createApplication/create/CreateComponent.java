package com.example.automation.page.createApplication.create;

import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ApplicationDataService;
import com.example.automation.sanchez.services.JavaScriptServices;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;
import com.github.javafaker.Faker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class CreateComponent extends Base {
    private static final String path = "quickAppCreate:quickAppCreateForm:";


    @Autowired
    private Faker faker;

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService; 

    @Autowired
    private JavaScriptServices javaScriptServices;

    @FindBy(id = path + "nameOfApplication")
    private WebElement nameOfApplication;

    @FindBy(id = path + "instanceName")
    private WebElement instanceName;

    @FindBy(id = path + "aliasOfApplication")
    private WebElement aliasOfApplication;

    @FindBy(id = path + "appShortCode")
    private WebElement appShortCode;

    @FindBy(id = path + "descriptionOfApplication")
    private WebElement descriptionOfApplication;

    @FindBy(id = path + "vendorName")
    private WebElement vendorName;

    @FindBy(id = path + "primaryDevelopmentLanguage")
    private WebElement primaryDevelopmentLanguage;

    @FindBy(id = path + "levelOfCustomisation")
    private WebElement levelOfCustomisation;

    @FindBy(id = path + "applicationPlatform")
    private WebElement applicationPlatform;

    @FindBy(id = path + "dataClassification")
    private WebElement dataClassification;

    @FindBy(id = path + "cioItManagerID")
    private WebElement cioItManagerID;

    @FindBy(id = path + "businessOwnerID")
    private WebElement businessOwnerID;

    @FindBy(id = path + "technicalOwnerID")
    private WebElement technicalOwnerID;

    @FindBy(id = path + "architectID")
    private WebElement architectID;

    @FindBy(id = path + "champion1_ID")
    private WebElement champion1_ID;

    @FindBy(id = path + "criticalApp")
    private WebElement criticalApp;

    @FindBy(id = path + "businessImpactOfA24hrApplicationDowntime")
    private WebElement businessImpactOfA24hrApplicationDowntime;

    @FindBy(id = path + "phaseInPlannedFromDate")
    private WebElement phaseInPlannedFromDate;

    @FindBy(id = path + "replacementApp")
    private WebElement replacementApp;

    @FindBy(id = path + "hostingLocation")
    private WebElement hostingLocation;

    @FindBy(id = path + "primaryProductionEnvironmentLocation")
    private WebElement primaryProductionEnvironmentLocation;

    @FindBy(id = path + "isDRinPlace")
    private WebElement isDRinPlace;

    @FindBy(id = path + "worksInStandin")
    private WebElement worksInStandin;

    @FindBy(id = path + "buttonToSavequickcreateapplication")
    private WebElement buttonToSavequickcreateapplication;

    @FindBy(id = path + "yesConfirmationButton")
    private WebElement yesConfirmationButton;

    @FindBy(id = path + "orgID_filter")
    private WebElement orgID_filter;

    @FindBy(xpath = "//span[contains(text(), 'FNB iDigi Tech Support Strategy and Architecture')]")
    private WebElement orgunit;

    @Autowired
    private ApplicationDataService applicationDataService;



    public void completeForm() throws IOException, InterruptedException {
        applicationDataService.setApplicationName();
        // Basic Information
        seleniumUtilities.populateText(nameOfApplication, applicationDataService.getApplicationName());
        waitForService.waitForPulse(3);
        //seleniumUtilities.populateText(instanceName, faker.funnyName().name());
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(aliasOfApplication, "T");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(appShortCode, faker.name().firstName());
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(descriptionOfApplication, "Testing Tool");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(vendorName, "Jeff");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(levelOfCustomisation, "Unknown");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(primaryDevelopmentLanguage, "Java");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(applicationPlatform, "Application Server");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dataClassification, "Restricted");
        javaScriptServices.scrollDown();

        // Ownership
        seleniumUtilities.populateText(orgID_filter, "FNB iDigi Tech Support Strategy and Architecture");
        waitForService.waitForPulse(10);
        seleniumUtilities.click(orgunit);
        seleniumUtilities.selectDropdownSearch(cioItManagerID, "Aline Kruger (3867218)");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdownSearch(businessOwnerID, "Aline Kruger (3867218)");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdownSearch(technicalOwnerID, "Aline Kruger (3867218)");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdownSearch(architectID, "Aline Kruger (3867218)");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdownSearch(champion1_ID, "Aline Kruger (3867218)");

        // Criticality
        waitForService.waitForPulse(3);
        seleniumUtilities.click(criticalApp);
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(businessImpactOfA24hrApplicationDowntime, "Moderate Impact");
        javaScriptServices.scrollDown();

        // Application Lifecycle
        waitForService.waitForPulse(3);
        seleniumUtilities.populateTextDatePicker(phaseInPlannedFromDate, "13/03/2022");
        waitForService.waitForPulse(3);
        // seleniumUtilities.click(replacementApp);

        // Infrastructure
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(hostingLocation, "FNB Data Centre");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(primaryProductionEnvironmentLocation, "Red 3");
        waitForService.waitForPulse(3);
        seleniumUtilities.click(isDRinPlace);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(worksInStandin);
        javaScriptServices.scrollDown();

        // Confirm button
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(buttonToSavequickcreateapplication);
        waitForService.waitForPulse(3);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(yesConfirmationButton);

    }

    @Override
    public boolean isAt() {
        return wait.until((d) -> (this.nameOfApplication.isDisplayed() && this.nameOfApplication.isEnabled()));
    }

}

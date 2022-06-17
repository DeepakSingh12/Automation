package com.example.automation.page.governance.governanceRegistration;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.JavaScriptServices;
import com.example.automation.sanchez.services.SeleniumService;
import com.github.javafaker.Faker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class GovernanceRegistrationComponent extends Base {

    private static final String path = "form:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private Faker faker;

    @Autowired
    private JavaScriptServices javaScriptServices;

    @FindBy(id = path + "topic")
    private WebElement topic;

    @FindBy(id = path + "projectDescription")
    private WebElement projectDescription;

    @FindBy(id = path + "purpose")
    private WebElement purpose;

    @FindBy(id = path + "itabUrgency")
    private WebElement itabUrgency;

    @FindBy(id = path + "targetLiveDate")
    private WebElement targetLiveDate;

    @FindBy(id = path + "itabPresenterID")
    private WebElement itabPresenterID;

    @FindBy(id = path + "orgID_filter")
    private WebElement orgID_filter;

    @FindBy(id = path + "orgID:12_15_1_5")
    private WebElement orgID;

    @FindBy(id = path + "cioItManagerID")
    private WebElement cioItManagerID;

    @FindBy(id = path + "appShortCode")
    private WebElement appShortCode;

    @FindBy(id = path + "buttonToSaveGovRegistrationForm")
    private WebElement buttonToSaveGovRegistrationForm;

    @FindBy(id = path + "j_idt111")
    private WebElement yesBtn;

    @FindBy(id = path + "j_idt98")
    private WebElement doneBtn;

    @FindBy(xpath = "//*[@id='form:itgNumber']")
    private WebElement itgNum;

    private String ITGNumber;

    public String completeGovernanceRegistrationForm() throws InterruptedException {
        seleniumUtilities.populateText(topic, faker.funnyName().name());
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(projectDescription, "This is a test mfz");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(purpose, "Information");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(itabUrgency, "High");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateTextDatePicker(targetLiveDate, "04/14/2022");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdownSearch(itabPresenterID, "Attie Anderson (3092569)");
        waitForService.waitForPulse(3);
        javaScriptServices.scrollDown();
        seleniumUtilities.populateText(orgID_filter, "FNB iDigi Tech Support Strategy and Architecture");
        waitForService.waitForPulse(3);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(orgID);
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdownSearch(cioItManagerID, "Attie Anderson (3092569)");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdownSearch(appShortCode, "ABS Suite (ABSSUITE)");
        waitForService.waitForPulse(3);
        seleniumUtilities.click(buttonToSaveGovRegistrationForm);
        waitForService.waitForPulse(3);
        seleniumUtilities.click(yesBtn);
        waitForService.waitForPulse(3);
        ITGNumber = seleniumUtilities.getAttribute(itgNum);
        seleniumUtilities.click(doneBtn);
        
        return ITGNumber;
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.topic.isDisplayed());
    }

}

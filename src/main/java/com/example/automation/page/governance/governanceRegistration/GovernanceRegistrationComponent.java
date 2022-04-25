package com.example.automation.page.governance.governanceRegistration;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
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
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(projectDescription, "This is a test mfz");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(purpose, "Information");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(itabUrgency, "High");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateTextDatePicker(targetLiveDate, "04/14/2022");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdownSearch(itabPresenterID, "Attie Anderson (3092569)");
        seleniumUtilities.waitForPageLoad();
        scrollDown();
        seleniumUtilities.populateText(orgID_filter, "FNB iDigi Tech Support Strategy and Architecture");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(orgID);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdownSearch(cioItManagerID, "Attie Anderson (3092569)");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdownSearch(appShortCode, "ABS Suite (ABSSUITE)");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(buttonToSaveGovRegistrationForm);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(yesBtn);
        seleniumUtilities.waitForPageLoad();
        ITGNumber = seleniumUtilities.getAttribute(itgNum);
        seleniumUtilities.click(doneBtn);
        
        return ITGNumber;
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.topic.isDisplayed());
    }

}

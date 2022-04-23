package com.example.automation.page.governance.governanceMaintanance;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.SeleniumService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class GovernanceMaintananceComponent extends Base {

    private static final String path = "form:registrationList:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @FindBy(id = path + "j_idt27:filter")
    private WebElement referenceNumber;

    @FindBy(xpath = "//*[@id='form:registrationList:0:j_idt18']/a/span[@title='Edit Row']")
    private WebElement EditTick;

    @FindBy(id = path + "0:itabDate")
    private WebElement itabDate;

    @FindBy(id = path + "0:itabOutcomeInput")
    private WebElement itabOutcome;

    @FindBy(xpath = "//*[@id='form:registrationList:0:j_idt18']/a/span[@title='Save Row']")
    private WebElement confirmTick;

   

    public void completeGovernanceMaintananceForm(String itgNumber) {
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(referenceNumber, itgNumber);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(EditTick);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateTextDatePicker(itabDate, "04/24/2022");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(itabOutcome, "Approve");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(confirmTick);



    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.referenceNumber.isDisplayed());
    }

}

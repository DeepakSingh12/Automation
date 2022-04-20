package com.example.automation.page.drParticipation.drParticipationForm;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.SeleniumService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class DRParticipationFormComponent extends Base {

    private static final String path = "form:applicationList:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @FindBy(id = path + "j_idt27:filter")
    private WebElement nameOfApplication;

    @FindBy(xpath = "//*[@id='form:applicationList:0:j_idt88']/a/span[@title='Edit Row']")
    private WebElement EditTick;

    @FindBy(id = path + "0:hostinglocation_in")
    private WebElement hostinglocation;

    @FindBy(id = path + "0:rto_in_input")
    private WebElement rto;

    @FindBy(id = path + "0:isParticipatingInDR")
    private WebElement isParticipatingInDR;

    @FindBy(id = path + "0:drChampionID_input")
    private WebElement drChampionID;

    @FindBy(id = path + "0:drLocation2021")
    private WebElement drLocation2021;

    @FindBy(id = path + "0:drComment")
    private WebElement drComment;

    @FindBy(xpath = "//*[@id='form:applicationList:0:j_idt88']/a/span[@title='Save Row']")
    private WebElement SaveRow;


    public void completeDRParticipationForm() {

        seleniumUtilities.populateText(nameOfApplication, "Annie");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(EditTick);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(hostinglocation, "Other");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(rto, "450");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(isParticipatingInDR, "Yes");
        // seleniumUtilities.waitForPageLoad();
        // seleniumUtilities.selectDropdownSearch(drChampionID, "Attie Anderson (3092569)");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(drLocation2021, "Red3");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(drComment, "Waa dub la dub");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(SaveRow);

    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.nameOfApplication.isDisplayed());
    }
    
}

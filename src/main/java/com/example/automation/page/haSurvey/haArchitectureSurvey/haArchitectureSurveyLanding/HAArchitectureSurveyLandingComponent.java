package com.example.automation.page.haSurvey.haArchitectureSurvey.haArchitectureSurveyLanding;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ApplicationDataService;
import com.example.automation.sanchez.services.SeleniumService;
import com.example.automation.sanchez.services.WaitForService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class HAArchitectureSurveyLandingComponent extends Base{
    
    private static final String path = "HADataQualityListForm:datalist:";

    @Autowired
    private ApplicationDataService applicationDataService;

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private WaitForService waitForService;

    @FindBy(id = path + "nameOfApplicationInput")
    private WebElement nameOfApplicationInput;

    @FindBy(xpath ="//*[@id='HADataQualityListForm:datalist:0:perfectajax']/span[contains(text(), 'Edit')]")
    private WebElement editTick;

    public void serachApplication() throws InterruptedException {
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(nameOfApplicationInput, applicationDataService.getApplicationName());
        //seleniumUtilities.populateText(nameOfApplicationInput, "Cal Culator");
        seleniumUtilities.waitForPageLoad();
        waitForService.waitForElementPresent("//*[@id='HADataQualityListForm:datalist:0:ajax1' and contains(text(),'"+applicationDataService.getApplicationName()+"')]/../following-sibling::td/a");
        //waitForService.waitForElementPresent("//*[@id='HADataQualityListForm:datalist:0:ajax1' and contains(text(),'Cal Culator')]/../following-sibling::td/a");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(editTick);
        seleniumUtilities.waitForPageLoad();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.nameOfApplicationInput.isDisplayed() && this.nameOfApplicationInput.isEnabled()));
    }



}

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

    public void searchApplication() throws InterruptedException {
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(nameOfApplicationInput, applicationDataService.getApplicationName());
        //seleniumUtilities.populateText(nameOfApplicationInput, "Ann Chovie");
        waitForService.waitForPulse(3);
        waitForService.waitForElementPresent("//*[@id='HADataQualityListForm:datalist:0:ajax1' and contains(text(),'"+applicationDataService.getApplicationName()+"')]/../following-sibling::td/a");
        //waitForService.waitForElementPresent("//*[@id='HADataQualityListForm:datalist:0:ajax1' and contains(text(),'Ann Chovie')]/../following-sibling::td/a");
        waitForService.waitForPulse(3);
        seleniumUtilities.click(editTick);
        waitForService.waitForPulse(3);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.nameOfApplicationInput.isDisplayed() && this.nameOfApplicationInput.isEnabled()));
    }



}

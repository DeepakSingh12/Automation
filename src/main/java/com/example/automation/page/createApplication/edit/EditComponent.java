package com.example.automation.page.createApplication.edit;

import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.JavaScriptServices;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class EditComponent extends Base {
    private static final String path = "ApplicationsEditForm:editAccordion:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService; 

    @Autowired
    private JavaScriptServices javaScriptServices;

    // BusinessAttributes
    @FindBy(id = path + "BusinessAttributesTab_header")
    private WebElement businessAttributesTab;

    @FindBy(id = path + "XPlatformIndicator")
    private WebElement XPlatformIndicator;

    @FindBy(id = path + "BusinessCategory")
    private WebElement BusinessCategory;

    @FindBy(id = path + "BusinessFunction")
    private WebElement BusinessFunction;

    @FindBy(id = path + "BusinessCapability")
    private WebElement BusinessCapability;

    @FindBy(id = path + "applicationHealth_BFit")
    private WebElement applicationHealth_BFit;

    @FindBy(id = path + "applicationHealth_TFit")
    private WebElement applicationHealth_TFit;

    @FindBy(id = path + "applicationLifeCycle")
    private WebElement applicationLifeCycle;

    @FindBy(xpath = "//*[@id='ApplicationsEditForm:editAccordion:BusinessAttributes:appCriticalitycheckbox']/div[2]/span")
    private WebElement businessAttributesCheckbox;

    // Finance
    @FindBy(id = path + "CostsTab_header")
    private WebElement CostsTab;

    @FindBy(id = path + "ApplicationCosts:V_BDG_DirExtCost_2022_input")
    private WebElement V_BDG_DirExtCost_2021_input;

    @FindBy(id = path + "ApplicationCosts:V_BDG_InDirExtCost_2022_input")
    private WebElement V_BDG_InDirExtCost_2021_input;

    @FindBy(id = path + "ApplicationCosts:V_BDG_Vat_2022_input")
    private WebElement V_BDG_Vat_2021_input;

    @FindBy(id = path + "ApplicationCosts:V_BDG_SLACost_2022_input")
    private WebElement V_BDG_SLACost_2021_input;

    @FindBy(id = path + "ApplicationCosts:V_BDG_Staff_2022_input")
    private WebElement V_BDG_Staff_2021_input;

    @FindBy(id = path + "ApplicationCosts:V_BDG_OthIntCost_2022_input")
    private WebElement V_BDG_OthIntCost_2021_input;

    @FindBy(id = path + "ApplicationCosts:V_ACT_DirExtCost_2021_input")
    private WebElement V_ACT_DirExtCost_2020_input;

    @FindBy(id = path + "ApplicationCosts:V_ACT_InDirExtCost_2022_input")
    private WebElement V_ACT_InDirExtCost_2020_input;

    @FindBy(id = path + "ApplicationCosts:V_ACT_Vat_2021_input")
    private WebElement V_ACT_Vat_2020_input;

    @FindBy(id = path + "ApplicationCosts:V_ACT_SLACost_2021_input")
    private WebElement V_ACT_SLACost_2020_input;

    @FindBy(id = path + "ApplicationCosts:V_ACT_Staff_2021_input")
    private WebElement V_ACT_Staff_2020_input;

    @FindBy(id = path + "ApplicationCosts:V_ACT_OthIntCost_2021_input")
    private WebElement V_ACT_OthIntCost_2020_input;

    @FindBy(id = path + "j_idt380:percentrun22_23_input")
    private WebElement percentrun21_22_input;

    @FindBy(id = path + "j_idt380:percentchange22_23_input")
    private WebElement percentchange21_22_input;

    @FindBy(id = path + "j_idt380:percentprotect22_23_input")
    private WebElement percentprotect21_22_input;

    @FindBy(id = path + "j_idt380:percentxinit22_23_input")
    private WebElement percentxinit21_22_input;

    @FindBy(xpath = "//*[@id='ApplicationsEditForm:editAccordion:FinanceAttributes:appCriticalitycheckbox']/div[2]/span")
    private WebElement FinanceAttributesCheckbox;

    // ApplicationIntegration

    @FindBy(id = path + "ApplicationIntegrationTab_header")
    private WebElement ApplicationIntegrationTab;

    @FindBy(id = path + "appIntegrationComponent:sourceOrTarget1")
    private WebElement sourceOrTarget1;

    @FindBy(id = path + "appIntegrationComponent:Target1_input")
    private WebElement Target1_input;

    @FindBy(xpath = "//*[@id='ApplicationsEditForm:editAccordion:appIntegrationComponent:Target1_panel']")
    private WebElement option;

    @FindBy(id = path + "appIntegrationComponent:IntegrationMechanism1")
    private WebElement IntegrationMechanism1;

    @FindBy(id = path + "appIntegrationComponent:IntegrationType1")
    private WebElement IntegrationType1;

    @FindBy(id = path + "appIntegrationComponent:criticalLink1")
    private WebElement criticalLink1;

    @FindBy(id = path + "appIntegrationComponent:j_idt519")
    private WebElement addIntergrationsPointsBtn;

    @FindBy(id = path + "appIntegrationComponent:integrationCompletedCheckBox")
    private WebElement conformationBtn;

    @FindBy(xpath = "//*[@id='ApplicationsEditForm:editAccordion:Integrations:appCriticalitycheckbox']/div[2]/span")
    private WebElement IntegrationsCheckbox;

    // Criticality
    @FindBy(id = path + "CriticalityTab_header")
    private WebElement CriticalityTab;

    @FindBy(id = path + "criticalApp")
    private WebElement criticalApp;

    @FindBy(id = path + "businessImpactOfA24hrApplicationDowntime")
    private WebElement businessImpactOfA24hrApplicationDowntime;

    @FindBy(id = path + "rto_input")
    private WebElement rto_input;

    @FindBy(id = path + "rpo_input")
    private WebElement rpo_input;

    @FindBy(id = path + "applicationRequiresSupportFrom")
    private WebElement applicationRequiresSupportFrom;

    @FindBy(xpath = "//*[@id='ApplicationsEditForm:editAccordion:ApplicationCriticality:appCriticalitycheckbox']/div[2]/span")
    private WebElement criticalityCheckbox;

    // Infrastructure
    @FindBy(id = path + "InfrastructureTab_header")
    private WebElement InfrastructureTab;

    @FindBy(id = path + "dateofLastDRTest_input")
    private WebElement dateofLastDRTest;

    @FindBy(id = path + "isParticipatingInDR")
    private WebElement isParticipatingInDR;

    @FindBy(id = path + "drLocation2021")
    private WebElement drLocation2021;

    @FindBy(id = path + "drComment")
    private WebElement drComment;

    @FindBy(id = path + "drChampionID")
    private WebElement drChampionID;

    @FindBy(xpath = "//*[@id='ApplicationsEditForm:editAccordion:InfrastructureDRConfirmed:appCriticalitycheckbox']/div[2]/span")
    private WebElement DRConfirmedCheckbox;

    // Security
    @FindBy(id = path + "SecurityTab_header")
    private WebElement SecurityTab;

    @FindBy(id = path + "systemClassification")
    private WebElement systemClassification;

    @FindBy(id = path + "functionalClassification")
    private WebElement functionalClassification;

    @FindBy(id = path + "dataClassification")
    private WebElement dataClassification;

    @FindBy(id = path + "internetFacing")
    private WebElement internetFacing;

    @FindBy(id = path + "POPIData")
    private WebElement POPIData;

    @FindBy(id = path + "thirdPartyIntegration")
    private WebElement thirdPartyIntegration;

    @FindBy(id = path + "PCIData")
    private WebElement PCIData;

    @FindBy(id = path + "Sec_2FA_FEB")
    private WebElement Sec_2FA_FEB;

    @FindBy(id = path + "Sec_2FA_BEB")
    private WebElement Sec_2FA_BEB;

    @FindBy(id = path + "sec_PAM_Dep")
    private WebElement sec_PAM_Dep;

    @FindBy(id = path + "sec_IAG_OAR")
    private WebElement sec_IAG_OAR;

    @FindBy(id = path + "sec_IAG_ORBP")
    private WebElement sec_IAG_ORBP;

    @FindBy(id = path + "Sec_PRI_AM")
    private WebElement Sec_PRI_AM;

    @FindBy(id = path + "sec_CCS")
    private WebElement sec_CCS;

    @FindBy(xpath = "//*[@id='ApplicationsEditForm:editAccordion:SecurityAttributes:appCriticalitycheckbox']/div[2]/span")
    private WebElement SecurityCheckbox;

    @FindBy(id = "ApplicationsEditForm:bottomSaveButton")
    private WebElement SaveButton;

    public void completeBusinessAttributesTab() throws IOException {
        seleniumUtilities.click(businessAttributesTab);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(XPlatformIndicator, "On Platform");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(BusinessCategory, "Business Product");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(BusinessFunction, "Markets and Structuring");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(BusinessCapability, "This a test ");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(applicationHealth_BFit, "Average");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(applicationHealth_TFit, "Average");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(applicationLifeCycle, "Mature");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(businessAttributesCheckbox);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        javaScriptServices.scrollUp();
        seleniumUtilities.click(businessAttributesTab);

    }

    public void completeApplicationIntegration() throws IOException {
        seleniumUtilities.click(ApplicationIntegrationTab);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(sourceOrTarget1, "Incoming");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(Target1_input, "WW");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(option);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(IntegrationMechanism1, "REST");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(IntegrationType1, "Queue");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(criticalLink1, "BusinessCritical");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(addIntergrationsPointsBtn);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(conformationBtn);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(IntegrationsCheckbox);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        javaScriptServices.scrollUp();
        seleniumUtilities.click(ApplicationIntegrationTab);

    }

    public void completeFinance() throws IOException {
        seleniumUtilities.click(CostsTab);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_BDG_DirExtCost_2021_input, "250");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_BDG_InDirExtCost_2021_input, "250");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_BDG_Vat_2021_input, "250");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_BDG_SLACost_2021_input, "250");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_BDG_Staff_2021_input, "250");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_BDG_OthIntCost_2021_input, "250");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_ACT_DirExtCost_2020_input, "100");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_ACT_InDirExtCost_2020_input, "100");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_ACT_Vat_2020_input, "100");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_ACT_SLACost_2020_input, "100");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_ACT_Staff_2020_input, "100");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(V_ACT_OthIntCost_2020_input, "100");
        
        javaScriptServices.scrollDown();
        seleniumUtilities.populateText(percentrun21_22_input, "25");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(percentchange21_22_input, "25");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(percentprotect21_22_input, "25");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(percentxinit21_22_input, "25");
        seleniumUtilities.click(FinanceAttributesCheckbox);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        javaScriptServices.scrollUp();
        javaScriptServices.scrollUp();
        seleniumUtilities.click(CostsTab);

    }

    public void completeCriticality() throws IOException {
        seleniumUtilities.click(CriticalityTab);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(criticalApp);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(businessImpactOfA24hrApplicationDowntime, "Significant Impact");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(rto_input, "420");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(rpo_input, "196");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(applicationRequiresSupportFrom,
                "Resources and skills required to maintain the application are usually available in the marketplace.");
        seleniumUtilities.click(criticalityCheckbox);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        javaScriptServices.scrollUp();
        seleniumUtilities.click(CriticalityTab);

    }

    public void completeInfrastructure() throws IOException {
        seleniumUtilities.click(InfrastructureTab);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(dateofLastDRTest, "03/31/2022");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(isParticipatingInDR, "Yes");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(drLocation2021, "Red3");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(drComment, "This is a test");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdownSearch(drChampionID, "Andre Goliath (2865912)");
        seleniumUtilities.waitForPageLoad();
        javaScriptServices.scrollDown();
        seleniumUtilities.click(DRConfirmedCheckbox);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        javaScriptServices.scrollUp();
        seleniumUtilities.click(InfrastructureTab);

    }

    public void completeSecurity() throws IOException {
        // Security Risk Attributes
        seleniumUtilities.click(SecurityTab);
        javaScriptServices.scrollDown();
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(systemClassification, "Business Critical");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(functionalClassification, "Transact");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dataClassification, "Public");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(internetFacing);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(POPIData);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(thirdPartyIntegration);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(PCIData);
        // Security Controls
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(Sec_2FA_FEB, "Digitag");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(Sec_2FA_BEB, "Digitag");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(sec_PAM_Dep, "Full");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(sec_IAG_OAR, "Automated");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(sec_IAG_ORBP, "Automated");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(Sec_PRI_AM, "AD (Single Sign On)");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(sec_CCS, "Full");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.click(SecurityCheckbox);
        seleniumUtilities.waitForPageLoad();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        javaScriptServices.scrollUp();
        seleniumUtilities.click(SecurityTab);

    }

    public void clickSaveBtn() throws IOException {
        seleniumUtilities.waitForPageLoad();
        javaScriptServices.scrollDown();
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(SaveButton);
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.businessAttributesTab.isDisplayed() && this.businessAttributesTab.isEnabled()));
    }

}

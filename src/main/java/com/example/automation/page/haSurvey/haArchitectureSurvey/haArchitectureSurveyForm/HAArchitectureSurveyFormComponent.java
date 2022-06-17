package com.example.automation.page.haSurvey.haArchitectureSurvey.haArchitectureSurveyForm;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.JavaScriptServices;
import com.example.automation.sanchez.services.SeleniumService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class HAArchitectureSurveyFormComponent extends Base {

    private static final String path = "ApplicationsEditForm:editAccordion:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private JavaScriptServices javaScriptServices;

    // HA Architecture

    @FindBy(id = path + "HAArchitectureTab_header")
    private WebElement HAArchitectureTab;

    @FindBy(id = path + "rto_input")
    private WebElement rto;

    @FindBy(id = path + "rpo_input")
    private WebElement rpo;

    @FindBy(id = path + "appdeployonprem")
    private WebElement appdeployonprem;

    @FindBy(id = path + "appdeployoncloud")
    private WebElement appdeployoncloud;

    @FindBy(id = path + "dbdeployonprem")
    private WebElement dbdeployonprem;

    @FindBy(id = path + "dbdeployoncloud")
    private WebElement dbdeployoncloud;

    @FindBy(id = path + "appinecenv")
    private WebElement appinecenv;

    @FindBy(id = path + "techforappreplication")
    private WebElement techforappreplication;

    @FindBy(id = path + "appmultinodes")
    private WebElement appmultinodes;

    @FindBy(id = path + "appnodefailstillavail")
    private WebElement appnodefailstillavail;

    @FindBy(id = path + "sharedvlanoraciepg")
    private WebElement sharedvlanoraciepg;

    @FindBy(id = path + "vlanstretchorisolate")
    private WebElement vlanstretchorisolate;

    @FindBy(id = path + "f5orlbpresentation")
    private WebElement f5orlbpresentation;

    @FindBy(id = path + "f5orlbapp")
    private WebElement f5orlbapp;

    @FindBy(id = path + "f5orlbdb")
    private WebElement f5orlbdb;

    @FindBy(id = path + "apptomicroservices")
    private WebElement apptomicroservices;

    @FindBy(id = path + "apptomicroservicespercent_input")
    private WebElement apptomicroservicespercent;

    // Management of deployment and monitoring tools

    @FindBy(id = path + "MonitoringToolsTab_header")
    private WebElement MonitoringToolsTab;

    @FindBy(id = path + "appselforissmanaged")
    private WebElement appselforissmanaged;

    @FindBy(id = path + "dbselforissmanaged")
    private WebElement dbselforissmanaged;

    @FindBy(id = path + "appmonitortoolsha")
    private WebElement appmonitortoolsha;

    @FindBy(id = path + "appmonitortoolsdcfail")
    private WebElement appmonitortoolsdcfail;

    @FindBy(id = path + "deploytoolsha")
    private WebElement deploytoolsha;

    @FindBy(id = path + "appdeploydcfail")
    private WebElement appdeploydcfail;

    // Testing

    @FindBy(id = path + "TestingTab_header")
    private WebElement TestingTab;

    @FindBy(id = path + "apprebuildinstall")
    private WebElement apprebuildinstall;

    @FindBy(id = path + "howoftentesting")
    private WebElement howoftentesting;

    @FindBy(id = path + "dedicatedtestenv")
    private WebElement dedicatedtestenv;

    @FindBy(id = path + "dedicatedloadtestenv")
    private WebElement dedicatedloadtestenv;

    @FindBy(id = path + "loadtestenvrepresentlive")
    private WebElement loadtestenvrepresentlive;

    @FindBy(id = path + "loadtestincludedepapps")
    private WebElement loadtestincludedepapps;

    @FindBy(id = path + "apploadtest")
    private WebElement apploadtest;

    @FindBy(id = path + "howoftenloadtesting")
    private WebElement howoftenloadtesting;

    @FindBy(id = path + "loadtestslowdowndepapps")
    private WebElement loadtestslowdowndepapps;

    @FindBy(id = path + "loadtestslowdowndepappsissues")
    private WebElement loadtestslowdowndepappsissues;

    // Database

    @FindBy(id = path + "DatabaseTab_header")
    private WebElement DatabaseTab;

    @FindBy(id = path + "apphasdb")
    private WebElement apphasdb;

    @FindBy(id = path + "dbonlineandrestarchived")
    private WebElement dbonlineandrestarchived;

    @FindBy(id = path + "monthsdataonline_input")
    private WebElement monthsdataonline;

    @FindBy(id = path + "dbprodingb_input")
    private WebElement dbprodingb;

    @FindBy(id = path + "dbbackuphowoften")
    private WebElement dbbackuphowoften;

    @FindBy(id = path + "dbmonthlybackuphowlongkeeping_input")
    private WebElement dbmonthlybackuphowlongkeeping;

    @FindBy(id = path + "dbrestoretestregular")
    private WebElement dbrestoretestregular;

    @FindBy(id = path + "dbtechpointintime")
    private WebElement dbtechpointintime;

    @FindBy(id = path + "usingdbtechpointintime")
    private WebElement usingdbtechpointintime;

    @FindBy(id = path + "dbcopyforfailover")
    private WebElement dbcopyforfailover;

    @FindBy(id = path + "dbreplication")
    private WebElement dbreplication;

    @FindBy(id = path + "techfordbreplication")
    private WebElement techfordbreplication;

    @FindBy(id = path + "singledbinstanceforapps")
    private WebElement singledbinstanceforapps;

    @FindBy(id = path + "quorumfordbfailure")
    private WebElement quorumfordbfailure;

    @FindBy(id = path + "relationaldbtech")
    private WebElement relationaldbtech;

    @FindBy(id = path + "nosqldbtech")
    private WebElement nosqldbtech;

    @FindBy(xpath = "//*[@id='ApplicationsEditForm:bottomSaveButton']")
    private WebElement saveBtn;

    public void completeHASurvey() throws InterruptedException {
        seleniumUtilities.populateText(rto, "169");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(rpo, "430");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appdeployonprem, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appdeployoncloud, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbdeployonprem, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbdeployoncloud, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appinecenv, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(techforappreplication, "Stuff nobody wants");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appmultinodes, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appnodefailstillavail, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(sharedvlanoraciepg, "Both");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(vlanstretchorisolate, "Both");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(f5orlbpresentation, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(f5orlbapp, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(f5orlbdb, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(apptomicroservices, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(apptomicroservicespercent, "50");
        waitForService.waitForPulse(3);
        javaScriptServices.scrollUp();
        seleniumUtilities.click(HAArchitectureTab);
        javaScriptServices.scrollDown();
        seleniumUtilities.click(MonitoringToolsTab);
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appselforissmanaged, "Other");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbselforissmanaged, "Other");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appmonitortoolsha, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appmonitortoolsdcfail, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(deploytoolsha, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(appdeploydcfail, "No");
        javaScriptServices.scrollUp();
        seleniumUtilities.click(MonitoringToolsTab);
        javaScriptServices.scrollDown();
        seleniumUtilities.click(TestingTab);
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(apprebuildinstall, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(howoftentesting, "Weekly");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dedicatedtestenv, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dedicatedloadtestenv, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(loadtestenvrepresentlive, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(loadtestincludedepapps, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(apploadtest, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(howoftenloadtesting, "Weekly");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(loadtestslowdowndepapps, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(loadtestslowdowndepappsissues, "Fuck all lol");
        javaScriptServices.scrollUp();
        seleniumUtilities.click(TestingTab);
        javaScriptServices.scrollDown();
        seleniumUtilities.click(DatabaseTab);
        waitForService.waitForPulse(3);
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(apphasdb, "Yes");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbonlineandrestarchived, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(monthsdataonline, "169");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(dbprodingb, "420");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbbackuphowoften, "Weekly");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(dbmonthlybackuphowlongkeeping, "169");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbrestoretestregular, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbtechpointintime, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(usingdbtechpointintime, "No");
        javaScriptServices.scrollDown();
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbcopyforfailover, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(dbreplication, "Sync");
        waitForService.waitForPulse(3);
        seleniumUtilities.populateText(techfordbreplication, "Nothing B");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(singledbinstanceforapps, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(quorumfordbfailure, "No");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(relationaldbtech, "DB2");
        waitForService.waitForPulse(3);
        seleniumUtilities.selectDropdown(nosqldbtech, "Cassandra");
        javaScriptServices.scrollUp();
        seleniumUtilities.click(DatabaseTab);
        seleniumUtilities.click(saveBtn);

    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.HAArchitectureTab.isDisplayed());
    }

}

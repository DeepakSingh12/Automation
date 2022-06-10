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

    public void completeHASurvey() {
        seleniumUtilities.populateText(rto, "169");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(rpo, "430");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appdeployonprem, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appdeployoncloud, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbdeployonprem, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbdeployoncloud, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appinecenv, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(techforappreplication, "Stuff nobody wants");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appmultinodes, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appnodefailstillavail, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(sharedvlanoraciepg, "Both");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(vlanstretchorisolate, "Both");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(f5orlbpresentation, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(f5orlbapp, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(f5orlbdb, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(apptomicroservices, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(apptomicroservicespercent, "50");
        seleniumUtilities.waitForPageLoad();
        javaScriptServices.scrollUp();
        seleniumUtilities.click(HAArchitectureTab);
        javaScriptServices.scrollDown();
        seleniumUtilities.click(MonitoringToolsTab);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appselforissmanaged, "Other");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbselforissmanaged, "Other");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appmonitortoolsha, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appmonitortoolsdcfail, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(deploytoolsha, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(appdeploydcfail, "No");
        javaScriptServices.scrollUp();
        seleniumUtilities.click(MonitoringToolsTab);
        javaScriptServices.scrollDown();
        seleniumUtilities.click(TestingTab);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(apprebuildinstall, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(howoftentesting, "Weekly");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dedicatedtestenv, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dedicatedloadtestenv, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(loadtestenvrepresentlive, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(loadtestincludedepapps, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(apploadtest, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(howoftenloadtesting, "Weekly");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(loadtestslowdowndepapps, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(loadtestslowdowndepappsissues, "Fuck all lol");
        javaScriptServices.scrollUp();
        seleniumUtilities.click(TestingTab);
        javaScriptServices.scrollDown();
        seleniumUtilities.click(DatabaseTab);
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(apphasdb, "Yes");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbonlineandrestarchived, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(monthsdataonline, "169");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(dbprodingb, "420");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbbackuphowoften, "Weekly");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(dbmonthlybackuphowlongkeeping, "169");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbrestoretestregular, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbtechpointintime, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(usingdbtechpointintime, "No");
        javaScriptServices.scrollDown();
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbcopyforfailover, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(dbreplication, "Sync");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.populateText(techfordbreplication, "Nothing B");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(singledbinstanceforapps, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(quorumfordbfailure, "No");
        seleniumUtilities.waitForPageLoad();
        seleniumUtilities.selectDropdown(relationaldbtech, "DB2");
        seleniumUtilities.waitForPageLoad();
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

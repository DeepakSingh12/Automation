package com.example.automation.haSurveyTest;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.haSurvey.haArchitectureSurvey.haArchitectureSurveyForm.HAArchitectureSurveyFormPage;
import com.example.automation.page.haSurvey.haArchitectureSurvey.haArchitectureSurveyLanding.HAArchitectureSurveyLandingPage;
import com.example.automation.page.haSurvey.haSurveyBulkImport.HASurveyBulkImportLandingPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;
import com.example.automation.sanchez.services.ApplicationDataService;

public class HASurveyTest extends SpringTestNGTest {

    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private HASurveyBulkImportLandingPage haSurveyBulkImportLandingPage;

    @LazyAutowired
    private HAArchitectureSurveyLandingPage haArchitectureSurveyLandingPage;

    @LazyAutowired
    private HAArchitectureSurveyFormPage HAArchitectureSurveyFormPage;

    @LazyAutowired
    private ApplicationDataService applicationDataService;

    @Test(priority = 1)
    public void haSurveyTest() throws InterruptedException, IOException {
        this.loginPage.goTo();
        if (!(this.loginPage.getLoginComponent().loginBypass())) {
            Assert.assertTrue(this.loginPage.isAt());
            this.loginPage.getLoginComponent().completeForm();
        }

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickHASurvey();
        ;

        Assert.assertTrue(this.haArchitectureSurveyLandingPage.isAt());
        this.haArchitectureSurveyLandingPage.getHaArchitectureSurveyLandingComponent().searchApplication();

        Assert.assertTrue(this.HAArchitectureSurveyFormPage.isAt());
        this.HAArchitectureSurveyFormPage.getHaArchitectureSurveyFormComponent().completeHASurvey();

    }

    @Test(priority = 2)
    public void haBulkUploadTest() throws InterruptedException, IOException, AWTException {
        this.loginPage.goTo();
        if (!(this.loginPage.getLoginComponent().loginBypass())) {
            Assert.assertTrue(this.loginPage.isAt());
            this.loginPage.getLoginComponent().completeForm();
        }

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickHASurveyBulkImport();

        Assert.assertTrue(this.haSurveyBulkImportLandingPage.isAt());
        this.haSurveyBulkImportLandingPage.getHaSurveyBulkImportLandingComponent()
                .haUploadTest(applicationDataService.getApplicationName());

    }

}

package com.example.automation.bulkImportTest;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.bulkImport.BulkImportLandingPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;
import com.example.automation.sanchez.services.ApplicationDataService;

public class BulkImportTest extends SpringTestNGTest {
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private BulkImportLandingPage bulkImportLandingPage;

    @LazyAutowired
    private ApplicationDataService applicationDataService;

    

    @Test
    public void bulkImportTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();

        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().identityUploadTest(applicationDataService.getApplicationName());

    }

    @Test
    public void bulkImportBusinessTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();

        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().businessUploadTest(applicationDataService.getApplicationName());

    }

    @Test
    public void bulkImportFinanceTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();

        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().financeUploadTest(applicationDataService.getApplicationName());

    }

    @Test
    public void bulkImportIntegrationsTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();

        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().intergrationsUploadTest(applicationDataService.getApplicationName());

    }

    @Test
    public void bulkImportOwnershipTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();

        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().ownershipUploadTest(applicationDataService.getApplicationName());

    }

    @Test
    public void bulkImportCriticalityTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();

        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().criticalityUploadTest(applicationDataService.getApplicationName());

    }

    @Test
    public void bulkImportLifecycleTest() throws IOException, InterruptedException, AWTException {
        this.loginPage.goTo();

        Assert.assertTrue(this.loginPage.isAt());
        this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().lifecycleUploadTest(applicationDataService.getApplicationName());

    }

    @Test
    public void bulkImportInfrastructureTest() throws IOException, InterruptedException, AWTException {
        this.loginPage.goTo();
        if (!(this.loginPage.getLoginComponent().loginBypass())) {
            Assert.assertTrue(this.loginPage.isAt());
            this.loginPage.getLoginComponent().completeForm();
        }
        

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().infrastructureUploadTest(applicationDataService.getApplicationName());

    }

    @Test
    public void bulkImportSecurityTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();

        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().securityUploadTest(applicationDataService.getApplicationName());

    }
}

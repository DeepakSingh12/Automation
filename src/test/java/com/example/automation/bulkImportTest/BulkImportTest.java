package com.example.automation.bulkImportTest;

import java.awt.AWTException;
import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.bulkImport.BulkImportLandingPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BulkImportTest extends SpringTestNGTest{
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private BulkImportLandingPage bulkImportLandingPage;

    private final static String AppName = "Eve O'Lution";
 
    @Test
    public void bulkImportTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().identityUploadTest(AppName);


    }

    @Test
    public void bulkImportBusinessTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().businessUploadTest(AppName);


    }

    @Test
    public void bulkImportFinanceTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().financeUploadTest(AppName);


    }

    @Test
    public void bulkImportIntegrationsTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().intergrationsUploadTest(AppName);


    }

    @Test
    public void bulkImportOwnershipTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().ownershipUploadTest(AppName);


    }

    @Test
    public void bulkImportCriticalityTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().criticalityUploadTest(AppName);


    }

    @Test
    public void bulkImportLifecycleTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().lifecycleUploadTest(AppName);


    }

    @Test
    public void bulkImportInfrastructureTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().infrastructureUploadTest(AppName);


    }

    @Test
    public void bulkImportSecurityTest() throws IOException, InterruptedException, AWTException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().securityUploadTest(AppName);


    }
}

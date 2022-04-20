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
 
    @Test
    public void bulkImportTest() throws IOException, InterruptedException, AWTException {
        this.loginPage.goTo();
    
        Assert.assertTrue(this.loginPage.isAt());
        this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickBulkImportTab();

        Assert.assertTrue(this.bulkImportLandingPage.isAt());
        this.bulkImportLandingPage.getBulkImportComponent().identityUploadTest();


    }
}

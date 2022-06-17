package com.example.automation.applicationTabTest.dataQualityTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.application.dataQuality.DataQualityPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;
import com.example.automation.sanchez.services.ApplicationDataService;

public class DataQualityTest extends SpringTestNGTest {
    
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private DataQualityPage dataQualityPage;

    @LazyAutowired
    private ApplicationDataService applicationDataService;

    @Test
    public void dataQualityTest() throws IOException, InterruptedException {
        this.loginPage.goTo();
        if (!this.loginPage.getLoginComponent().loginBypass()) {
            Assert.assertTrue(this.loginPage.isAt());
            this.loginPage.getLoginComponent().completeForm();
        }

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickDataQuailty();

        Assert.assertTrue(this.dataQualityPage.isAt());
        this.dataQualityPage.getDataQualityComponent().clickAllQuickFilters();
        this.dataQualityPage.getDataQualityComponent().searchAndEditApplication(applicationDataService.getApplicationName());


    }
}

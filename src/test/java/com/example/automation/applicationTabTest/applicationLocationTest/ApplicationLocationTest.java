package com.example.automation.applicationTabTest.applicationLocationTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.application.applicationLocation.ApplicationLocationPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationLocationTest extends SpringTestNGTest {
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private ApplicationLocationPage applicationLocationPage;

    @Test
    public void applicationLocationTest() throws IOException, InterruptedException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickApplicationLocation();

        Assert.assertTrue(this.applicationLocationPage.isAt());
        this.applicationLocationPage.getApplicationLocationComponent().clickAllQuickFilters();
        this.applicationLocationPage.getApplicationLocationComponent().editApplicationUsage();
        this.applicationLocationPage.getApplicationLocationComponent().editApplicationUsage();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickApplicationLocation();

        Assert.assertTrue(this.applicationLocationPage.isAt());
        this.applicationLocationPage.getApplicationLocationComponent().clickApplicationDeployment();
        this.applicationLocationPage.getApplicationLocationComponent().clickAllQuickFiltersDeployement();
        this.applicationLocationPage.getApplicationLocationComponent().editApplicationDeployment();
        this.applicationLocationPage.getApplicationLocationComponent().editApplicationDeployment();



    }
}

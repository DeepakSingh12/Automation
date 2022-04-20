package com.example.automation.applicationTabTest.dataQualityTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.application.dataQuality.DataQualityPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataQualityTest extends SpringTestNGTest {
    
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private DataQualityPage dataQualityPage;

    @Test
    public void dataQualityTest() throws IOException, InterruptedException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickDataQuailty();

        Assert.assertTrue(this.dataQualityPage.isAt());
        this.dataQualityPage.getDataQualityComponent().clickAllQuickFilters();
        this.dataQualityPage.getDataQualityComponent().searchAndEditApplication("What's");


    }
}

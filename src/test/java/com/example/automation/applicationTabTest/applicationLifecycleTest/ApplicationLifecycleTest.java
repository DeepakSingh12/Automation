package com.example.automation.applicationTabTest.applicationLifecycleTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.application.applicationLifecycle.ApplicationLifecyclePage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplicationLifecycleTest extends SpringTestNGTest{
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private ApplicationLifecyclePage applicationLifecyclePage;

    @Test
    public void applicationLifecycleTest() throws IOException, InterruptedException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickApplicationLifecycle();

        Assert.assertTrue(this.applicationLifecyclePage.isAt());
        this.applicationLifecyclePage.getApplicationLifecycleComponent().clickAllQuickFilters();

    }
}

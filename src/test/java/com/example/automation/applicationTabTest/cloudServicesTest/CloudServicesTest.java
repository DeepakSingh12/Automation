package com.example.automation.applicationTabTest.cloudServicesTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.application.cloudServices.CloudServicesPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CloudServicesTest extends SpringTestNGTest {
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private CloudServicesPage cloudServicesPage;

    @Test
    public void cloudServicesPage() throws IOException, InterruptedException {
        this.loginPage.goTo();
        if (!this.loginPage.getLoginComponent().loginBypass()) {
            Assert.assertTrue(this.loginPage.isAt());
            this.loginPage.getLoginComponent().completeForm();
        }

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickCloudServices();

        Assert.assertTrue(this.cloudServicesPage.isAt());
        this.cloudServicesPage.getCloudServicesComponent().checkCloudServices();

    }
}

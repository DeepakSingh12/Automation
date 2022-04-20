package com.example.automation.haSurveyTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.haSurvey.haArchitectureSurvey.haArchitectureSurveyForm.HAArchitectureSurveyFormPage;
import com.example.automation.page.haSurvey.haArchitectureSurvey.haArchitectureSurveyLanding.HAArchitectureSurveyLandingPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HASurveyTest extends SpringTestNGTest{

    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private HAArchitectureSurveyLandingPage haArchitectureSurveyLandingPage;

    @LazyAutowired
    private HAArchitectureSurveyFormPage HAArchitectureSurveyFormPage;

    @Test
    public void haSurveyTest() throws InterruptedException, IOException {
        // this.loginPage.goTo();
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickHASurvey();;

        Assert.assertTrue(this.haArchitectureSurveyLandingPage.isAt());
        this.haArchitectureSurveyLandingPage.getHaArchitectureSurveyLandingComponent().serachApplication();

        Assert.assertTrue(this.HAArchitectureSurveyFormPage.isAt());
        this.HAArchitectureSurveyFormPage.getHaArchitectureSurveyFormComponent().completeHASurvey();

        this.landingPage.getLandingComponent().clickHASurvey();
        Assert.assertTrue(this.haArchitectureSurveyLandingPage.isAt());
        this.haArchitectureSurveyLandingPage.getHaArchitectureSurveyLandingComponent().serachApplication();
        
    }
    
}

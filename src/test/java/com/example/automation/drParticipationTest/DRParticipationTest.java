package com.example.automation.drParticipationTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.drParticipation.drParticipationForm.DRParticipationFormPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DRParticipationTest extends SpringTestNGTest{

    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private DRParticipationFormPage drParticipationFormPage;

    @Test
    public void drParticipationTest() throws IOException {
        // this.loginPage.goTo();
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.loginPage.getLoginComponent().waitForHeader("//*[@id='panelWholePage']/div[1]/header/nav/a"));
        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickdrParticipationandForm();

        Assert.assertTrue(this.drParticipationFormPage.isAt());
        this.drParticipationFormPage.getDrParticipationFormComponent().completeDRParticipationForm();
        
    }
    
}

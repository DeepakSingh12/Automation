package com.example.automation.applicationTabTest.manageApplicationPortfolioTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.application.manageApplicationPortfolio.ManageApplicationPortfolioPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageApplicationPortfolioTest extends SpringTestNGTest{
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private ManageApplicationPortfolioPage manageApplicationPortfolioPage;

    @Test
    public void manageApplicationPortfolioTest() throws IOException, InterruptedException {
        // this.loginPage.goTo();
    
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickmanageApplicationPortfolio();;

        Assert.assertTrue(this.manageApplicationPortfolioPage.isAt());
        this.manageApplicationPortfolioPage.getManageApplicationPortfolioComponent().clickAllQuickFilters();
        this.manageApplicationPortfolioPage.getManageApplicationPortfolioComponent().clickAllAttributeSelection();


    }

}

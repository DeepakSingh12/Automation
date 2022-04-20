package com.example.automation.createTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.application.dataQuality.DataQualityPage;
import com.example.automation.page.createApplication.create.CreatePage;
import com.example.automation.page.createApplication.edit.EditPage;
import com.example.automation.page.createApplication.view.ViewPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;
import com.example.automation.sanchez.services.ApplicationDataService;
import com.example.automation.sanchez.services.ScreenshotService;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTest extends SpringTestNGTest {
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private CreatePage createPage;

    @LazyAutowired
    private ViewPage viewPage;

    @LazyAutowired
    private EditPage editPage;

    @LazyAutowired
    private ScreenshotService screenShotUtil;

    @LazyAutowired
    private DataQualityPage dataQualityPage;

    @LazyAutowired
    private ApplicationDataService applicationDataService;

    @Test
    public void createTest() throws IOException, InterruptedException {
        // this.loginPage.goTo();
        // Assert.assertTrue(this.loginPage.isAt());
        // this.loginPage.getLoginComponent().completeForm();
        //Assert.assertTrue(this.loginPage.getLoginComponent().waitForHeader("//*[@id='panelWholePage']/div[1]/header/nav/a"));

        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickCreateTab();

        Assert.assertTrue(this.createPage.isAt());
        this.createPage.getCreateComponent().completeForm();

        Assert.assertTrue(this.viewPage.isAt());
        this.viewPage.getViewComponent().clickEditButton();

        Assert.assertTrue(this.editPage.isAt());
        this.editPage.getEditComponent().completeBusinessAttributesTab();
        this.editPage.getEditComponent().completeFinance();
        this.editPage.getEditComponent().completeApplicationIntegration();
        this.editPage.getEditComponent().completeCriticality();
        this.editPage.getEditComponent().completeInfrastructure();
        this.editPage.getEditComponent().completeSecurity();
        this.editPage.getEditComponent().clickSaveBtn();

        Assert.assertTrue(this.viewPage.isAt());
        this.viewPage.getViewComponent().clickDQButton();

        Assert.assertTrue(this.dataQualityPage.isAt());
        this.dataQualityPage.getDataQualityComponent().searchAndEditApplication(this.applicationDataService.getApplicationName());
    }

}

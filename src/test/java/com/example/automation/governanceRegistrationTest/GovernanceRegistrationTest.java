package com.example.automation.governanceRegistrationTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.governance.governanceMaintanance.GovernanceMaintanancePage;
import com.example.automation.page.governance.governanceRegistration.GovernanceRegistrationPage;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;
import com.example.automation.sanchez.services.ScreenshotService;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GovernanceRegistrationTest extends SpringTestNGTest {

    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @LazyAutowired
    private ScreenshotService screenShotUtil;

    @LazyAutowired
    private GovernanceRegistrationPage governanceRegistrationPage;

    @LazyAutowired
    private GovernanceMaintanancePage governanceMaintanancePage;

    private String itgnumber;

    @Test(priority = 1)
    public void governanceRegistrationTest() throws IOException, InterruptedException {
        this.loginPage.goTo();
        if (!this.loginPage.getLoginComponent().loginBypass()) {
            Assert.assertTrue(this.loginPage.isAt());
            this.loginPage.getLoginComponent().completeForm();
        }
        Assert.assertTrue(
                this.loginPage.getLoginComponent().waitForHeader("//*[@id='panelWholePage']/div[1]/header/nav/a"));
        Assert.assertTrue(this.landingPage.isAt());
        this.landingPage.getLandingComponent().clickGovernanceTabandRegistration();

        Assert.assertTrue(this.governanceRegistrationPage.isAt());
        itgnumber = this.governanceRegistrationPage.getGovernanceRegistrationComponent()
                .completeGovernanceRegistrationForm();

        Assert.assertTrue(this.governanceMaintanancePage.isAt());
        this.governanceMaintanancePage.getGovernanceMaintananceComponent().completeGovernanceMaintananceForm(itgnumber);

    }
}

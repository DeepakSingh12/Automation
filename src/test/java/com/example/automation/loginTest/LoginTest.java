package com.example.automation.loginTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.page.landing.LandingPage;
import com.example.automation.page.login.LoginPage;
import com.example.automation.sanchez.annotation.LazyAutowired;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends SpringTestNGTest {
    @LazyAutowired
    private LoginPage loginPage;

    @LazyAutowired
    private LandingPage landingPage;

    @Test
    public void loginTest() throws IOException, InterruptedException {
        this.loginPage.goTo();
    
        Assert.assertTrue(this.loginPage.isAt());
        this.loginPage.getLoginComponent().completeForm();

    }
}

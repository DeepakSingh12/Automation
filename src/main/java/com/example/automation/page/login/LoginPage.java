package com.example.automation.page.login;

import com.example.automation.sanchez.annotation.Page;
import com.example.automation.page.Base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Page
public class LoginPage extends Base {
    @Autowired
    private LoginComponent loginComponent;

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }

    @Value("${application.url}")
    private String url;

    public void goTo() {
        this.driver.manage().window().maximize();
        this.driver.get(url);
    }

    public void closeBrowser() {
        this.driver.close();
    }

    @Override
    public boolean isAt() {
        return this.loginComponent.isAt();
    }

}

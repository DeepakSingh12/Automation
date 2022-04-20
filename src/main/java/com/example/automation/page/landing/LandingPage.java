package com.example.automation.page.landing;

import com.example.automation.sanchez.annotation.Page;
import com.example.automation.page.Base;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class LandingPage extends Base {

    @Autowired
    private LandingComponent landingComponent;

    public LandingComponent getLandingComponent() {
        return landingComponent;
    }

    @Override
    public boolean isAt() {
        return this.landingComponent.isAt();
    }

}

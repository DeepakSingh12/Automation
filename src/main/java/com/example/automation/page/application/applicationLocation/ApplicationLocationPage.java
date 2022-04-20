package com.example.automation.page.application.applicationLocation;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class ApplicationLocationPage extends Base {

    @Autowired
    private ApplicationLocationComponent applicationLocationComponent;

    public ApplicationLocationComponent getApplicationLocationComponent() {
        return applicationLocationComponent;
    }

    @Override
    public boolean isAt() {
        return this.applicationLocationComponent.isAt();
    }

}

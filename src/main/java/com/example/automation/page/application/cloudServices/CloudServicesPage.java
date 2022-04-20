package com.example.automation.page.application.cloudServices;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class CloudServicesPage extends Base {

    @Autowired
    private CloudServicesComponent cloudServicesComponent;

    public CloudServicesComponent getCloudServicesComponent() {
        return cloudServicesComponent;
    }

    @Override
    public boolean isAt() {
        return this.cloudServicesComponent.isAt();
    }

}

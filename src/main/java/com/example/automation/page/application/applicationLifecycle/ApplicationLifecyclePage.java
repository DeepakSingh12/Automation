package com.example.automation.page.application.applicationLifecycle;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class ApplicationLifecyclePage extends Base {
    
    @Autowired
    private ApplicationLifecycleComponent applicationLifecycleComponent;

    public ApplicationLifecycleComponent getApplicationLifecycleComponent() {
        return applicationLifecycleComponent;
    }

    @Override
    public boolean isAt() {
        return this.applicationLifecycleComponent.isAt();
    }

}

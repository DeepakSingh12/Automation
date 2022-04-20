package com.example.automation.page.createApplication.create;

import com.example.automation.sanchez.annotation.Page;
import com.example.automation.page.Base;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class CreatePage extends Base {

    @Autowired
    private CreateComponent createComponent;

    public CreateComponent getCreateComponent() {
        return createComponent;
    }

    @Override
    public boolean isAt() {
        return this.createComponent.isAt();
    }

}

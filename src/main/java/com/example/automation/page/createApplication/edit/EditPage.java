package com.example.automation.page.createApplication.edit;

import com.example.automation.sanchez.annotation.Page;
import com.example.automation.page.Base;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class EditPage extends Base {

    @Autowired
    private EditComponent editComponent;

    public EditComponent getEditComponent() {
        return editComponent;
    }

    @Override
    public boolean isAt() {
        return this.editComponent.isAt();
    }

}

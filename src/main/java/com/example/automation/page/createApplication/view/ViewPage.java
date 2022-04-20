package com.example.automation.page.createApplication.view;

import com.example.automation.sanchez.annotation.Page;
import com.example.automation.page.Base;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class ViewPage extends Base {

    @Autowired
    private ViewComponent viewComponent;

    public ViewComponent getViewComponent() {
        return viewComponent;
    }

    @Override
    public boolean isAt() {
        return this.viewComponent.isAt();
    }

}

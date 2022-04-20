package com.example.automation.page.application.dataQuality;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class DataQualityPage extends Base{

    @Autowired
    private DataQualityComponent dataQualityComponent;

    public DataQualityComponent getDataQualityComponent() {
        return dataQualityComponent;
    }

    @Override
    public boolean isAt() {
        return this.dataQualityComponent.isAt();
    }



}

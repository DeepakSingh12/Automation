package com.example.automation.page.haSurvey.haSurveyBulkImport;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

@Page
public class HASurveyBulkImportLandingPage extends Base {

    @Autowired
    private HASurveyBulkImportLandingComponent haSurveyBulkImportLandingComponent;

    public HASurveyBulkImportLandingComponent getHaSurveyBulkImportLandingComponent() {
        return haSurveyBulkImportLandingComponent;
    }


    @Override
    public boolean isAt() {
        // TODO Auto-generated method stub
        return this.haSurveyBulkImportLandingComponent.isAt();
    }


}

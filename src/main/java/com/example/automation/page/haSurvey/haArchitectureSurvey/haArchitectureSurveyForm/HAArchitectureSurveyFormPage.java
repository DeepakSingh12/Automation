package com.example.automation.page.haSurvey.haArchitectureSurvey.haArchitectureSurveyForm;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class HAArchitectureSurveyFormPage extends Base {

    @Autowired
    private HAArchitectureSurveyFormComponent haArchitectureSurveyFormComponent;

    public HAArchitectureSurveyFormComponent getHaArchitectureSurveyFormComponent() {
        return haArchitectureSurveyFormComponent;
    }

    @Override
    public boolean isAt() {
       return this.haArchitectureSurveyFormComponent.isAt();
    }

}

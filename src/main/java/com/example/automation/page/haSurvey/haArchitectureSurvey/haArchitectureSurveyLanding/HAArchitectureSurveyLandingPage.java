package com.example.automation.page.haSurvey.haArchitectureSurvey.haArchitectureSurveyLanding;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class HAArchitectureSurveyLandingPage extends Base {

    @Autowired
    private HAArchitectureSurveyLandingComponent haArchitectureSurveyLandingComponent;

    public HAArchitectureSurveyLandingComponent getHaArchitectureSurveyLandingComponent() {
        return haArchitectureSurveyLandingComponent;
    }

    @Override
    public boolean isAt() {
        return this.haArchitectureSurveyLandingComponent.isAt();
    }

}

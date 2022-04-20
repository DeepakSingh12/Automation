package com.example.automation.page.drParticipation.drParticipationForm;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class DRParticipationFormPage extends Base {

    @Autowired
    private DRParticipationFormComponent drParticipationFormComponent;

    public DRParticipationFormComponent getDrParticipationFormComponent() {
        return drParticipationFormComponent;
    }

    @Override
    public boolean isAt() {
        return this.drParticipationFormComponent.isAt();
    }

}

package com.example.automation.page.governance.governanceMaintanance;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class GovernanceMaintanancePage extends Base {

    @Autowired
    private GovernanceMaintananceComponent governanceMaintananceComponent;

    public GovernanceMaintananceComponent getGovernanceMaintananceComponent() {
        return governanceMaintananceComponent;
    }

    @Override
    public boolean isAt() {
        return this.governanceMaintananceComponent.isAt();
    }

}

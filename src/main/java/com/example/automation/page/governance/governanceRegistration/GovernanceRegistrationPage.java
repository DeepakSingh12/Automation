package com.example.automation.page.governance.governanceRegistration;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class GovernanceRegistrationPage extends Base {

    @Autowired
    private GovernanceRegistrationComponent governanceRegistrationComponent;

    public GovernanceRegistrationComponent getGovernanceRegistrationComponent() {
        return governanceRegistrationComponent;
    }

    @Override
    public boolean isAt() {
        return this.governanceRegistrationComponent.isAt();
    }

}

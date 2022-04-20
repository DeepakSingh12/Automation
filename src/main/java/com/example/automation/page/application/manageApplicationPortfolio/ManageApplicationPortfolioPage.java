package com.example.automation.page.application.manageApplicationPortfolio;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class ManageApplicationPortfolioPage extends Base {

    @Autowired
    private ManageApplicationPortfolioComponent manageApplicationPortfolioComponent;

    public ManageApplicationPortfolioComponent getManageApplicationPortfolioComponent() {
        return manageApplicationPortfolioComponent;
    }

    @Override
    public boolean isAt() {

        return this.manageApplicationPortfolioComponent.isAt();
    }

}

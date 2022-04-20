package com.example.automation.page.bulkImport;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.Page;

import org.springframework.beans.factory.annotation.Autowired;

@Page
public class BulkImportLandingPage extends Base {
    @Autowired
    private BulkImportComponent bulkImportComponent;

    public BulkImportComponent getBulkImportComponent() {
        return bulkImportComponent;
    }

    @Override
    public boolean isAt() {
        return this.bulkImportComponent.isAt();
    }

}

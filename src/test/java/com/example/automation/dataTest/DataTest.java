package com.example.automation.dataTest;

import java.io.IOException;

import com.example.automation.SpringTestNGTest;
import com.example.automation.sanchez.services.ExcelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

public class DataTest extends SpringTestNGTest {
    
    @Value("classpath:data/testData.csv")
    private Resource resource;

    @Autowired
    private ExcelService excelService;


    
    @Test
    public void dataTest() throws IOException {
        this.excelService.setData("Integrations_AppsAttributes.xls", "Integrations", "Luke Adam Go");
        this.excelService.readAndWriteExcel("Integration Completed", "false");
        // Files.readAllLines(resource.getFile().toPath())
        // .forEach(System.out::println);
    }

}

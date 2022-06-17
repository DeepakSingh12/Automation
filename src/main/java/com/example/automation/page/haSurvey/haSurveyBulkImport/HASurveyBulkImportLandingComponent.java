package com.example.automation.page.haSurvey.haSurveyBulkImport;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ExcelService;
import com.example.automation.sanchez.services.JavaScriptServices;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;
import com.example.automation.sanchez.services.WaitForService;

@PageFragment
public class HASurveyBulkImportLandingComponent extends Base {

    private static final String path = "BulkUpdate:ExportCard:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService;

    @Autowired
    private WaitForService waitForService;

    @Autowired
    private JavaScriptServices javaScriptServices;

    @Autowired
    private ExcelService excelService;


    @FindBy(xpath = "//*[@id='BulkUpdate:ExportCard:datalist:appExcelExport']/img")
    private WebElement excelDownload;
    
    @FindBy(id = path + "datalist:nameOfApplicationInput")
    private WebElement nameInput;

    @FindBy(xpath = "//*[@id='BulkUpdate:j_idt249:j_idt255_input']/..")
    private WebElement chooseInput;

    @FindBy(xpath = "//span[contains(text(),'Upload')]/..")
    private WebElement uploadInput;

    
    public void haUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(excelDownload);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        this.excelService.setData("_HASurvey.xls", "datalist1", AppName);
        this.excelService.readAndWriteExcel("Maximum business tolerance for service downtime ,Recovery Time Objective (RTO) in minutes", "212");
        this.excelService.readAndWriteExcel("Maximum business tolerance for data loss ,Recovery Point Objective (RPO) in minutes", "818");
        this.excelService.readAndWriteExcel("Is your application deployed on-premise i.e. in Red 1, Red 3 or Red 4?", "No");
        this.excelService.readAndWriteExcel("Is your application deployed to the cloud?", "No");
        this.excelService.readAndWriteExcel("Is your database deployed on-premise i.e. in Red 1, Red 3 or Red 4?", "No");
        this.excelService.readAndWriteExcel("Is your database deployed to the cloud?", "No");
        this.excelService.readAndWriteExcel("Is this application in the enterprise critical environment?", "No");
        this.excelService.readAndWriteExcel("What tech or additional software do you use for your Application for replication / synchronisation / clustering (type None if not used)?", "Excel Writter");
        this.excelService.readAndWriteExcel("Does this application have multiple nodes per data center / availability zone?", "No");
        this.excelService.readAndWriteExcel("Can the application handle node failure within a data center / availability zone and still be available in that data center / availability zone?", "No");
        this.excelService.readAndWriteExcel("Does this application run in its own dedicated VLAN/ACI EPGs or is it shared with other applications?", "Both");
        this.excelService.readAndWriteExcel("Is the VLAN stretched or isolated in separate DCs?", "Both");
        this.excelService.readAndWriteExcel("Do you have F5 or other load balancer fronting presentation tier?", "No");
        this.excelService.readAndWriteExcel("Do you have F5 or other load balancer fronting application tier?", "No");
        this.excelService.readAndWriteExcel("Do you have F5 or other load balancer fronting database tier?", "No");
        this.excelService.readAndWriteExcel("Has this application been broken down into micro-services?", "No");
        this.excelService.readAndWriteExcel("what percentage of this application been broken down into micro-services?", "50");
        this.excelService.readAndWriteExcel("Is your application infrastructure self-managed or I&SS managed?", "Other");
        this.excelService.readAndWriteExcel("Is your database infrastructure self-managed or I&SS managed?", "Other");
        this.excelService.readAndWriteExcel("Is your application management and monitoring tools highly available(HA)?", "No");
        this.excelService.readAndWriteExcel("Can you still manage and monitor your application in the event of a data center failure?", "No");
        this.excelService.readAndWriteExcel("Are your deployment tools highly available(HA)?", "No");
        this.excelService.readAndWriteExcel("Can you still deploy your application in the event of a data centre failure?", "No");
        this.excelService.readAndWriteExcel("Are you able to rebuild / install your application from source?", "No");
        this.excelService.readAndWriteExcel("How often do you test rebuilding/installing your application from source?", "Weekly");
        this.excelService.readAndWriteExcel("Do you have a dedicated TEST environment?", "No");
        this.excelService.readAndWriteExcel("Do you have a dedicated LOAD TEST environment?", "No");
        this.excelService.readAndWriteExcel("Is your LOAD test environment representative of LIVE?", "No");
        this.excelService.readAndWriteExcel("Do your load tests include dependent applications and services?", "No");
        this.excelService.readAndWriteExcel("Do you load test your application on a regular basis?", "No");
        this.excelService.readAndWriteExcel("How often do you perform load testing?", "Weekly");
        this.excelService.readAndWriteExcel("Have you load tested with downstream application slow downs/performance?", "No");
        this.excelService.readAndWriteExcel("Issues faced when load testing with downstream applications slow downs/performance?", "Lol nada");
        this.excelService.readAndWriteExcel("Does your application have a database?", "Yes");
        this.excelService.readAndWriteExcel("Are you only keeping what is required for your application to run from a database perspective online and the rest has been archived or deleted?", "No");
        this.excelService.readAndWriteExcel("How many months of data is online?", "175");
        this.excelService.readAndWriteExcel("How big is your production database (in GB)?", "420");
        this.excelService.readAndWriteExcel("How often do you backup your database (select the shortest frequency)?", "Weekly");
        this.excelService.readAndWriteExcel("How long do you keep your monthly back-ups for (in months)?", "169");
        this.excelService.readAndWriteExcel("Do you test the database restore capability regularly?", "No");
        this.excelService.readAndWriteExcel("Does your database technology have a point in time / journaling mechanism?", "No");
        this.excelService.readAndWriteExcel("Do you use it?", "No");
        this.excelService.readAndWriteExcel("Do you have more than one copy of databases available for manual or automatic failover?", "No");
        this.excelService.readAndWriteExcel("Is your database replication sync or async?", "Sync");
        this.excelService.readAndWriteExcel("What technology or additional software do you use on your database for replication", "Nothing");
        this.excelService.readAndWriteExcel("Do you have a single database instance that all applications talk to?", "No");
        this.excelService.readAndWriteExcel("Where a database cluster needs a quorum, do you have a quorum if you have a database failure?", "No");
        this.excelService.readAndWriteExcel("Please confirm which relational database technology you use primarily", "DB2");
        this.excelService.readAndWriteExcel("Please confirm which NoSQL database technology you use primarily", "Cassandra");
        javaScriptServices.scrollDown();
        seleniumUtilities.click(chooseInput);
        waitForService.waitForPulse(5);
        System.out.println(this.excelService.getFileName().getAbsolutePath());
        seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(uploadInput);
        waitForService.waitForPulse(10);
       
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> this.excelDownload.isDisplayed());
    }

}

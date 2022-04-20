package com.example.automation.page.bulkImport;

import java.awt.AWTException;
import java.io.IOException;

import com.example.automation.page.Base;
import com.example.automation.sanchez.annotation.PageFragment;
import com.example.automation.sanchez.services.ExcelService;
import com.example.automation.sanchez.services.ScreenshotService;
import com.example.automation.sanchez.services.SeleniumService;
import com.example.automation.sanchez.services.WaitForService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

@PageFragment
public class BulkImportComponent extends Base{
    private final static String path = "ApplicationsListForm:ExportCard:";

    @Autowired
    private SeleniumService seleniumUtilities;

    @Autowired
    private ScreenshotService screenshotService;
    
    @Autowired
    private WaitForService waitForService;

    @Autowired
    private ExcelService excelService;

    @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:0']/..")
    private WebElement Identity;

    @FindBy(id = path+"Attributes_Selector:1")
    private WebElement Business;

    @FindBy(id = path+"Attributes_Selector:2")
    private WebElement Finance;

    @FindBy(id = path+"Attributes_Selector:3")
    private WebElement Integrations;

    @FindBy(id = path+"Attributes_Selector:4")
    private WebElement Ownership;

    @FindBy(id = path+"Attributes_Selector:5")
    private WebElement Criticality;

    @FindBy(id = path+"Attributes_Selector:6")
    private WebElement Lifecycle;

    @FindBy(id = path+"Attributes_Selector:7")
    private WebElement Infrastructure;

    @FindBy(id = path+"Attributes_Selector:8")
    private WebElement Security;

    @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:datalist:appExcelExport']/img")
    private WebElement excelDownload;

    @FindBy(id = path+"datalist:nameOfApplicationInput")
    private WebElement nameInput;

    @FindBy(xpath= "//*[@id='ApplicationsListForm:j_idt462:j_idt468_input']/..")
    private WebElement chooseInput;

    @FindBy(xpath= "//span[contains(text(),'Upload')]/..")
    private WebElement uploadInput;

    public void identityUploadTest() throws IOException, InterruptedException, AWTException {
        seleniumUtilities.click(Identity);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(excelDownload);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        this.excelService.setData("Identity_AppsAttributes.xls", "Identity", "Carl Arm");
        this.excelService.readAndWriteExcel("Description", "Excel Data writter works");
        this.excelService.readAndWriteExcel("X-Platform Indicator", "On Platform");
        this.excelService.readAndWriteExcel("Vendor Name", "Bender");
        this.excelService.readAndWriteExcel("Level Of Customisation", "COTS with minor modifications");
        this.excelService.readAndWriteExcel("Application Platform", "Other");
        this.excelService.readAndWriteExcel("Primary Dev Language", "Cobolt");
        this.excelService.readAndWriteExcel("Two Factor Authentication (2FA)", "Token");
        scrollDown();
        seleniumUtilities.click(chooseInput);
        waitForService.waitForPulse(5);
        System.out.println(this.excelService.getFileName().getAbsolutePath());
        seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(uploadInput);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.click(Identity);
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        seleniumUtilities.populateText(nameInput, "Annie Matter");
        waitForService.waitForPulse(5);
        screenshotService.takeScreenShot(this.getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName());



    }


    @Override
    public boolean isAt() {
        return this.wait.until((d) -> (this.Identity.isDisplayed() && this.Identity.isEnabled()));
    } 
}

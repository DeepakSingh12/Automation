package com.example.automation.page.bulkImport;

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
public class BulkImportComponent extends Base {
        private final static String path = "ApplicationsListForm:ExportCard:";

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

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:0']/..")
        private WebElement Identity;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:1']/..")
        private WebElement Business;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:2']/..")
        private WebElement Finance;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:3']/..")
        private WebElement Integrations;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:4']/..")
        private WebElement Ownership;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:5']/..")
        private WebElement Criticality;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:6']/..")
        private WebElement Lifecycle;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:7']/..")
        private WebElement Infrastructure;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:Attributes_Selector:8']/..")
        private WebElement Security;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:ExportCard:datalist:appExcelExport']/img")
        private WebElement excelDownload;

        @FindBy(id = path + "datalist:nameOfApplicationInput")
        private WebElement nameInput;

        @FindBy(xpath = "//*[@id='ApplicationsListForm:j_idt462:j_idt468_input']/..")
        private WebElement chooseInput;

        @FindBy(xpath = "//span[contains(text(),'Upload')]/..")
        private WebElement uploadInput;

        public void identityUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Identity);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Identity_AppsAttributes.xls", "Identity", AppName);
                this.excelService.readAndWriteExcel("Description", "Excel Data writter works");
                this.excelService.readAndWriteExcel("X-Platform Indicator", "On Platform");
                this.excelService.readAndWriteExcel("Vendor Name", "Bender");
                this.excelService.readAndWriteExcel("Level Of Customisation", "COTS with minor modifications");
                this.excelService.readAndWriteExcel("Application Platform", "Other");
                this.excelService.readAndWriteExcel("Primary Dev Language", "Cobolt");
                this.excelService.readAndWriteExcel("Two Factor Authentication (2FA)", "Token");
                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Identity);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                try {
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Description",
                                        "Excel Data writter works");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "X-Platform Indicator",
                                        "On Platform");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Vendor Name", "Bender");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Level Of Customisation",
                                        "COTS with minor modifications");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Application Platform",
                                        "Other");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Primary Dev Language",
                                        "Cobolt");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Two Factor Authentication (2FA)", "Token");
                } catch (Exception e) {
                        // TODO: handle exception
                }

        }

        public void businessUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Business);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Business_AppsAttributes.xls", "Business", AppName);
                this.excelService.readAndWriteExcel("Business Category", "Business Product");
                this.excelService.readAndWriteExcel("Critical Business Function", "Markets and Structuring");
                this.excelService.readAndWriteExcel("Business Capability", "This is a mfz test");
                this.excelService.readAndWriteExcel("Business Fit", "Average");
                this.excelService.readAndWriteExcel("Technical Fit", "Good");
                this.excelService.readAndWriteExcel("Application Lifecycle", "Mature");
                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Business);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                try {
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Business Category",
                                        "Business Product");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Critical Business Function", "Markets and Structuring");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Business Capability",
                                        "This is a mfz test");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Business Fit",
                                        "Average");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Technical Fit",
                                        "Good");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Application Lifecycle",
                                        "Mature");
                        screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                        Thread.currentThread().getStackTrace()[1].getMethodName());

                } catch (Exception e) {
                        // TODO: handle exception
                }

        }

        public void financeUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Finance);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Finance_AppsAttributes.xls", "Finance", AppName);

                this.excelService.readAndWriteExcel("Budgeted - SLACharges FY 20/21", "101");
                this.excelService.readAndWriteExcel("Budgeted - MyStaffCosts FY 20/21", "102");
                this.excelService.readAndWriteExcel("Budgeted - Other FY 20/21", "103");
                this.excelService.readAndWriteExcel("Budgeted - DirectExternalCosts FY 20/21", "104");
                this.excelService.readAndWriteExcel("Budgeted - InDirectExternalCosts FY 20/21", "105");
                this.excelService.readAndWriteExcel("Budgeted - VAT FY 20/21", "106");

                this.excelService.readAndWriteExcel("Actual - SLACharges FY 20/21", "101");
                this.excelService.readAndWriteExcel("Actual - MyStaffCosts FY 20/21", "102");
                this.excelService.readAndWriteExcel("Actual - Other FY 20/21", "103");
                this.excelService.readAndWriteExcel("Actual - DirectExternalCosts FY 20/21", "104");
                this.excelService.readAndWriteExcel("Actual - InDirectExternalCosts FY 20/21", "105");
                this.excelService.readAndWriteExcel("Actual - VAT FY 20/21", "106");

                this.excelService.readAndWriteExcel("Budgeted - SLACharges FY 21/22", "101");
                this.excelService.readAndWriteExcel("Budgeted - MyStaffCosts FY 21/22", "102");
                this.excelService.readAndWriteExcel("Budgeted - Other FY 21/22", "103");
                this.excelService.readAndWriteExcel("Budgeted - DirectExternalCosts FY 21/22", "104");
                this.excelService.readAndWriteExcel("Budgeted - InDirectExternalCosts FY 21/22", "105");
                this.excelService.readAndWriteExcel("Budgeted - VAT FY 21/22", "106");

                this.excelService.readAndWriteExcel("Actual - SLACharges FY 21/22", "101");
                this.excelService.readAndWriteExcel("Actual - MyStaffCosts FY 21/22", "102");
                this.excelService.readAndWriteExcel("Actual - Other FY 21/22", "103");
                this.excelService.readAndWriteExcel("Actual - DirectExternalCosts FY 21/22", "104");
                this.excelService.readAndWriteExcel("Actual - InDirectExternalCosts FY 21/22", "105");
                this.excelService.readAndWriteExcel("Actual - VAT FY 21/22", "106");

                this.excelService.readAndWriteExcel("Budgeted - SLACharges FY 22/23", "101");
                this.excelService.readAndWriteExcel("Budgeted - MyStaffCosts FY 22/23", "102");
                this.excelService.readAndWriteExcel("Budgeted - Other FY 22/23", "103");
                this.excelService.readAndWriteExcel("Budgeted - DirectExternalCosts FY 22/23", "104");
                this.excelService.readAndWriteExcel("Budgeted - InDirectExternalCosts FY 22/23", "105");
                this.excelService.readAndWriteExcel("Budgeted - VAT FY 22/23", "106");

                this.excelService.readAndWriteExcel("Finance Classification FY 20/21 - X-Initiative (%)", "1");
                this.excelService.readAndWriteExcel("Finance Classification FY 20/21 - Protect (%)", "1");
                this.excelService.readAndWriteExcel("Finance Classification FY 20/21 - Change (%)", "1");
                this.excelService.readAndWriteExcel("Finance Classification FY 20/21 - Run (%)", "1");
                this.excelService.readAndWriteExcel("Finance Classification FY 21/22 - X-Initiative (%)", "2");
                this.excelService.readAndWriteExcel("Finance Classification FY 21/22 - Protect (%)", "2");
                this.excelService.readAndWriteExcel("Finance Classification FY 21/22 - Change (%)", "2");
                this.excelService.readAndWriteExcel("Finance Classification FY 21/22 - Run (%)", "2");
                this.excelService.readAndWriteExcel("Finance Classification FY 22/23 - X-Initiative (%)", "3");
                this.excelService.readAndWriteExcel("Finance Classification FY 22/23 - Protect (%)", "3");
                this.excelService.readAndWriteExcel("Finance Classification FY 22/23 - Change (%)", "3");
                this.excelService.readAndWriteExcel("Finance Classification FY 22/23 - Run (%)", "3");

                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Finance);
                waitForService.waitForPulse(10);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
        }

        public void intergrationsUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Integrations);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Integrations_AppsAttributes.xls", "Integrations", AppName);
                this.excelService.readAndWriteExcel("Integration Completed", "true");
                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Integrations);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                try {
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Integration Completed",
                                        "true");

                } catch (Exception e) {
                        // TODO: handle exception
                }

        }

        public void ownershipUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Ownership);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Ownership_AppsAttributes.xls", "Ownership", AppName);
                this.excelService.readAndWriteExcel("CIO / IT Manager", "Deepak.Singh@fnb.co.za");
                this.excelService.readAndWriteExcel("Business Owner", "Aline.Kruger@fnb.co.za");
                this.excelService.readAndWriteExcel("Technical Owner", "Keruna.Pillay@fnb.co.za");
                this.excelService.readAndWriteExcel("Architect", "ybata@fnb.co.za");
                this.excelService.readAndWriteExcel("WhatsWatt Champion_1", "Nakedi.Mabusela@fnb.co.za");
                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Ownership);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                try {
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "CIO / IT Manager",
                                        "Deepak Singh");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Business Owner",
                                        "Aline Kruger");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Technical Owner",
                                        "Keruna Pillay");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Architect",
                                        "Yusuf Bata");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "WhatsWatt Champion_1",
                                        "Nakedi Mabusela");
                } catch (Exception e) {
                        // TODO: handle exception
                }

        }

        public void criticalityUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Criticality);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Criticality_AppsAttributes.xls", "Criticality", AppName);
                this.excelService.readAndWriteExcel("Business Critical", "true");
                this.excelService.readAndWriteExcel("24hr Downtime Impact", "Minimal Impact");
                this.excelService.readAndWriteExcel(
                                "Maximum business tolerance for service downtime ,Recovery Time Objective ,Recovery Time Objective (RTO) in minutes",
                                "196");
                this.excelService.readAndWriteExcel(
                                "Maximum business tolerance for data loss ,Recovery Point Objective (RPO) in minutes",
                                "420");
                this.excelService.readAndWriteExcel("Application Requires Support From",
                                "Resources and skills required to maintain the application are usually available in the marketplace.");
                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(Criticality);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                try {
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "24hr Downtime Impact",
                                        "Minimal Impact");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Maximum business tolerance for service downtime ,Recovery Time Objective ,Recovery Time Objective (RTO) in minutes",
                                        "196");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Maximum business tolerance for data loss ,Recovery Point Objective (RPO) in minutes",
                                        "420");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Application Requires Support From",
                                        "Resources and skills required to maintain the application are usually available in the marketplace.");
                } catch (Exception e) {
                        // TODO: handle exception
                }

        }

        public void lifecycleUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Lifecycle);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Lifecycle_AppsAttributes.xls", "Lifecycle", AppName);
                this.excelService.readAndWriteExcel("Phase-in/planned from date", "2022/01/01");
                this.excelService.readAndWriteExcel("Productive/fully used from date", "2023/01/01");
                this.excelService.readAndWriteExcel("Phase-out/contained from date", "2024/01/01");
                this.excelService.readAndWriteExcel("Retire/out of support from date", "2025/01/01");
                this.excelService.readAndWriteExcel("Date Of Last Major Upgrade Enhancement", "2026/01/01");
                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                javaScriptServices.scrollUp();
                javaScriptServices.scrollUp();
                seleniumUtilities.click(Lifecycle);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                // javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                // "Phase-in/planned from date",
                // "2021/12/31");
                // javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                // "Productive/fully used from date",
                // "2022/01/01");
                // javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                // "Phase-out/contained from date", "2023/01/01");
                // javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                // "Retire/out of support from date",
                // "COTS with minor modifications");
                // javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                // "Date Of Last Major Upgrade Enhancement",
                // "Other");
        }

        public void infrastructureUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Infrastructure);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Infrastructure_AppsAttributes.xls", "Infrastructure", AppName);
                this.excelService.readAndWriteExcel("Hosting Location", "RMB Data Centre");
                this.excelService.readAndWriteExcel("Primary Production Environment", "Red 3");
                this.excelService.readAndWriteExcel("Is DR in place", "true");
                this.excelService.readAndWriteExcel("Works In Standin", "false");
                this.excelService.readAndWriteExcel("Date of Last DR Test", "2025/01/01");
                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                javaScriptServices.scrollUp();
                javaScriptServices.scrollUp();
                seleniumUtilities.click(Infrastructure);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                try {
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Hosting Location",
                                        "RMB Data Centre");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Primary Production Environment",
                                        "Red 3");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Is DR in place",
                                        "true");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Works In Standin",
                                        "false");
                } catch (Exception e) {
                        // TODO: handle exception
                }

        }

        public void securityUploadTest(String AppName) throws IOException, InterruptedException, AWTException {
                seleniumUtilities.click(Security);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(excelDownload);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                this.excelService.setData("Security_AppsAttributes.xls", "Security", AppName);
                this.excelService.readAndWriteExcel("System Classification", "Business Critical");
                this.excelService.readAndWriteExcel("Functional Classification", "Insurance");
                this.excelService.readAndWriteExcel("Data Classification", "Public");
                this.excelService.readAndWriteExcel("Internet Facing", "true");
                this.excelService.readAndWriteExcel("3rd party integration", "false");
                this.excelService.readAndWriteExcel("POPI Data", "true");
                this.excelService.readAndWriteExcel("PCI Data", "false");
                this.excelService.readAndWriteExcel("2FA Back End", "Digitag");
                this.excelService.readAndWriteExcel("2FA Front End", "Other");
                this.excelService.readAndWriteExcel("CCS", "Full");
                this.excelService.readAndWriteExcel("IAG Onboarded Access review", "Automated");
                this.excelService.readAndWriteExcel("IAG Onboarded Role-based provisioning", "Manual");
                this.excelService.readAndWriteExcel("PAM deployed on all privileged accounts", "Unspecified");
                this.excelService.readAndWriteExcel("Primary Authentication Mechanism", "AD (Single Sign On)");
                javaScriptServices.scrollDown();
                seleniumUtilities.click(chooseInput);
                waitForService.waitForPulse(5);
                System.out.println(this.excelService.getFileName().getAbsolutePath());
                seleniumUtilities.fileUpload(this.excelService.getFileName().getAbsolutePath());
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.click(uploadInput);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                javaScriptServices.scrollUp();
                javaScriptServices.scrollUp();
                seleniumUtilities.click(Security);
                waitForService.waitForPulse(5);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());
                seleniumUtilities.populateText(nameInput, AppName);
                waitForService.waitForPulse(25);
                screenshotService.takeScreenShot(this.getClass().getSimpleName(),
                                Thread.currentThread().getStackTrace()[1].getMethodName());

                try {
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "System Classification",
                                        "Business Critical");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Functional Classification",
                                        "Insurance");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Data Classification", "Public");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Internet Facing",
                                        "true");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "3rd party integration",
                                        "false");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "POPI Data",
                                        "true");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist", "PCI Data",
                                        "false");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "2FA Back End",
                                        "Digitag");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "2FA Front End",
                                        "Other");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist", "CCS",
                                        "Full");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "IAG Onboarded Access review", "Automated");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "IAG Onboarded Role-based provisioning",
                                        "Manual");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "PAM deployed on all privileged accounts", "Unspecified");
                        javaScriptServices.highlightElementTable("ApplicationsListForm:ExportCard:datalist",
                                        "Primary Authentication Mechanism",
                                        "AD (Single Sign On)");

                } catch (Exception e) {
                        // TODO: handle exception
                }

        }

        @Override
        public boolean isAt() {
                return this.wait.until((d) -> (this.Identity.isDisplayed() && this.Identity.isEnabled()));
        }
}

package com.example.automation.sanchez.services;

import com.example.automation.sanchez.annotation.LazyAutowired;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import  java.awt.event.KeyEvent;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;


import java.awt.AWTException;	
import java.awt.Robot;	

@Lazy
@Service
public class SeleniumService {

    @LazyAutowired
    private WebDriver driver;

    @LazyAutowired
    private WebDriverWait wait;

    @LazyAutowired
    private WaitForService waitForUtilities;

    public boolean waitForElement(WebElement webElement) {

        return this.wait.until((d) -> (webElement.isDisplayed() && webElement.isEnabled()));

    }

    public boolean waitForAjax(WebElement webElement) {

        Object element = this.wait.until((d) -> (ExpectedConditions.visibilityOf(webElement)));
        if (element == null) {
            return false;
        } else {
            return true;
        }

    }

    public void click(WebElement wb) {
        try {
            if (waitForElement(wb) && waitForAjax(wb)) {
                waitForUtilities.waitForPulse(3);
                wb.click();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getAttribute(WebElement wb) throws InterruptedException {
        waitForUtilities.waitForPulse(3);
        System.out.println(wb.getAttribute("value"));
        return wb.getAttribute("value");

    }

    public void clickLogin(WebElement wb) {
        try {
            if (waitForElement(wb) && waitForAjax(wb)) {
                wb.click();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void populateTextLogin(WebElement wb, String text) {

        try {
            if (waitForElement(wb) && waitForAjax(wb)) {
                wb.clear();
                wb.sendKeys(text);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void populateText(WebElement wb, String text) {

        try {
            if (waitForElement(wb) && waitForAjax(wb)) {
                wb.clear();
                waitForUtilities.waitForPulse(3);
                wb.sendKeys(text);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void populateTextDatePicker(WebElement wb, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='" + wb.getAttribute("id") + "_input']")));
        element.sendKeys(text);

    }

    public void selectDropdown(WebElement wb, String text) {

        wb.click();
        System.out.println(wb.getAttribute("id"));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(@id,'" + wb.getAttribute("id") + "') and contains(text(),'" + text + "')]")));
        click(element);

    }

    public void selectDropdownPowerBI(String wb, String text) throws InterruptedException {
        WebElement frameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='embedContainer']/iframe")));
        this.driver.switchTo().frame(frameElement);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@aria-label='" + wb + "' and @role='combobox']"))).click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@aria-label='" + wb + " " + text + "']/div"))).click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@aria-label='" + wb + "' and @role='combobox']"))).click();
        this.driver.switchTo().parentFrame();

    }

    public void selectDropdownSearch(WebElement wb, String text) {

        WebElement element_1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='" + wb.getAttribute("id") + "']/button")));
        click(element_1);
        System.out.println(wb.getAttribute("id"));
        WebElement element_2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[@id='" + wb.getAttribute("id") + "_panel']/ul/li[contains(text(),'" + text + "')]")));
        click(element_2);

    }

    public void setAttribute(WebElement element, String attName, String attValue) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attName, attValue);
    }

    public void waitForPageLoad() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void fileUpload (String path) throws AWTException {
        StringSelection strSelection = new StringSelection(path);
        System.setProperty("java.awt.headless", "false");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(strSelection, null);
 
        Robot robot = new Robot();
  
        robot.delay(300);
        //robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(300);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(300);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(300);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}

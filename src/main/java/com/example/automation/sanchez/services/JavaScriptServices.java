package com.example.automation.sanchez.services;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.automation.sanchez.annotation.LazyAutowired;

@Lazy
@Service
public class JavaScriptServices {
    @LazyAutowired
    private JavascriptExecutor driver;

    @LazyAutowired
    private WaitForService waitForService;

    @LazyAutowired
    private SeleniumService seleniumService;

    private JavascriptExecutor js;

    public JavascriptExecutor getJs() {
        return js = this.driver;
    }

    public void scrollDown() {
        getJs().executeScript("window.scrollBy(0,500)", "");
    }

    public void scrollUp() {

        getJs().executeScript("window.scrollBy(0,-500)", "");
    }

    public void scrollToElement(WebElement element) throws InterruptedException {
        getJs().executeScript("arguments[0].scrollIntoView(false);", element);
        Thread.sleep(250);

    }

    public void highlightElementTable(String tableName, String tableHeader, String actualString)
            throws InterruptedException {
        WebElement element = seleniumService.returnWebElementTable(tableName, tableHeader, actualString);
        scrollToElement(element);
        getJs().executeScript("arguments[0].setAttribute('style', 'border:2px solid green; background:lightgreen')",
                element);

    }

}

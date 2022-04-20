package com.example.automation.sanchez.services;

import java.time.Duration;

import com.example.automation.sanchez.annotation.LazyAutowired;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class WaitForService {

    @LazyAutowired
    private WebDriver driver;

    

    public void waitForPulse(int step) throws InterruptedException {
        FluentWait<WebDriver> wait = new FluentWait<>(this.driver).withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
        int count = 0;
        while (true) {
            boolean status = wait.until(
                    ExpectedConditions.attributeContains(By.xpath("/html/body/div[1]/div[3]"), "aria-hidden", "true"));
            count = count + 1;
            if (status && (count > step)) {
                //System.out.println("JQuery loaded up!!!");
                count = 0;
                break;
            }
            //System.out.println(count);
            Thread.sleep(250);
        }
    }

    public void waitForElementPresent(String xpath) {
        FluentWait<WebDriver> wait2 = new FluentWait<>(this.driver).withTimeout(Duration.ofSeconds(10))
            .pollingEvery(Duration.ofSeconds(1))
            .ignoring(NoSuchElementException.class)
            .ignoring(StaleElementReferenceException.class);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

}

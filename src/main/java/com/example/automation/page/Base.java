package com.example.automation.page;

import javax.annotation.PostConstruct;

import com.example.automation.sanchez.services.WaitForService;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Base {

  @Autowired
  protected WebDriver driver;

  @Autowired
  protected WebDriverWait wait;

  @Autowired
  protected WaitForService waitForService;

  @PostConstruct
  private void init() {
    PageFactory.initElements(this.driver, this);

  }

  public abstract boolean isAt();

  public boolean waitForHeader(String xpath) {
    WebElement element = this.driver.findElement(By.xpath(xpath));
    return this.wait.until((d) -> (element.isDisplayed() && element.isEnabled()));
  }
}
package com.example.automation.page;

import javax.annotation.PostConstruct;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

  @PostConstruct
  private void init() {
    PageFactory.initElements(this.driver, this);

  }

  public void scrollDown() {
    JavascriptExecutor js = (JavascriptExecutor) this.driver;
    js.executeScript("window.scrollBy(0,500)", "");
  }

  public void scrollUp() {
    JavascriptExecutor js = (JavascriptExecutor) this.driver;
    js.executeScript("window.scrollBy(0,-500)", "");
  }

  public abstract boolean isAt();

  public void highlightElement(String xpath, String textString) throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) this.driver;
    WebElement element = this.driver.findElement(By.xpath(xpath));
    if (this.wait.until((d) -> (element.isDisplayed() && element.isEnabled()))) {
      System.out.println("Element present");
      if (element.getText().equalsIgnoreCase(textString)) {
        for (int i = 0; i < 3; i++) {
          js.executeScript("arguments[0].setAttribute('style', 'border:2px solid green; background: lightgreen')",element);
        }
      } else {
        for (int i = 0; i < 3; i++) {
          js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background: yellow')", element);
        }
      }
    }
    ;
  }

  public boolean waitForHeader(String xpath) {
    WebElement element = this.driver.findElement(By.xpath(xpath));
    return this.wait.until((d) -> (element.isDisplayed() && element.isEnabled()));
  }
}
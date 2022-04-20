package com.example.automation.sanchez.config;

import com.example.automation.sanchez.annotation.ThreadScopeBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import io.github.bonigarcia.wdm.WebDriverManager;

@Lazy
@Configuration
@Profile("!remote")
public class WebDriverCongif {


    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver firefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        // WebDriverManager.chromedriver().version("97.0.4692.71 ").setup();
        return new FirefoxDriver();
    }

    @ThreadScopeBean
    @Scope("browserscope")
    @ConditionalOnMissingBean
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        // WebDriverManager.chromedriver().version("97.0.4692.71 ").setup();
        return new ChromeDriver();
    }

   

}

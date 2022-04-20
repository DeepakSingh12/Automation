package com.example.automation.sanchez.config;

import java.net.URL;

import com.example.automation.sanchez.annotation.ThreadScopeBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;

@Lazy
@Configuration
@Profile("remote")
public class RemoteWebDriverConfig { 

    @Value("${selenium.grid.url}")
    private URL url;

    @ThreadScopeBean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public WebDriver remoteFirefoxDriver() {
        // WebDriverManager.chromedriver().version("97.0.4692.71 ").setup();
        return new RemoteWebDriver(this.url, DesiredCapabilities.firefox());
    }

    @ThreadScopeBean
    @ConditionalOnMissingBean()
    public WebDriver remoteChromeDriver() {
        // WebDriverManager.chromedriver().version("97.0.4692.71 ").setup();
        return new RemoteWebDriver(this.url, DesiredCapabilities.chrome());
    }

}

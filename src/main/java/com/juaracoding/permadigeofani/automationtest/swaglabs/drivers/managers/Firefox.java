package com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.managers;

import com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.strategies.DriverStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox implements DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.firefox.bin", "/Applications/Firefox.app/Contents/MacOS/firefox");
        System.setProperty("webdriver.gecko.driver", "/Users/maacbook/Downloads/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        return new FirefoxDriver(options);
    }
}

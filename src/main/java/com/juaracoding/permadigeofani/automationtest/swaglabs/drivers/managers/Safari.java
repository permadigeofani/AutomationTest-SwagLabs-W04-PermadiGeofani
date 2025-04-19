package com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.managers;

import com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.strategies.DriverStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari implements DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        return new SafariDriver();
    }
}

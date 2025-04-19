package com.juaracoding.drivers.Strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Safari implements DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        return new SafariDriver();
    }
}

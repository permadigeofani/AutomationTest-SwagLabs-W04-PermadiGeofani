package com.juaracoding.permadigeofani.automationtest.swaglabs.drivers;

import com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.strategies.DriverStrategy;
import com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.strategies.DriverStrategyImplementor;
import com.juaracoding.permadigeofani.automationtest.swaglabs.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverSingleton {

    private static DriverSingleton instance = null;
    private static WebDriver driver;
    private static WebDriverWait wait;

    public DriverSingleton(String driver) {
        instantiate(driver);
    }

    public WebDriver instantiate(String strategy) {
        DriverStrategy driverStrategy = DriverStrategyImplementor.chooseStrategy(strategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Constants.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT));
        return driver;
    }

    public static DriverSingleton getInstance(String driver) {
        if (instance == null) {
            instance = new DriverSingleton(driver);
        }
        return instance;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static void closeObjectInstance() {
        if (driver != null) {
            driver.quit();
        }
        driver = null;
        instance = null;
        wait = null;
    }
}

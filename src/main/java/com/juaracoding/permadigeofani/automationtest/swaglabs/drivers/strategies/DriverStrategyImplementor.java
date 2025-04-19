package com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.strategies;

import com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.managers.Chrome;
import com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.managers.Firefox;
import com.juaracoding.permadigeofani.automationtest.swaglabs.drivers.managers.Safari;

public class DriverStrategyImplementor {

    public static DriverStrategy chooseStrategy(String strategy) {
        switch (strategy.toUpperCase()) {
            case "SAFARI":
                return new Safari();
            case "FIREFOX":
                return new Firefox();
            case "CHROME":
            default:
                return new Chrome(); // fallback default
        }
    }
}

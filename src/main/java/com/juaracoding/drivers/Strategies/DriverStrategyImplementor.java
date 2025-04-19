package com.juaracoding.drivers.Strategies;

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

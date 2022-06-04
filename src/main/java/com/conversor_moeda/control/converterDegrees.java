package com.conversor_moeda.control;

public class converterDegrees {
    public double getConverterDegrees(String fromDegrees, String toDegrees, double value) {
        if (fromDegrees.equals("Celsius")) {
            if (toDegrees.equals("Fahrenheit")) {
                return value * 1.8 + 32;
            }
        } else if (fromDegrees.equals("Fahrenheit")) {
            if (toDegrees.equals("Celsius")) {
                return (value - 32) / 1.8;
            }
        }
        return value;
    }
}

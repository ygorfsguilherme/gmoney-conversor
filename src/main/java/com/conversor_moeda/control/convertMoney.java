package com.conversor_moeda.control;

public class convertMoney {
    private double dolar = 4.77;
    private double euro = 5.12;
    private double real = 1.00;

    public double getConvertMoney(String fromConvert, String toConvert, double value) {
        if (fromConvert.equals("Dolar")) {
            if (toConvert.equals("Real")) {
                return value * dolar;
            } else if (toConvert.equals("Euro")) {
                return value * dolar / euro;
            }
        } else if (fromConvert.equals("Euro")) {
            if (toConvert.equals("Real")) {
                return value * euro * real;
            } else if (toConvert.equals("Dolar")) {
                return value * euro / dolar;
            }
        } else if (fromConvert.equals("Real")) {
            if (toConvert.equals("Dolar")) {
                return value * real / dolar;
            } else if (toConvert.equals("Euro")) {
                return value * real / euro;
            }
        }
        return value;
    }
}

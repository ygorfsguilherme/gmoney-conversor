package com.conversor_moeda.control;

public class convertMoney {
    private double dolar = 4.77;
    private double euro = 5.12;
    private double real = 1.00;

    public double getConvertMoney(String toConvert, String fromConvert, double value) {
        if (toConvert == "Dolar") {
            if (fromConvert.equals("Real")) {
                return value * dolar;
            } else if (fromConvert.equals("Euro")) {
                return value * dolar / euro;
            }
        } else if (toConvert.equals("Euro")) {
            if (fromConvert.equals("Real")) {
                return value * euro * real;
            } else if (fromConvert.equals("Dolar")) {
                return value * euro / dolar;
            }
        } else if (toConvert.equals("Real")) {
            if (fromConvert.equals("Dolar")) {
                return value * real / dolar;
            } else if (fromConvert.equals("Euro")) {
                return value * real / euro;
            }
        }
        return 0;
    }
}

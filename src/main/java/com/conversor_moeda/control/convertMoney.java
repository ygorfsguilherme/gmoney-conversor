package com.conversor_moeda.control;

import java.io.IOException;

public class convertMoney {
    double Dolar = Double.parseDouble(getMoney.getMoeda("USD"));
    double Euro = Double.parseDouble(getMoney.getMoeda("EUR"));
    double Real = 1.00;

    public convertMoney() throws IOException, InterruptedException {

    }

    public double getConvertMoney(String fromConvert, String toConvert, double value) {
        if (fromConvert.equals("Dolar")) {
            if (toConvert.equals("Real")) {
                return value * Dolar;
            } else if (toConvert.equals("Euro")) {
                return value * Dolar / Euro;
            }
        } else if (fromConvert.equals("Euro")) {
            if (toConvert.equals("Real")) {
                return value * Euro * Real;
            } else if (toConvert.equals("Dolar")) {
                return value * Euro / Dolar;
            }
        } else if (fromConvert.equals("Real")) {
            if (toConvert.equals("Dolar")) {
                return value * Real / Dolar;
            } else if (toConvert.equals("Euro")) {
                return value * Real / Euro;
            }
        }

        return value;
    }
}

package com.conversor_moeda.control;

import java.io.IOException;

public class convertMoney {
    double USD = Double.parseDouble(getMoney.getMoeda("USD"));
    double EUR = Double.parseDouble(getMoney.getMoeda("EUR"));
    double BRL = 1.00;

    public convertMoney() throws NumberFormatException, IOException, InterruptedException {

    }

    public double getConvertMoney(String fromConvert, String toConvert, double value) {
        if (fromConvert.equals("Dolar")) {
            if (toConvert.equals("Real")) {
                return value * USD;
            } else if (toConvert.equals("Euro")) {
                return value * USD / EUR;
            }
        } else if (fromConvert.equals("Euro")) {
            if (toConvert.equals("Real")) {
                return value * EUR * BRL;
            } else if (toConvert.equals("Dolar")) {
                return value * EUR / USD;
            }
        } else if (fromConvert.equals("Real")) {
            if (toConvert.equals("Dolar")) {
                return value * BRL / USD;
            } else if (toConvert.equals("Euro")) {
                return value * BRL / EUR;
            }
        }
        return value;
    }
}

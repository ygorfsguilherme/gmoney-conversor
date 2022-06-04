package com.conversor_moeda.main;

import javax.swing.JOptionPane;

import com.conversor_moeda.view.View;
import com.conversor_moeda.view.ViewConverterDegrees;
import com.conversor_moeda.view.ViewConverterMoney;

public class App {
    public static void main(String[] args) {

        Object[] options = { "Moeda", "Graus" };

        Object optionConversor = JOptionPane.showInputDialog(null, "Escolha um conversor:", "Conversor",
                JOptionPane.INFORMATION_MESSAGE, null,
                options,
                options[0]);

        if (optionConversor.equals("Moeda")) {
            View ConvertorMoney = new ViewConverterMoney();
            ConvertorMoney.Initials();
        } else if (optionConversor.equals("Graus")) {
            View ConvertorDegrees = new ViewConverterDegrees();
            ConvertorDegrees.Initials();
        } else {
            System.exit(0);
        }

    }
}

package com.conversor_moeda.control;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.conversor_moeda.view.View;

public class Run extends View {

    public void Start() {
        tabs.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                String title = tabs.getTitleAt(tabs.getSelectedIndex());

                if (title.equals("Money")) {
                    PanelMoney();
                } else if (title.equals("Degrees")) {
                    PanelDegrees();
                }

            }
        });

        Initials();
    }

    public void PanelMoney() {
        Logo("money.png", panelMoney);
        String[] moneyFrom = { "Real", "Dolar", "Euro" };
        String[] moneyTo = { "Dolar", "Real", "Euro" };

        Label(panelMoney);
        Input(panelMoney);
        ComboBox(panelMoney, moneyFrom, moneyTo);
        ButtonMoney(panelMoney);
    }

    public void PanelDegrees() {
        Logo("degrees.png", panelDegrees);
        String[] degreesFrom = { "Celsius", "Fahrenheit" };
        String[] degreesTo = { "Fahrenheit", "Celsius" };

        Label(panelDegrees);
        Input(panelDegrees);
        ComboBox(panelDegrees, degreesFrom, degreesTo);
        ButtonDegrees(panelDegrees);
    }

    private void ButtonMoney(JPanel panel) {
        JButton Button = new JButton("Converter");
        Button.setBounds(10, 320, 120, 35);
        panel.add(Button);

        Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String fromMoney = getComFromSelect();
                String toMoney = getComToSelect();
                String fromValue = fromInputConvert.getText();
                convertMoney convertMoneyValue;

                try {
                    convertMoneyValue = new convertMoney();
                    double valorFinal = convertMoneyValue.getConvertMoney(fromMoney, toMoney,
                            Double.parseDouble(fromValue));

                    BigDecimal result = new BigDecimal(Double.toString(valorFinal));
                    result = result.setScale(2, RoundingMode.CEILING);

                    setToInputConvert(Double.toString(result.doubleValue()));
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        });
    }

    private void ButtonDegrees(JPanel panel) {
        JButton Button = new JButton("Converter");
        Button.setBounds(10, 320, 120, 35);
        panel.add(Button);

        Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String fromDegrees = getComFromSelect();
                String toDegrees = getComToSelect();
                String fromValue = fromInputConvert.getText();
                converterDegrees convertDegreesValue = new converterDegrees();
                double valorFinal = convertDegreesValue.getConverterDegrees(fromDegrees, toDegrees,
                        Double.parseDouble(fromValue));

                BigDecimal result = new BigDecimal(Double.toString(valorFinal));
                result = result.setScale(2, RoundingMode.CEILING);

                setToInputConvert(Double.toString(result.doubleValue()));
            }
        });
    }
}
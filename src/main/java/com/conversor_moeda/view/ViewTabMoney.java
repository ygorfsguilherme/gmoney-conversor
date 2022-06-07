package com.conversor_moeda.view;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.conversor_moeda.control.convertMoney;

public class ViewTabMoney extends View {
    private JPanel panelMoney = new JPanel();
    private String[] from = { "Real", "Dolar", "Euro" };
    private String[] to = { "Dolar", "Real", "Euro" };

    public void tabMoney(JTabbedPane tabs) {
        panelMoney.setLayout(null);
        Logo("img/money.png", panelMoney);
        Label(panelMoney);
        ComboBox(panelMoney, from, to);
        Input(panelMoney);
        Button(panelMoney);
        tabs.addTab("Money", panelMoney);

        ButtonMoney(panelMoney);
    }

    private void ButtonMoney(JPanel panel) {

        this.btnConvert.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String fromMoney = getComFromSelect();
                String toMoney = getComToSelect();
                String fromValue = getFromInputConvert();
                convertMoney convertMoneyValue;

                try {
                    convertMoneyValue = new convertMoney();
                    double valorFinal = convertMoneyValue.getConvertMoney(fromMoney, toMoney,
                            Double.parseDouble(fromValue));

                    BigDecimal result = new BigDecimal(Double.toString(valorFinal));
                    result = result.setScale(2, RoundingMode.CEILING);

                    setToInputConvert(Double.toString(result.doubleValue()));
                } catch (IOException e1) {
                    setToInputConvert("0.000000");
                } catch (InterruptedException e1) {
                    setToInputConvert("0.000000");
                }
            }
        });
    }
}

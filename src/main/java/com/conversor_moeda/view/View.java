package com.conversor_moeda.view;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

import com.conversor_moeda.control.convertMoney;

public class View {
    String[] moeda = { "Real", "Dolar", "Euro" };
    String[] moeda2 = { "Real", "Dolar", "Euro" };
    String pathLogo = "logo.png";
    DecimalFormat df = new DecimalFormat("#,##0.00");

    private JPanel panel = new JPanel(null);
    private JFrame window = new JFrame("Conversor de Moedas");
    private JComboBox<String> comboBox = new JComboBox<>(moeda);
    private JComboBox<String> comboBox2 = new JComboBox<>(moeda2);
    private JButton btnConvert = new JButton("Converter");
    private JLabel Logo = new JLabel(new ImageIcon(getClass().getResource(pathLogo)));
    private JTextField toInputConvert = new JTextField();
    private JTextField fromInputConvert = new JTextField("0.00");

    public void Initials() {
        // Window
        Window();

        // Logo
        Logo();

        // ComboBox
        ComboBox();

        // Button
        Button();
        btnConvertAction();

        // Input
        Input();
    }

    private void Window() {
        window.setSize(380, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(panel);
        window.setResizable(false);
        window.setVisible(true);
    }

    private void btnConvertAction() {
        btnConvert.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String moeda = comboBox.getSelectedItem().toString();
                String moeda2 = comboBox2.getSelectedItem().toString();
                String valor = toInputConvert.getText();
                convertMoney convertMoneyValue = new convertMoney();
                String result = df.format(convertMoneyValue.getConvertMoney(moeda, moeda2, Double.parseDouble(valor)));
                fromInputConvert.setText(result);
            }
        });
    };

    private void Button() {
        btnConvert.setBounds(10, 295, 360, 45);
        panel.add(btnConvert);
    }

    private void Logo() {
        // Logo
        Logo.setBounds(150, 0, 100, 100);
        panel.add(Logo);
    }

    private void ComboBox() {
        // ComboBox
        comboBox.setBounds(10, 110, 100, 30);
        panel.add(comboBox);

        // ComboBox2
        comboBox2.setBounds(10, 160, 100, 30);
        panel.add(comboBox2);
    }

    private void Input() {
        // Input
        toInputConvert.setBounds(120, 110, 130, 30);
        toInputConvert.setHorizontalAlignment(JTextField.CENTER);
        panel.add(toInputConvert);

        // Input2
        fromInputConvert.setBounds(120, 160, 130, 30);
        fromInputConvert.setHorizontalAlignment(JTextField.CENTER);
        panel.add(fromInputConvert);
    }
}

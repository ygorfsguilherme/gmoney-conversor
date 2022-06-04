package com.conversor_moeda.view;

import javax.swing.*;

import com.conversor_moeda.control.InputNumber;

public abstract class View {
    private JPanel panel = new JPanel(null);
    private JFrame window = new JFrame("Conversor de Moedas");
    protected JButton btnConvert = new JButton("Converter");
    protected JTextField fromInputConvert = new JTextField();
    protected JTextField toInputConvert = new JTextField("0.00");
    private JComboBox<String> fromSelect = new JComboBox<>();
    private JComboBox<String> toSelect = new JComboBox<>();

    private JLabel fromLabel = new JLabel("De:");
    private JLabel toLabel = new JLabel("Para:");

    public void Initials() {
        // Window
        Window();

        // Label
        Label();

        // Button
        Button();
        btnConvertAction();

        // ComboBox
        ComboBox();

        // Input
        Input();
        fromInputConvert.setDocument(new InputNumber());
    }

    private void Window() {
        window.setSize(380, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(panel);
        window.setResizable(false);
        window.setVisible(true);
    }

    protected abstract void btnConvertAction();

    private void Label() {
        fromLabel.setBounds(10, 80, 50, 20);
        panel.add(fromLabel);

        toLabel.setBounds(10, 170, 50, 20);
        panel.add(toLabel);
    }

    private void Button() {
        btnConvert.setBounds(10, 295, 360, 45);
        panel.add(btnConvert);
    }

    protected void setLogo(String pathLogo) {
        JLabel Logo = new JLabel(new ImageIcon(getClass().getResource(pathLogo)));
        Logo.setBounds(140, 0, 100, 100);
        panel.add(Logo);
    }

    protected void ComboBox() {
        // ComboBox
        fromSelect.setBounds(10, 110, 100, 30);
        panel.add(fromSelect);

        // ComboBox2
        toSelect.setBounds(10, 200, 100, 30);
        panel.add(toSelect);
    }

    protected void setComFromSelect(String[] from) {
        fromSelect.setModel(new javax.swing.DefaultComboBoxModel<>(from));
    }

    protected String getComFromSelect() {
        return fromSelect.getSelectedItem().toString();
    }

    protected void setComToSelect(String[] to) {
        toSelect.setModel(new javax.swing.DefaultComboBoxModel<>(to));
    }

    protected String getComToSelect() {
        return toSelect.getSelectedItem().toString();
    }

    private void Input() {
        // Input
        fromInputConvert.setBounds(120, 110, 130, 30);
        fromInputConvert.setHorizontalAlignment(JTextField.CENTER);
        panel.add(fromInputConvert);

        // Input2
        toInputConvert.setBounds(120, 200, 130, 30);
        toInputConvert.setHorizontalAlignment(JTextField.CENTER);
        toInputConvert.setEditable(false);
        panel.add(toInputConvert);
    }
}

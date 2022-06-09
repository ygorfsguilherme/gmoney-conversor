package com.gmoney.view;

import javax.swing.*;

import com.gmoney.control.InputNumber;

public abstract class View {

    private JTextField fromInputConvert = new JTextField();

    private JTextField toInputConvert = new JTextField("0.00");

    private JComboBox<String> fromSelect = new JComboBox<>();
    private JComboBox<String> toSelect = new JComboBox<>();
    private JLabel toLabel = new JLabel("Para:");

    private JLabel fromLabel = new JLabel("De:");

    protected JButton btnConvert = new JButton("Converter");

    public void Label(JPanel panel) {

        panel.add(fromLabel);
        fromLabel.setBounds(10, 80, 50, 20);

        toLabel.setBounds(10, 170, 50, 20);
        panel.add(toLabel);
    }

    public void Logo(String pathLogo, JPanel panel) {
        JLabel Logo = new JLabel(new ImageIcon(getClass().getResource(pathLogo)));
        Logo.setBounds(140, 0, 100, 100);
        panel.add(Logo);
    }

    public void Input(JPanel panel) {
        // Input
        fromInputConvert.setBounds(120, 110, 130, 32);
        fromInputConvert.setHorizontalAlignment(JTextField.CENTER);
        fromInputConvert.setDocument(new InputNumber());
        panel.add(fromInputConvert);

        // Input2
        toInputConvert.setBounds(120, 200, 130, 32);
        toInputConvert.setHorizontalAlignment(JTextField.CENTER);
        toInputConvert.setDocument(new InputNumber());
        toInputConvert.setEditable(false);
        panel.add(toInputConvert);
    }

    protected void ComboBox(JPanel panel, String[] from, String[] to) {
        // ComboBox
        fromSelect.setModel(new javax.swing.DefaultComboBoxModel<>(from));
        fromSelect.setBounds(10, 110, 100, 32);
        panel.add(fromSelect);

        // ComboBox2
        toSelect.setModel(new javax.swing.DefaultComboBoxModel<>(to));
        toSelect.setBounds(10, 200, 100, 32);
        panel.add(toSelect);
    }

    protected void Button(JPanel panel) {
        btnConvert.setBounds(10, 320, 120, 32);
        panel.add(btnConvert);
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

    public void setToInputConvert(String value) {
        this.toInputConvert.setText(value);
    }

    public String getFromInputConvert() {
        return fromInputConvert.getText();
    }

}

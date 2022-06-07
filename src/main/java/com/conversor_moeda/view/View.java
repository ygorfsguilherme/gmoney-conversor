package com.conversor_moeda.view;

import javax.swing.*;

import com.conversor_moeda.control.InputNumber;

public abstract class View {
    private JFrame window = new JFrame("GMoney - Conversor");

    protected JPanel panelMoney = new JPanel(null);
    protected JPanel panelDegrees = new JPanel(null);

    private JLabel fromLabel = new JLabel("De:");
    private JLabel toLabel = new JLabel("Para:");

    public JTextField fromInputConvert = new JTextField();
    private JTextField toInputConvert = new JTextField("0.00");

    private JComboBox<String> fromSelect = new JComboBox<>();
    private JComboBox<String> toSelect = new JComboBox<>();

    protected JTabbedPane tabs = new JTabbedPane();

    public void Initials() {
        Window();
        Tabs();
    }

    private void Window() {
        window.setSize(380, 430);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(tabs);
        window.setResizable(false);
        window.setVisible(true);
    }

    private void Tabs() {
        tabs.addTab("Money", panelMoney);
        tabs.addTab("Degrees", panelDegrees);
    }

    protected void Label(JPanel panel) {
        fromLabel.setBounds(10, 80, 50, 20);
        panel.add(fromLabel);

        toLabel.setBounds(10, 170, 50, 20);
        panel.add(toLabel);
    }

    protected void Logo(String pathLogo, JPanel panel) {
        JLabel Logo = new JLabel(new ImageIcon(getClass().getResource(pathLogo)));
        Logo.setBounds(140, 0, 100, 100);
        panel.add(Logo);
    }

    protected void Input(JPanel panel) {
        // Input
        fromInputConvert.setBounds(120, 110, 130, 30);
        fromInputConvert.setHorizontalAlignment(JTextField.CENTER);
        fromInputConvert.setDocument(new InputNumber());
        panel.add(fromInputConvert);

        // Input2
        toInputConvert.setBounds(120, 200, 130, 30);
        toInputConvert.setHorizontalAlignment(JTextField.CENTER);
        toInputConvert.setDocument(new InputNumber());
        toInputConvert.setEditable(false);
        panel.add(toInputConvert);
    }

    protected void ComboBox(JPanel panel, String[] from, String[] to) {
        // ComboBox
        fromSelect.setModel(new javax.swing.DefaultComboBoxModel<>(from));
        fromSelect.setBounds(10, 110, 100, 30);
        panel.add(fromSelect);

        // ComboBox2
        toSelect.setModel(new javax.swing.DefaultComboBoxModel<>(to));
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

    public void setToInputConvert(String value) {
        this.toInputConvert.setText(value);
    }

}

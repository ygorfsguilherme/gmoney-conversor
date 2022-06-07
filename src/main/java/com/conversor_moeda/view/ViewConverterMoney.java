// package com.conversor_moeda.view;

// import java.awt.event.ActionListener;
// import java.math.BigDecimal;
// import java.math.RoundingMode;

// import javax.swing.JPanel;

// import com.conversor_moeda.control.convertMoney;

// public class ViewConverterMoney extends View {
// String[] from = { "Real", "Dolar", "Euro" };
// String[] to = { "Dolar", "Real", "Euro" };

// JPanel conversorMoeda = new JPanel();

// public ViewConverterMoney() {
// this.setComFromSelect(from);
// this.setComToSelect(to);
// this.setLogo("logo.png");
// }

// @Override
// protected void btnConvertAction() {
// this.btnConvert.addActionListener(new ActionListener() {
// public void actionPerformed(java.awt.event.ActionEvent e) {
// String fromMoney = getComFromSelect();
// String toMoney = getComToSelect();
// String fromValue = fromInputConvert.getText();
// convertMoney convertMoneyValue = new convertMoney();
// double valorFinal = convertMoneyValue.getConvertMoney(fromMoney, toMoney,
// Double.parseDouble(fromValue));
// BigDecimal result = new BigDecimal(Double.toString(valorFinal));
// result = result.setScale(2, RoundingMode.CEILING);
// toInputConvert.setText(result.toString());
// }
// });
// }

// }

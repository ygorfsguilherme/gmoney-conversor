// package com.conversor_moeda.view;

// import java.awt.event.ActionListener;
// import java.math.BigDecimal;
// import java.math.RoundingMode;

// import javax.swing.JPanel;
// import com.conversor_moeda.control.converterDegrees;

// public class ViewConverterDegrees extends View {
// String[] from = { "Celsius", "Fahrenheit" };
// String[] to = { "Fahrenheit", "Celsius" };
// JPanel conversorDegrees = new JPanel();

// public ViewConverterDegrees() {
// this.setComFromSelect(from);
// this.setComToSelect(to);
// this.setLogo("degrees.png");
// }

// @Override
// protected void btnConvertAction() {
// this.btnConvert.addActionListener(new ActionListener() {
// public void actionPerformed(java.awt.event.ActionEvent e) {
// String fromDegrees = getComFromSelect();
// String toDegrees = getComToSelect();
// String fromValue = fromInputConvert.getText();
// converterDegrees converterDegreesValue = new converterDegrees();
// double valorFinal = converterDegreesValue.getConverterDegrees(fromDegrees,
// toDegrees,
// Double.parseDouble(fromValue));
// BigDecimal result = new BigDecimal(Double.toString(valorFinal));
// result = result.setScale(2, RoundingMode.CEILING);
// toInputConvert.setText(result.toString());
// }
// });
// };
// }

package com.conversor_moeda.control;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class InputNumber extends PlainDocument {

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9-.]", ""), a);
    }

}

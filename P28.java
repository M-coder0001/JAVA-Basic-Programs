package com.Atmiya;

import java.awt.*;
import java.awt.event.*;

public class P28 extends Frame implements WindowListener,TextListener{
    TextField textField;
    Label label;

    P28() {
        setTitle("Window & Text Listener Demo");
        setLayout(new FlowLayout());
        textField = new TextField(20);
        label = new Label("Type something in the text field");

        addWindowListener(this);
        textField.addTextListener(this);

        add(textField);
        add(label);

        setSize(400,200);
        setVisible(true);
    }

    public void textValueChanged(TextEvent e) {
        label.setText("Text: " + textField.getText());
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.out.println("Window closing");
        dispose();
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    static void main(String[] args) {
        new P28();
    }
}

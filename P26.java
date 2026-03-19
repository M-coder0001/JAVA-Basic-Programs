package com.Atmiya;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class P26 implements ItemListener {

    JFrame frame;
    JCheckBox checkBox;
    JLabel label;

    P26() {
        frame = new JFrame("ItemListener Demo");

        checkBox = new JCheckBox("I Agree");
        label = new JLabel("Select the checkbox");

        checkBox.addItemListener(this);

        frame.setLayout(new FlowLayout());
        frame.add(checkBox);
        frame.add(label);

        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setText("Checkbox selected!");
        } else {
            label.setText("Checkbox not selected");
        }
    }

    public static void main(String[] args) {
        new P26();
    }
}
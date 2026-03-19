package com.Atmiya;
import javax.swing.*;
import java.awt.*;

public class P23 {
    static void main(String args[]) {

        JFrame frame = new JFrame("FlowLayout Demo");

        String[] Cities = {"Rajkot", "Ahemdabad", "gandhinagar"};

        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Name:");
        JTextField text = new JTextField(15);
        JButton button = new JButton("Submit");
        JCheckBox check = new JCheckBox("Accept Terms");
        JRadioButton radio = new JRadioButton("Male");
        JRadioButton radio1 = new JRadioButton("Female");
        JComboBox cb = new JComboBox(Cities);

        frame.add(label);
        frame.add(text);
        frame.add(button);
        frame.add(check);
        frame.add(radio);
        frame.add(radio1);
        frame.add(cb);

        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

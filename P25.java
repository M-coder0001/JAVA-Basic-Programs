package com.Atmiya;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P25 implements ActionListener{
    JFrame frame;
    JButton button;
    JLabel label;

    P25() {
        frame = new JFrame("ActionListener Demo");

        frame.setLayout(new FlowLayout());

        label = new JLabel("Button not clicked yet!");
        button = new JButton("Click Me");

        // Register ActionListener
        button.addActionListener(this);

        frame.add(label);
        frame.add(button);

        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    public static void main(String args[]) {
        new P25();
    }
}

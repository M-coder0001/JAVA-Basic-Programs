package com.Atmiya;
import javax.swing.*;
import java.awt.*;

public class P24 {
    public static void main(String args[]) {

        JFrame frame = new JFrame("BorderLayout Example");

        // Set BorderLayout
        frame.setLayout(new BorderLayout());

        // Creating components
        JButton north = new JButton("North Button");
        JButton south = new JButton("South Button");
        JButton east = new JButton("East Button");
        JButton west = new JButton("West Button");
        JButton center = new JButton("Center Button");

        // Adding components to different regions
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

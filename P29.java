package com.Atmiya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P29 extends  JFrame implements ActionListener {
    JTextField nameField, emailField;
    JPasswordField passwordField;
    JRadioButton Male, Female;
    JButton Submit;
    ButtonGroup bg;

    P29() {
        setTitle("Registration Form");
        setSize(350,400);
        setLayout(null);

        JLabel title = new JLabel("Registration form");
        title.setFont(new Font("Arial ", Font.BOLD,16));
        title.setBounds(90,10,200,30);
        add(title);

        JLabel namelbl = new JLabel("Name");
        namelbl.setBounds(20,60,80,25);
        add(namelbl);

        nameField = new JTextField();
        nameField.setBounds(120,60,180,25);
        add(nameField);

        JLabel emailLbl = new JLabel("Email: ");
        emailLbl.setBounds(20,100,80,25);
        add(emailLbl);

        emailField = new JTextField();
        emailField.setBounds(120,100,180,25);
        add(emailField);

        JLabel passLbl = new JLabel("Password:");
        passLbl.setBounds(20,140,80,25);
        add(passLbl);

        passwordField = new JPasswordField();
        passwordField.setBounds(120,140,180,25);
        add(passwordField);

        JLabel genderLbl = new JLabel("Gender:");
        genderLbl.setBounds(20,180,80,25);
        add(genderLbl);

        Male =new JRadioButton("Male");
        Female =new JRadioButton("Female");

        Male.setBounds(120,180,70,25);
        Female.setBounds(190,180,80,25);

        bg = new ButtonGroup();
        bg.add(Male);
        bg.add(Female);

        add(Male);
        add(Female);

        Submit = new JButton("Submit");
        Submit.setBounds(110,230,120,30);
        Submit.addActionListener(this);
        add(Submit);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String gender = Male.isSelected() ? "Male" : "Female";

        JOptionPane.showMessageDialog(this,
                "Registration Successful!\n\n" +
                        "Name: " + nameField.getText() +
                        "\nEmail: " + emailField.getText() +
                        "\nGender: " + gender,
                "Output",
                JOptionPane.INFORMATION_MESSAGE);
    }

    static void main(String[] args) {
        new P29();
    }
}

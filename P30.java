package com.Atmiya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P30 extends JFrame implements ActionListener {
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;

    P30() {
        setTitle("Login Form");
        setSize(300,200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblUser = new JLabel("Username: ");
        lblUser.setBounds(20,30,80,25);
        add(lblUser);

        txtUser = new JTextField();
        txtUser.setBounds(110,30,150,25);
        add(txtUser);

        JLabel lblPass = new JLabel("Password: ");
        lblPass.setBounds(20,70,80,25);
        add(lblPass);

        txtPass = new JPasswordField();
        txtPass.setBounds(110,70,150,25);
        add(txtPass);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(90,110,100,30);
        btnLogin.addActionListener(this);
        add(btnLogin);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent event) {
        String User = txtUser.getText();
        String Pass = new String(txtPass.getPassword());

        if (User.equals("admin") && Pass.equals("123")) {
            JOptionPane.showMessageDialog(this, " Login Successful!");
        }else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }
    }

    static void main(String[] args) {
        new P30();
    }
}

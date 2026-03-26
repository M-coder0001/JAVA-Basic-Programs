package com.Atmiya;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P27 extends JFrame implements MouseListener, KeyListener {

    JLabel mouseLabel;
    JTextField keyField;
    JLabel keyLabel;

    P27() {
        setTitle("Mouse & Key Listener Demo");
        setLayout(new FlowLayout());

        mouseLabel = new JLabel("Click anywhere inside the window");
        keyLabel = new JLabel("Key pressed will show here");
        keyField = new JTextField(18);

        addMouseListener(this);
        keyField.addKeyListener(this);

        add(mouseLabel);
        add(keyField);
        add(keyLabel);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        mouseLabel.setText("Mouse Clicked at x= " + e.getX() + " Y= " + e.getY());
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {
        keyLabel.setText("Key pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        new P27();
    }
}
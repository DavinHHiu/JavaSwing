package org.example.view;

import org.example.controler.MyColorListener;
import org.example.model.MyColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyColorView extends JFrame {
    private MyColor myColor;

    private JLabel jLabel;

    public MyColorView() {
        this.myColor = new MyColor();
        init();
        this.setVisible(true);
    }

    void init() {
        this.setTitle("My Color");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Font fontText = new Font("Arial", Font.BOLD, 50);
        this.jLabel = new JLabel("Something!!!");
        this.jLabel.setFont(fontText);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 3));
        Font font = new Font("Arial", Font.BOLD, 40);

        ActionListener ac = new MyColorListener(this);

        JButton jButtonRed = new JButton("Red Text");
        jButtonRed.setFont(font);
        jButtonRed.setForeground(Color.WHITE);
        jButtonRed.setBackground(Color.RED);
        jButtonRed.setBorderPainted(false);
        jButtonRed.addActionListener(ac);

        JButton jButtonYellow = new JButton("Yellow Text");
        jButtonYellow.setFont(font);
        jButtonYellow.setForeground(Color.WHITE);
        jButtonYellow.setBackground(Color.YELLOW);
        jButtonYellow.setBorderPainted(false);
        jButtonYellow.addActionListener(ac);

        JButton jButtonGreen = new JButton("Green Text");
        jButtonGreen.setFont(font);
        jButtonGreen.setForeground(Color.WHITE);
        jButtonGreen.setBackground(Color.GREEN);
        jButtonGreen.setBorderPainted(false);
        jButtonGreen.addActionListener(ac);



        JButton jButtonRedFore = new JButton("Red Background");
        jButtonRedFore.setFont(font);
        jButtonRedFore.setForeground(Color.RED);
        jButtonRedFore.setBackground(Color.WHITE);
        jButtonRedFore.addActionListener(ac);

        JButton jButtonYellowFore = new JButton("Yellow Background");
        jButtonYellowFore.setFont(font);
        jButtonYellowFore.setForeground(Color.YELLOW);
        jButtonYellowFore.setBackground(Color.WHITE);
        jButtonYellowFore.addActionListener(ac);

        JButton jButtonGreenFore = new JButton("Green Background");
        jButtonGreenFore.setFont(font);
        jButtonGreenFore.setForeground(Color.GREEN);
        jButtonGreenFore.setBackground(Color.WHITE);
        jButtonGreenFore.addActionListener(ac);



        jPanel.add(jButtonRed);
        jPanel.add(jButtonYellow);
        jPanel.add(jButtonGreen);
        jPanel.add(jButtonRedFore);
        jPanel.add(jButtonYellowFore);
        jPanel.add(jButtonGreenFore);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void changeTextColor (Color color) {
        this.jLabel.setForeground(color);
    }

    public void changeBackColor (Color color) {
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }

}

package org.example.view;

import org.example.controler.FontSetterControler;
import org.example.model.LastButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FontSetterView extends JFrame {
    private LastButton lastButton;

    private JButton jb1;
    private JButton jb2;
    private JButton jb3;
    private JButton jb4;
    private JLabel jLabel;

    public FontSetterView () {
        this.lastButton = new LastButton();
        init();
        this.setVisible(true);
    }

    private void init() {
        this.setTitle("Font Setter");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 30);

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new GridLayout(2, 2));

        ActionListener listener = new FontSetterControler(this);
        this.jb1 = new JButton("1");
        jb1.setFont(font);
        jb1.addActionListener(listener);
        this.jb2 = new JButton("2");
        jb2.setFont(font);
        jb2.addActionListener(listener);
        this.jb3 = new JButton("3");
        jb3.setFont(font);
        jb3.addActionListener(listener);
        this.jb4 = new JButton("4");
        jb4.setFont(font);
        jb4.addActionListener(listener);

        headerPanel.add(this.jb1);
        headerPanel.add(this.jb2);
        headerPanel.add(this.jb3);
        headerPanel.add(this.jb4);

        JPanel footerPanel = new JPanel();
        this.jLabel = new JLabel("______");
        jLabel.setFont(font);
        footerPanel.add(jLabel);

        this.setLayout(new BorderLayout());
        this.add(headerPanel, BorderLayout.CENTER);
        this.add(footerPanel, BorderLayout.SOUTH);
    }

    public void transTo_1() {
        this.lastButton.setValue_1();
        this.jLabel.setText("Last button " + this.lastButton.getValue() );
    }
    public void transTo_2() {
        this.lastButton.setValue_2();
        this.jLabel.setText("Last button " + this.lastButton.getValue() );
    }
    public void transTo_3() {
        this.lastButton.setValue_3();
        this.jLabel.setText("Last button " + this.lastButton.getValue() );
    }
    public void transTo_4() {
        this.lastButton.setValue_4();
        this.jLabel.setText("Last button " + this.lastButton.getValue() );
    }
}

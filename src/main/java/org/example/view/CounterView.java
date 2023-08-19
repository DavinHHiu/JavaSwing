package org.example.view;

import org.example.controler.CounterControler;
import org.example.model.Counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private Counter counter;
    private JButton buttonUp;
    private JButton buttonDown;
    private JButton buttonReset;
    private JLabel labelValue;

    public CounterView () {
        this.counter = new Counter();
        this.init();
        this.setVisible(true);

    }

    private void init() {
        this.setTitle("My counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ActionListener ac = new CounterControler(this);

        this.buttonUp = new JButton("Up");
        this.buttonUp.addActionListener(ac);
        this.buttonDown = new JButton("Down");
        this.buttonDown.addActionListener(ac);
        this.buttonReset = new JButton("Reset");
        this.buttonReset.addActionListener(ac);
        this.labelValue = new JLabel(this.counter.getValue() + "", JLabel.CENTER);
        this.labelValue.setFont(new Font("Arial", Font.PLAIN, 30));

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(this.buttonUp, BorderLayout.WEST);
        jPanel.add(this.buttonDown, BorderLayout.EAST);
        jPanel.add(this.labelValue, BorderLayout.CENTER);
        jPanel.add(this.buttonReset, BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }

    public void increaseCounter() {
        this.counter.increase();
        this.labelValue.setText(this.counter.getValue() + "");
    }

    public void decreaseCounter() {
        this.counter.decrease();
        this.labelValue.setText(this.counter.getValue() + "");
    }

    public void resetCounter() {
        this.counter.reset();
        this.labelValue.setText(this.counter.getValue() + "");
    }
}

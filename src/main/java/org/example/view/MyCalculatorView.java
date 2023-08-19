package org.example.view;

import org.example.controler.MyCalulationListener;
import org.example.model.MyCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyCalculatorView extends JFrame {
    private MyCalculator myCal;

    private JTextField jTextFieldFirstValue;

    private JTextField jTextFieldSecondValue;

    private JTextField jTextFieldAnswer;
    public MyCalculatorView() {
        this.myCal = new MyCalculator();
        init();
    }

    public void init() {
        this.setTitle("My Calculator");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 40);
        JLabel firstValue = new JLabel("First value");
        firstValue.setFont(font);
        JLabel secondValue = new JLabel("Second value");
        secondValue.setFont(font);
        JLabel answer = new JLabel("Answer");
        answer.setFont(font);

        jTextFieldFirstValue = new JTextField(50);
        jTextFieldFirstValue.setFont(font);
        jTextFieldSecondValue = new JTextField(50);
        jTextFieldSecondValue.setFont(font);
        jTextFieldAnswer = new JTextField(50);
        jTextFieldAnswer.setFont(font);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3, 2, 10, 10));
        jPanelIO.add(firstValue);
        jPanelIO.add(jTextFieldFirstValue);
        jPanelIO.add(secondValue);
        jPanelIO.add(jTextFieldSecondValue);
        jPanelIO.add(answer);
        jPanelIO.add(jTextFieldAnswer);

        ActionListener ac = new MyCalulationListener(this);
        JButton plusButton = new JButton("+");
        plusButton.setFont(font);
        plusButton.addActionListener(ac);
        JButton minusButton = new JButton("-");
        minusButton.setFont(font);
        minusButton.addActionListener(ac);
        JButton multiplyButton = new JButton("*");
        multiplyButton.setFont(font);
        multiplyButton.addActionListener(ac);
        JButton divideButton = new JButton("/");
        divideButton.setFont(font);
        divideButton.addActionListener(ac);
        JButton powerButton = new JButton("^");
        powerButton.setFont(font);
        powerButton.addActionListener(ac);
        JButton modButton = new JButton("%");
        modButton.setFont(font);
        modButton.addActionListener(ac);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 3));
        buttonPanel.add(plusButton);
        buttonPanel.add(minusButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(powerButton);
        buttonPanel.add(modButton);

        this.setLayout(new BorderLayout());
        this.add(jPanelIO, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void plus() {
        double firstValue = Double.parseDouble(this.jTextFieldFirstValue.getText());
        double secondValue = Double.parseDouble(this.jTextFieldSecondValue.getText());
        this.myCal.setValue1(firstValue);
        this.myCal.setValue2(secondValue);
        this.jTextFieldAnswer.setText(this.myCal.plus()+"");
    }
    public void minus() {
        double firstValue = Double.parseDouble(this.jTextFieldFirstValue.getText());
        double secondValue = Double.parseDouble(this.jTextFieldSecondValue.getText());
        this.myCal.setValue1(firstValue);
        this.myCal.setValue2(secondValue);
        this.jTextFieldAnswer.setText(this.myCal.minus()+"");
    }
    public void multiply() {
        double firstValue = Double.parseDouble(this.jTextFieldFirstValue.getText());
        double secondValue = Double.parseDouble(this.jTextFieldSecondValue.getText());
        this.myCal.setValue1(firstValue);
        this.myCal.setValue2(secondValue);
        this.jTextFieldAnswer.setText(this.myCal.multiply()+"");
    }
    public void divide() {
        double firstValue = Double.parseDouble(this.jTextFieldFirstValue.getText());
        double secondValue = Double.parseDouble(this.jTextFieldSecondValue.getText());
        this.myCal.setValue1(firstValue);
        this.myCal.setValue2(secondValue);
        this.jTextFieldAnswer.setText(this.myCal.divide()+"");
    }
    public void power() {
        double firstValue = Double.parseDouble(this.jTextFieldFirstValue.getText());
        double secondValue = Double.parseDouble(this.jTextFieldSecondValue.getText());
        this.myCal.setValue1(firstValue);
        this.myCal.setValue2(secondValue);
        this.jTextFieldAnswer.setText(this.myCal.power()+"");
    }
    public void mod() {
        double firstValue = Double.parseDouble(this.jTextFieldFirstValue.getText());
        double secondValue = Double.parseDouble(this.jTextFieldSecondValue.getText());
        this.myCal.setValue1(firstValue);
        this.myCal.setValue2(secondValue);
        this.jTextFieldAnswer.setText(this.myCal.mod()+"");
    }
}

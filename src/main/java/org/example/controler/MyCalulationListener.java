package org.example.controler;

import org.example.view.MyCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalulationListener implements ActionListener {

    private MyCalculatorView myCalculatorView;

    public MyCalulationListener (MyCalculatorView myCalculatorView) {
        this.myCalculatorView = myCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String eventName = e.getActionCommand();
        if ("+".equals(eventName)) {
            this.myCalculatorView.plus();
        } else if ("-".equals(eventName)) {
            this.myCalculatorView.minus();
        } else if ("*".equals(eventName)) {
            this.myCalculatorView.multiply();
        } else if ("/".equals(eventName)) {
            this.myCalculatorView.divide();
        } else if ("^".equals(eventName)) {
            this.myCalculatorView.power();
        } else if ("%".equals(eventName)) {
            this.myCalculatorView.mod();
        }
    }
}

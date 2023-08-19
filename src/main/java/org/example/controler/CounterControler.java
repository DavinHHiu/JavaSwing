package org.example.controler;

import org.example.view.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterControler implements ActionListener {
    private CounterView ctv;
    public CounterControler (CounterView ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String eventName = e.getActionCommand();
        if ("Up".equals(eventName)) {
            this.ctv.increaseCounter();
        }
        else if("Down".equals(eventName)) {
            this.ctv.decreaseCounter();
        } else {
            this.ctv.resetCounter();
        }
    }
}

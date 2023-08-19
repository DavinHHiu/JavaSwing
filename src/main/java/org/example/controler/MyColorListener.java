package org.example.controler;

import org.example.view.MyColorView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {

    private MyColorView mcv;

    public MyColorListener(MyColorView mcv) {
        this.mcv = mcv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String eventName = e.getActionCommand();
        if (eventName.equals("Red Text")) {
            this.mcv.changeTextColor(Color.RED);
        } else if (eventName.equals("Yellow Text")) {
            this.mcv.changeTextColor(Color.YELLOW);
        } else if (eventName.equals("Green Text")) {
            this.mcv.changeTextColor(Color.GREEN);
        } else if (eventName.equals("Red Background")) {
            this.mcv.changeBackColor(Color.RED);
        } else if (eventName.equals("Yellow Background")) {
            this.mcv.changeBackColor(Color.YELLOW);
        } else if (eventName.equals("Green Background")) {
            this.mcv.changeBackColor(Color.GREEN);
        }

    }
}

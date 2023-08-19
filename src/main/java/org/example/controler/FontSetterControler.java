package org.example.controler;

import org.example.view.FontSetterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontSetterControler implements ActionListener {
    FontSetterView fsv;

    public FontSetterControler (FontSetterView fsv) {
        this.fsv = fsv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String eventName = e.getActionCommand();
        if ("1".equals(eventName)) {
            this.fsv.transTo_1();
        } else if ("2".equals(eventName)) {
            this.fsv.transTo_2();
        } else if ("3".equals(eventName)) {
            this.fsv.transTo_3();
        } else if ("4".equals(eventName)) {
            this.fsv.transTo_4();
        }
    }
}

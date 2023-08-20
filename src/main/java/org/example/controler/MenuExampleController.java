package org.example.controler;

import org.example.view.MenuExampleView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleController implements ActionListener {

    private MenuExampleView menuView;

    public MenuExampleController(MenuExampleView menuView) {
        this.menuView = menuView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String eventName = e.getActionCommand();
        if (eventName.equals("Exit")) {
            System.exit(0);
        } else if (eventName.equals("Toolbar")) {
            JCheckBoxMenuItem button = (JCheckBoxMenuItem) e.getSource();
            boolean check = button.getModel().isSelected();
            if (check) {
                this.menuView.enableToolBar();
            } else this.menuView.disableToolBar();
        } else {
            this.menuView.setText("Bạn đã click " + eventName);
        }
    }
}

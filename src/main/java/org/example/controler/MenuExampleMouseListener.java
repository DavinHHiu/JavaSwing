package org.example.controler;

import org.example.view.MenuExampleView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuExampleMouseListener implements MouseListener {
    private MenuExampleView menuExampleView;

    public MenuExampleMouseListener(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        if (e.isPopupTrigger()) {
            this.menuExampleView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
//        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

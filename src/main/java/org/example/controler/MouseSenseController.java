package org.example.controler;

import org.example.view.MouseSenseView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseSenseController implements MouseListener, MouseMotionListener {

    private MouseSenseView mouseSenseView;

    public MouseSenseController(MouseSenseView mouseSenseView) {
        this.mouseSenseView = mouseSenseView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.mouseSenseView.mouseClick();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.mouseSenseView.enter();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.mouseSenseView.exit();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.mouseSenseView.update(e.getX(), e.getY());
    }
}

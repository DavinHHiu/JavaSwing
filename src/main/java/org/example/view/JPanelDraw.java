package org.example.view;

import javax.swing.*;
import java.awt.*;

public class JPanelDraw extends JPanel {
    public JPanelDraw() {
        this.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(15, 15, 0, 0);
        g.setColor(Color.RED);
        g.drawOval(25, 25, 30, 20);
        g.setColor(Color.GREEN);
        g.drawRect(70, 70, 50, 50);
        g.setColor(Color.PINK);
        g.fillOval(100, 100, 50, 50);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(140, 140, 50, 50);
        g.setColor(Color.YELLOW);
        g.drawString("Hong Hieu", 100, 100);
    }
}

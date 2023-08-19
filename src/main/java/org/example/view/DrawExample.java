package org.example.view;

import javax.swing.*;
import java.awt.*;

public class DrawExample extends JFrame {

    public DrawExample() {
        this.setTitle("Draw Example");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanelDraw jPanelDraw = new JPanelDraw();

        this.setLayout(new BorderLayout());
        this.add(jPanelDraw, BorderLayout.CENTER);
        this.setVisible(true);
    }
}

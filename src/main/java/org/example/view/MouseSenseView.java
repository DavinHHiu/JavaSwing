package org.example.view;

import org.example.controler.MouseSenseController;
import org.example.model.MouseSense;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseSenseView extends JFrame {
    private MouseSense mouseSense;
    private JPanel jPanelMouse;
    private JLabel jLabelX;
    private JLabel jLabelY;
    private JLabel countValue;
    private JLabel checkInValue;

    public MouseSenseView() {
        this.mouseSense = new MouseSense();
        this.init();
    }

    private void init() {
        this.setTitle("Mouse Sense");
        this.setSize(650,500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.PLAIN, 20);

        MouseListener mouseListener = new MouseSenseController(this);
        MouseMotionListener mouseMotionListener = new MouseSenseController(this);

        jPanelMouse = new JPanel();
        jPanelMouse.setBackground(Color.BLACK);
        jPanelMouse.addMouseListener(mouseListener);
        jPanelMouse.addMouseMotionListener(mouseMotionListener);

        JPanel jPanelInfo = new JPanel();
        jPanelInfo.setLayout(new GridLayout(3, 3));
        JLabel jLabelPosition = new JLabel("Position:");
        jLabelPosition.setFont(font);
        jLabelX = new JLabel("x:");
        jLabelX.setFont(font);
        jLabelY = new JLabel("y:");
        jLabelY.setFont(font);
        JLabel count = new JLabel("Number of clicks:");
        count.setFont(font);
        JLabel empty1 = new JLabel();
        empty1.setFont(font);
        countValue = new JLabel();
        countValue.setFont(font);
        JLabel checkIn = new JLabel("Mouse is in component:");
        checkIn.setFont(font);
        JLabel empty2 =new JLabel();
        empty2.setFont(font);
        checkInValue = new JLabel();
        checkInValue.setFont(font);


        jPanelInfo.add(jLabelPosition);
        jPanelInfo.add(jLabelX);
        jPanelInfo.add(jLabelY);
        jPanelInfo.add(count);
        jPanelInfo.add(empty1);
        jPanelInfo.add(countValue);
        jPanelInfo.add(checkIn);
        jPanelInfo.add(empty2);
        jPanelInfo.add(checkInValue);

        this.setLayout(new BorderLayout());
        this.add(jPanelMouse, BorderLayout.CENTER);
        this.add(jPanelInfo, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void mouseClick() {
        this.mouseSense.click();
        this.countValue.setText(this.mouseSense.getCount()+"");
    }

    public void enter() {
        this.mouseSense.enter();
        this.checkInValue.setText(this.mouseSense.getCheckIn());
        this.jLabelX.setText(this.mouseSense.getX()+"");
        this.jLabelY.setText(this.mouseSense.getY()+"");

    }

    public void exit() {
        this.mouseSense.exit();
        this.checkInValue.setText(this.mouseSense.getCheckIn());
    }

    public void update(int x, int y) {
        this.mouseSense.update(x, y);
        this.jLabelX.setText(this.mouseSense.getX()+"");
        this.jLabelY.setText(this.mouseSense.getY()+"");
    }
}

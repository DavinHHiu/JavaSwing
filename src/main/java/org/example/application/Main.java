package org.example.application;

import org.example.view.MenuExampleView;

import javax.swing.*;
import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        MenuExampleView menu = new MenuExampleView();
    }
}
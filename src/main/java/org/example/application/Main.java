package org.example.application;

import org.example.view.DrawExample;
import org.example.view.MenuExampleView;
import org.example.view.MouseSenseView;
import org.example.view.SearchingWordView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        MenuExampleView menu = new MenuExampleView();
    }
}
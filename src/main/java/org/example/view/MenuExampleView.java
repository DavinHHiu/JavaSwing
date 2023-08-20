package org.example.view;

import org.example.controler.MenuExampleController;
import org.example.controler.MenuExampleMouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

public class MenuExampleView extends JFrame {

    private JLabel jLabel;
    public JPopupMenu jPopupMenu;
    private JToolBar jToolBar;

    public MenuExampleView() throws MalformedURLException {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ActionListener ac = new MenuExampleController(this);

        JMenuBar jMenuBar = new JMenuBar();

        //Menu File
        JMenu jMenu1 = new JMenu("File");
        JMenuItem jMenuItem0 = new JMenuItem("New", KeyEvent.VK_N);
        jMenuItem0.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jMenuItem0.addActionListener(ac);
        JMenuItem jMenuItem1 = new JMenuItem("Open", KeyEvent.VK_O);
        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.addActionListener(ac);
        JMenuItem jMenuItem2 = new JMenuItem("Exit", KeyEvent.VK_X);
        jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
        jMenuItem2.addActionListener(ac);
        jMenu1.add(jMenuItem0);
        jMenu1.addSeparator();
        jMenu1.add(jMenuItem1);
        jMenu1.addSeparator();
        jMenu1.add(jMenuItem2);

        //Menu Help
        JMenu jMenu2 = new JMenu("Help");
        jMenu2.setMnemonic(KeyEvent.VK_L);
        jMenu2.setDisplayedMnemonicIndex(0);
        JMenuItem jMenuItem3 = new JMenuItem("Welcome");
        jMenuItem3.addActionListener(ac);
        jMenu2.add(jMenuItem3);

        //Menu View
        JMenu jMenuView = new JMenu("View");
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Toolbar");
        jCheckBoxMenuItem.addActionListener(ac);
        jMenuView.add(jCheckBoxMenuItem);

        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu2);
        jMenuBar.add(jMenuView);

        Font font = new Font("Arial", Font.ITALIC, 50);
        this.setJMenuBar(jMenuBar);

        jToolBar = new JToolBar();
        JButton undoButton = new JButton("Undo");
        undoButton.setToolTipText("Nhấn vào đây để quay lại thao tác");
        undoButton.addActionListener(ac);
        JButton redoButton = new JButton("Redo");
        redoButton.addActionListener(ac);
        JButton copyButton = new JButton("Copy");
        copyButton.addActionListener(ac);
        JButton cutButton = new JButton("Cut");
        cutButton.addActionListener(ac);
        JButton pasteButton = new JButton("Paste");
        pasteButton.addActionListener(ac);
        jToolBar.add(undoButton);
        jToolBar.add(redoButton);
        jToolBar.add(copyButton);
        jToolBar.add(cutButton);
        jToolBar.add(pasteButton);

        jLabel = new JLabel();
        jLabel.setFont(font);

        jPopupMenu = new JPopupMenu();
        JMenu jMenuPopupFont = new JMenu("Font");
        JMenuItem jMenuItemType = new JMenuItem("Type");
        jMenuItemType.addActionListener(ac);
        JMenuItem jMenuItemSize = new JMenuItem("Size");
        jMenuItemSize.addActionListener(ac);
        jMenuPopupFont.add(jMenuItemType);
        jMenuPopupFont.add(jMenuItemSize);

        JMenuItem jMenuItemCut = new JMenuItem("Cut");
        jMenuItemCut.addActionListener(ac);
        JMenuItem jMenuItemCopy = new JMenuItem("Copy");
        jMenuItemCopy.addActionListener(ac);
        JMenuItem jMenuItemPaste = new JMenuItem("Paste");
        jMenuItemPaste.addActionListener(ac);

        jPopupMenu.add(jMenuPopupFont);
        jPopupMenu.add(jMenuItemCut);
        jPopupMenu.add(jMenuItemCopy);
        jPopupMenu.add(jMenuItemPaste);
        this.add(jPopupMenu);

        MouseListener mouseListener = new MenuExampleMouseListener(this);
        this.addMouseListener(mouseListener);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void setText(String s) {
        this.jLabel.setText(s);
    }

    public void enableToolBar () {
        this.add(jToolBar, BorderLayout.NORTH);
        this.refresh();
    }

    public void disableToolBar () {
        this.remove(jToolBar);
        this.refresh();
    }

    public void refresh() {
        this.setResizable(false);
        this.pack();
        this.setSize(500, 500);
    }
}

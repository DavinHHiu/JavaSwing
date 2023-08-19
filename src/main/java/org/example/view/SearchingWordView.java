package org.example.view;

import org.example.controler.SearchingWordListener;
import org.example.model.SearchingWord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SearchingWordView extends JFrame {
    private SearchingWord searchingWord;
    private JTextArea jTextArea;
    private JTextField jTextField;
    private JLabel answer;

    public SearchingWordView () {
        this.searchingWord = new SearchingWord();
        init();

    }

    private void init() {
        this.setTitle("Searching Word");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Font fontSmall = new Font("Arial", Font.BOLD, 20);

        JLabel jLabelText = new JLabel("Text:");
        jLabelText.setFont(fontSmall);
        jTextArea = new JTextArea(10, 50);
        jTextArea.setFont(fontSmall);

        JScrollPane jScrollPane = new JScrollPane(jTextArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        JLabel jLabelKeyWord = new JLabel("Keyword:");
        jLabelKeyWord.setFont(fontSmall);
        jTextField = new JTextField();
        jTextField.setFont(fontSmall);

        ActionListener ac = new SearchingWordListener(this);

        JButton jButton = new JButton("Thống kê");
        jButton.setFont(fontSmall);
        jButton.addActionListener(ac);
        jButton.setForeground(Color.WHITE);
        jButton.setBackground(Color.BLACK);
        jButton.setBorderPainted(false);
        answer = new JLabel();
        answer.setFont(fontSmall);

        JPanel jPanelFooter = new JPanel();
        jPanelFooter.setLayout(new GridLayout(2, 1, 10, 10));
        jPanelFooter.add(jLabelKeyWord);
        jPanelFooter.add(jTextField);
        jPanelFooter.add(jButton);
        jPanelFooter.add(answer);


        this.setLayout(new BorderLayout());
        this.add(jLabelText, BorderLayout.NORTH);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jPanelFooter, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public void searching() {
        String text = this.jTextArea.getText();
        String keyWord = this.jTextField.getText();
        this.searchingWord.setText(text);
        this.searchingWord.setKeyword(keyWord);
        this.searchingWord.search();
        this.answer.setText(this.searchingWord.getAnswer());
    }
}

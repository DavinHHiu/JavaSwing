package org.example.controler;

import org.example.view.SearchingWordView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchingWordListener implements ActionListener {

    private SearchingWordView swv;

    public SearchingWordListener (SearchingWordView swv) {
        this.swv = swv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String eventName = e.getActionCommand();
        if ("Thống kê".equals(eventName)) {
            this.swv.searching();
        }
    }
}

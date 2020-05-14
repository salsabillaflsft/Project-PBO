package Controller;

import MVC.MVC_Main;
import View.ViewLogout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerLogout {
    ViewLogout viewLogout;

    public ControllerLogout(ViewLogout viewLogout) {
        this.viewLogout = viewLogout;

        viewLogout.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLogout.setVisible(false);
                MVC_Main mvc_main = new MVC_Main();
            }
        });
    }
}

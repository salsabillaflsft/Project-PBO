package Controller;

import MVC.MVC_Home;
import Model.ModelSupply;
import View.ViewEditSupply;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerEditSupply {
    ViewEditSupply viewEditSupply;
    ModelSupply modelSupply;

    public ControllerEditSupply(ViewEditSupply viewEditSupply,  ModelSupply modelSupply){
        this.viewEditSupply = viewEditSupply;
        this.modelSupply = modelSupply;
        viewEditSupply.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditSupply.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });
        viewEditSupply.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditSupply.tfJumlah.setText("");
                viewEditSupply.tfTanggal.setText("");
                viewEditSupply.tfTanggal2.setText("");
            }
        });
        viewEditSupply.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}

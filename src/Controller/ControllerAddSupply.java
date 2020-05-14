package Controller;

import MVC.MVC_Home;
import Model.ModelSupply;
import View.ViewAddSupply;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerAddSupply {
    ViewAddSupply viewAddSupply;
    ModelSupply modelSupply;

    public ControllerAddSupply(ViewAddSupply viewAddSupply,  ModelSupply modelSupply){
        this.viewAddSupply = viewAddSupply;
        this.modelSupply = modelSupply;

        viewAddSupply.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddSupply.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });
        viewAddSupply.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddSupply.tfSupply.setText("");
                viewAddSupply.tfJumlah.setText("");
                viewAddSupply.tfTanggal.setText("");
                viewAddSupply.tfTanggal2.setText("");
            }
        });
        viewAddSupply.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}

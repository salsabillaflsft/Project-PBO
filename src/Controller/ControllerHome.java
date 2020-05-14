package Controller;

import MVC.*;
import View.ViewHome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerHome {
    ViewHome viewHome;
    public ControllerHome(ViewHome viewHome) {
        this.viewHome = viewHome;

        viewHome.btnSee.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHome.setVisible(false);
                MVC_Supply mvc_supply = new MVC_Supply();
            }
        });
        viewHome.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHome.setVisible(false);
                MVC_AddSupply mvc_addSupply = new MVC_AddSupply();
            }
        });
        viewHome.btnAdd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHome.setVisible(false);
                MVC_AddSupplier mvc_addSupplier = new MVC_AddSupplier();
            }
        });
        viewHome.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHome.setVisible(false);
                MVC_EditSupply mvc_editSupply = new MVC_EditSupply();
            }
        });
        viewHome.btnOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewHome.setVisible(false);
                MVC_Logout mvc_logout = new MVC_Logout();
            }
        });
    }
}

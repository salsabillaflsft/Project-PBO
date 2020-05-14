package Controller;

import MVC.MVC_Home;
import Model.ModelAddSupplier;
import View.ViewAddSupplier;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerAddSupplier {
    ViewAddSupplier viewAddSupplier;
    ModelAddSupplier modelAddSupplier;

    public ControllerAddSupplier(ViewAddSupplier viewAddSupplier, ModelAddSupplier modelAddSupplier){
        this.viewAddSupplier = viewAddSupplier;
        this.modelAddSupplier = modelAddSupplier;

        viewAddSupplier.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddSupplier.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });
        viewAddSupplier.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewAddSupplier.getNama();
                String contact = viewAddSupplier.getContact();
                modelAddSupplier.addSupplier(nama,contact);
            }
        });
        viewAddSupplier.btnAdd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kategori = viewAddSupplier.getKategori();
                modelAddSupplier.addKategori(kategori);
            }
        });
        viewAddSupplier.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddSupplier.tfSupplier.setText("");
                viewAddSupplier.tfContact.setText("");
            }
        });
        viewAddSupplier.btnReset2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddSupplier.tfKategori.setText("");
            }
        });
    }
}

package Controller;

import MVC.MVC_Home;
import Model.ModelKategori;
import Model.ModelSupply;
import View.ViewAddSupply;

<<<<<<< HEAD
=======
import javax.swing.*;
import javax.swing.table.TableModel;
>>>>>>> 9755404e0b5040c69f9ad7512f0fbddbaf1527d8
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerAddSupply {
    ViewAddSupply viewAddSupply;
    ModelSupply modelSupply;
    ModelKategori modelKategori;

    public ControllerAddSupply(ViewAddSupply viewAddSupply,  ModelSupply modelSupply){
        this.viewAddSupply = viewAddSupply;
        this.modelSupply = modelSupply;
        /*
        if (modelSupply.getBanyakData2() != 0){
            String[][] readNamaKategori = modelSupply.readKategori();
            viewAddSupply.table.setModel((TableModel) new JTable(readNamaKategori, viewAddSupply.namaKolom));
            updateDataCombo(modelSupply.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }*/

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
            }
        });
        viewAddSupply.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_produk = viewAddSupply.getSupply();
                String jumlah_produk = viewAddSupply.getJumlah();
                modelSupply.insertSupply(nama_produk,jumlah_produk);
            }
        });

    }

    //private void updateDataCombo(ArrayList<String> readNamaKategori) {}

}
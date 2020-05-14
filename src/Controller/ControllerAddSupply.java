package Controller;

import MVC.MVC_Home;
import Model.ModelKategori;
import Model.ModelSupply;
import View.ViewAddSupply;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControllerAddSupply {
    ViewAddSupply viewAddSupply;
    ModelSupply modelSupply;
    ModelKategori modelKategori;

    public ControllerAddSupply(ViewAddSupply viewAddSupply,  ModelSupply modelSupply){
        this.viewAddSupply = viewAddSupply;
        this.modelSupply = modelSupply;
        this.modelKategori = modelKategori;

        if (modelSupply.getBanyakData2() != 0){
            ArrayList<String> readNamaKategori = modelSupply.readNamaKategori();
            viewAddSupply.table.setModel(new JTable(readNamaKategori, viewAddSupply.namaKolom)).getModelkategori());
            updateDataCombo(modelSupply.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

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
                String nama_produk = viewAddSupply.getSupply();
                String jumlah_produk = viewAddSupply.getJumlah();
                modelSupply.insertSupply(nama_produk,jumlah_produk);
            }
        });
        viewAddSupply.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 if (e.getSource() == viewAddSupply.btnAdd){
                    String no_hp = viewAddSupply.getKategori();
                 } else {
                     //viewAddSupply.tfNama2.setText("");

                 }
                String nama_produk = viewAddSupply.getSupply();
                String jumlah_produk = viewAddSupply.getJumlah();
                modelSupply.insertSupply(nama_produk,jumlah_produk);
            }
        });

    }



    private void updateDataCombo(ArrayList<String> readNamaKategori) {
        viewAddSupply.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewAddSupply.cbKategori.addItem(item);
        }
    }
}

package Controller;

import MVC.MVC_Home;
import Model.ModelSupply;
import View.ViewAddSupply;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControllerAddSupply {
    ViewAddSupply viewAddSupply;
    ModelSupply modelSupply;

    public ControllerAddSupply(ViewAddSupply viewAddSupply,  ModelSupply modelSupply){
        this.viewAddSupply = viewAddSupply;
        this.modelSupply = modelSupply;

        if (modelSupply.getBanyakData2() != 0){
            String[][] readNamaKategori = modelSupply.readKategori();
            viewAddSupply.table.setModel((TableModel) new JTable(readNamaKategori, viewAddSupply.namaKolom).getModel());
            updateDataCombo(modelSupply.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        if (modelSupply.getBanyakData3() != 0){
            String[][] readNamaSupplier = modelSupply.readSupplier();
            viewAddSupply.table.setModel((TableModel) new JTable(readNamaSupplier, viewAddSupply.namaKolom).getModel());
            updateDataCombo2(modelSupply.readNamaSupplier());
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
            }
        });
        viewAddSupply.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_produk = viewAddSupply.getSupply();
                String jumlah_produk = viewAddSupply.getJumlah();
                String kategori = viewAddSupply.getKategori();
                String supplier = viewAddSupply.getSupplier();
                modelSupply.insertSupply(nama_produk,jumlah_produk,kategori,supplier);
            }
        });

    }

    private void updateDataCombo2(ArrayList<String> readNamaSupplier) {
        viewAddSupply.cbSupplier.removeAllItems();
        for (String item : readNamaSupplier) {
            viewAddSupply.cbSupplier.addItem(item);
        }
    }

    private void updateDataCombo(ArrayList<String> readNamaKategori) {
        viewAddSupply.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewAddSupply.cbKategori.addItem(item);
        }
    }

}
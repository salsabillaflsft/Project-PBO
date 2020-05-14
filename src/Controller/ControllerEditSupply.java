package Controller;

import MVC.MVC_Home;
import Model.ModelSupply;
import View.ViewEditSupply;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControllerEditSupply {
    ViewEditSupply viewEditSupply;
    ModelSupply modelSupply;

    public ControllerEditSupply(ViewEditSupply viewEditSupply,  ModelSupply modelSupply){
        this.viewEditSupply = viewEditSupply;
        this.modelSupply = modelSupply;

        if (modelSupply.getBanyakData() != 0){
            String[][] readNamaProduk = modelSupply.readSupply();
            viewEditSupply.table.setModel((TableModel) new JTable(readNamaProduk, viewEditSupply.namaKolom).getModel());
            updateDataCombo(modelSupply.readNamaProduk());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }
        if (modelSupply.getBanyakData2() != 0){
            String[][] readNamaKategori = modelSupply.readKategori();
            viewEditSupply.table.setModel((TableModel) new JTable(readNamaKategori, viewEditSupply.namaKolom).getModel());
            updateDataCombo2(modelSupply.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        if (modelSupply.getBanyakData3() != 0){
            String[][] readNamaSupplier = modelSupply.readSupplier();
            viewEditSupply.table.setModel((TableModel) new JTable(readNamaSupplier, viewEditSupply.namaKolom).getModel());
            updateDataCombo3(modelSupply.readNamaSupplier());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

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
            }
        });
        viewEditSupply.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_produk = viewEditSupply.getSupply();
                String jumlah_produk = viewEditSupply.getJumlah();
                String kategori = viewEditSupply.getKategori();
                String supplier = viewEditSupply.getSupplier();
                if (jumlah_produk.equals("")){
                    JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
                } else {
                    modelSupply.updateSupply(nama_produk, jumlah_produk, kategori, supplier);
                    String newData[][] = modelSupply.readSupply();
                    viewEditSupply.table.setModel(new JTable(newData, viewEditSupply.namaKolom).getModel());
                    updateDataCombo(modelSupply.readNamaProduk());
                }

            }
        });

    }

    private void updateDataCombo3(ArrayList<String> readNamaSupplier) {
        viewEditSupply.cbSupplier.removeAllItems();
        for (String item : readNamaSupplier) {
            viewEditSupply.cbSupplier.addItem(item);
        }
    }

    private void updateDataCombo2(ArrayList<String> readNamaKategori) {
        viewEditSupply.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewEditSupply.cbKategori.addItem(item);
        }
    }

    private void updateDataCombo(ArrayList<String> readNamaProduk) {
        viewEditSupply.cbSupply.removeAllItems();
        for (String item : readNamaProduk) {
            viewEditSupply.cbSupply.addItem(item);
        }
    }
}

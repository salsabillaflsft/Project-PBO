package Controller;

import MVC.MVC_Home;
import Model.ModelSupply;
import View.ViewSupply;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerSupply {
    ViewSupply viewSupply;
    ModelSupply modelSupply;

    public ControllerSupply(ViewSupply viewSupply, ModelSupply modelSupply){
        this.viewSupply = viewSupply;
        this.modelSupply = modelSupply;
        if (modelSupply.getBanyakData() != 0) {
            String data[][] = modelSupply.readSupply();
            viewSupply.tabel.setModel((new JTable(data, viewSupply.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        viewSupply.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewSupply.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });
        viewSupply.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int baris = viewSupply.tabel.getSelectedRow();
                int kolom = viewSupply.tabel.getSelectedColumn();

                String dataterpilih = viewSupply.tabel.getValueAt(baris, 0).toString();
                System.out.println(dataterpilih);

               int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus supply " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    //modelSupply.deleteSupply(dataterpilih);
                    String dataContact[][] = modelSupply.readSupply();
                    viewSupply.tabel.setModel(new JTable(dataContact,viewSupply.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });

    }
}

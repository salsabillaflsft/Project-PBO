package Controller;

import MVC.MVC_Home;
import Model.ModelSupply;
import View.ViewSupply;

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

               /* int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus contact dengan nama " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    modelSupply.deleteContact(dataterpilih);
                    String dataContact[][] = modelSupply.readContact();
                    modelSupply.tabel.setModel(new JTable(dataContact, viewcontact.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }*/
            }
        });

    }
}
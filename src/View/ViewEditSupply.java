package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewEditSupply extends JFrame {
    JLabel title = new JLabel("EDIT SUPPLY");
    JLabel title2 = new JLabel("EDIT SUPPLY");

    JLabel lSupply = new JLabel("Supply: ");
    public JComboBox cbSupply = new JComboBox();
    JLabel lJumlah = new JLabel("Jumlah: ");
    public JTextField tfJumlah = new JTextField();
    JLabel lKategori = new JLabel("Kategori: ");
    public JComboBox cbKategori = new JComboBox();
    JLabel lSupplier = new JLabel("Supplier: ");
    public JComboBox cbSupplier = new JComboBox();


    public JButton btnHome = new JButton("Home");
    public JButton btnEdit = new JButton("Edit");
    public JButton btnReset = new JButton("Reset");

    Color salem  = new Color(249, 239, 234);
    Color red2 = new Color(150, 54, 54);
    Color red = new Color(212, 76, 76);
    Color green2 = new Color(61, 99, 65);
    Color green = new Color(85, 138, 90);
    Color yellow = new Color(255, 196, 33);
    Color pink = new Color(255, 148, 177);
    Color blue2 = new Color(51, 56, 173);
    Color blue = new Color(176, 208, 211);
    Color puce = new Color(192, 132, 151);
    Color orange  = new Color(247, 175, 157);
    Color peach = new Color(247, 227, 175);
    Color yellow2 = new Color(243, 238, 195);

    ImageIcon img = new ImageIcon("src\\Assets\\add.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond",Font.ITALIC,20);
    Font font2 = new Font("Garamond",Font.PLAIN,20);

    public JTable table;
    JScrollPane scrollPane;
    DefaultTableModel tableModel;
    public Object[] namaKolom= {"id_supply", "kategori","supplier", "nama_produk", "jumlah_produk"};
    public ViewEditSupply(){
        tableModel = new DefaultTableModel(getNamaKolom(), 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        getContentPane().setBackground(salem);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(315,50,800,50);
        title.setFont(new Font("Garamond",Font.BOLD,50));
        title.setForeground(blue2);
        add(title2);
        title2.setBounds(330,100,800,50);
        title2.setFont(new Font("Garamond",Font.BOLD,45));
        title2.setForeground(blue);

        add(logo);
        logo.setBounds(700,10,422,634);

        add(lSupply);
        lSupply.setBounds(150,180,200,35);
        lSupply.setFont(font2);
        add(cbSupply);
        cbSupply.setBounds(330,180,300,35);

        add(lJumlah);
        lJumlah.setBounds(150,230,200,35);
        lJumlah.setFont(font2);
        add(tfJumlah);
        tfJumlah.setBounds(330,230,300,35);

        add(lKategori);
        lKategori.setFont(font2);
        lKategori.setBounds(330,280,200,35);
        add(cbKategori);
        cbKategori.setBounds(430,280,200,35);

        add(lSupplier);
        lSupplier.setFont(font2);
        lSupplier.setBounds(330,330,200,35);
        add(cbSupplier);
        cbSupplier.setBounds(430,330,200,35);

        add(btnEdit);
        btnEdit.setBounds(530, 380, 100, 50);
        btnEdit.setFont(font);
        btnEdit.setBackground(green2);
        btnEdit.setForeground(salem);
        add(btnReset);
        btnReset.setBounds(530, 450, 100, 50);
        btnReset.setFont(font);
        btnReset.setBackground(red2);
        btnReset.setForeground(salem);

        add(btnHome);
        btnHome.setBounds(30, 55, 75, 50);
        btnHome.setFont(font);
        btnHome.setBackground(blue);
        btnHome.setForeground(blue2);
    }

    public String getSupply(){return cbSupply.getSelectedItem().toString(); }
    public String getJumlah(){
        return tfJumlah.getText();
    }
    public String getKategori(){ return cbKategori.getSelectedItem().toString();}
    public String getSupplier(){ return cbSupplier.getSelectedItem().toString();}

    public Object[] getNamaKolom() {
        return namaKolom;
    }
    public void setNamaKolom(Object[] namaKolom) {
        this.namaKolom = namaKolom;
    }

}

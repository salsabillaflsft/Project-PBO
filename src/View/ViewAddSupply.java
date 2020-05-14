package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewAddSupply extends JFrame {
    public JComboBox cbKategori = new JComboBox();
    JLabel title = new JLabel("ADD SUPPLY");
    JLabel title2 = new JLabel("ADD SUPPLY");

    JLabel lSupply = new JLabel("Supply: ");
    public JTextField tfSupply = new JTextField();
    JLabel lJumlah = new JLabel("Jumlah: ");
    public JTextField tfJumlah = new JTextField();
    JLabel lKategori = new JLabel("Kategori: ");

    JLabel lTanggal = new JLabel("Tanggal Pengiriman: ");
    public JTextField tfTanggal = new JTextField();
    JLabel lTanggal2 = new JLabel("Tanggal Penerimaan: ");
    public JTextField tfTanggal2 = new JTextField();
    JLabel lSupplier = new JLabel("Supplier: ");
    JComboBox cbSupplier = new JComboBox();


    public JButton btnHome = new JButton("Home");
    public JButton btnAdd = new JButton("Add");
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
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object[] namaKolom = {"id_kategori", "Nama_kategori"};
    public ViewAddSupply(){
        tableModel = new DefaultTableModel(getNamaKolom(), 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        getContentPane().setBackground(salem);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(320,50,800,50);
        title.setFont(new Font("Garamond",Font.BOLD,50));
        title.setForeground(orange);
        add(title2);
        title2.setBounds(330,100,800,50);
        title2.setFont(new Font("Garamond",Font.BOLD,45));
        title2.setForeground(peach);

        add(logo);
        logo.setBounds(700,10,422,634);

        add(lSupply);
        lSupply.setBounds(150,180,200,35);
        lSupply.setFont(font2);
        add(tfSupply);
        tfSupply.setBounds(330,180,300,35);

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

        add(btnAdd);
        btnAdd.setBounds(530, 400, 100, 50);
        btnAdd.setFont(font);
        btnAdd.setBackground(green);
        add(btnReset);
        btnReset.setBounds(530, 480, 100, 50);
        btnReset.setFont(font);
        btnReset.setBackground(red);

        add(btnHome);
        btnHome.setBounds(30, 55, 75, 50);
        btnHome.setFont(font);
        btnHome.setBackground(blue);
        btnHome.setForeground(blue2);
    }
    public String getSupply(){
        return tfSupply.getText();
    }
    public String getJumlah(){
        return tfJumlah.getText();
    }
    /*
    public String getKategori(){ return cbKategori.getSelectedItem().toString();}
    public String getSupplier(){ return cbSupplier.getSelectedItem().toString();}*/

    public Object[] getNamaKolom() {
        return namaKolom;
    }

    public void setNamaKolom(Object[] namaKolom) {
        this.namaKolom = namaKolom;
    }
}

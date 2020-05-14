package View;

import javax.swing.*;
import java.awt.*;

public class ViewAddSupplier extends JFrame {
    JLabel title = new JLabel("ADD SUPPLIER");
    JLabel title2 = new JLabel("ADD KATEGORI");

    JLabel lSupplier = new JLabel("Nama Supplier: ");
    public JTextField tfSupplier = new JTextField();
    JLabel lContact = new JLabel("Contact: ");
    public JTextField tfContact = new JTextField();
    JLabel lKategori = new JLabel("Nama Kategori: ");
    public JTextField tfKategori = new JTextField();


    public JButton btnHome = new JButton("Home");
    public JButton btnAdd = new JButton("Add");
    public JButton btnReset = new JButton("Reset");
    public JButton btnAdd2 = new JButton("Add");
    public JButton btnReset2 = new JButton("Reset");

    Color salem = new Color(249, 239, 234);
    Color red2 = new Color(150, 54, 54);
    Color red = new Color(212, 76, 76);
    Color green2 = new Color(61, 99, 65);
    Color green = new Color(85, 138, 90);
    Color yellow = new Color(255, 196, 33);
    Color pink = new Color(255, 148, 177);
    Color blue2 = new Color(51, 56, 173);
    Color blue = new Color(176, 208, 211);
    Color puce = new Color(192, 132, 151);
    Color orange = new Color(247, 175, 157);
    Color peach = new Color(247, 227, 175);
    Color yellow2 = new Color(243, 238, 195);

    ImageIcon img = new ImageIcon("src\\Assets\\supplier.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond", Font.ITALIC, 20);
    Font font2 = new Font("Garamond", Font.PLAIN, 20);

    public ViewAddSupplier() {
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400, 50, 1200, 700);

        add(title);
        title.setBounds(250, 100, 800, 50);
        title.setFont(new Font("Garamond", Font.BOLD, 45));
        title.setForeground(orange);
        add(title2);
        title2.setBounds(600, 100, 800, 50);
        title2.setFont(new Font("Garamond", Font.BOLD, 45));
        title2.setForeground(peach);

        add(logo);
        logo.setBounds(445, 200, 313, 313);

        add(lSupplier);
        lSupplier.setBounds(100, 200, 200, 35);
        lSupplier.setFont(font2);
        add(tfSupplier);
        tfSupplier.setBounds(100, 230, 300, 35);
        tfSupplier.setBackground(orange);

        add(lKategori);
        lKategori.setBounds(800, 200, 200, 35);
        lKategori.setFont(font2);
        add(tfKategori);
        tfKategori.setBounds(800, 230, 300, 35);
        tfKategori.setBackground(peach);

        add(lContact);
        lContact.setBounds(100, 270, 200, 35);
        lContact.setFont(font2);
        add(tfContact);
        tfContact.setBounds(100, 300, 300, 35);
        tfContact.setBackground(orange);

        add(btnAdd);
        btnAdd.setBounds(100, 355, 100, 40);
        btnAdd.setFont(font);
        btnAdd.setBackground(green);
        add(btnReset);
        btnReset.setBounds(100, 410, 100, 40);
        btnReset.setFont(font);
        btnReset.setBackground(red);

        add(btnAdd2);
        btnAdd2.setBounds(800, 280, 100, 40);
        btnAdd2.setFont(font);
        btnAdd2.setBackground(green);
        add(btnReset2);
        btnReset2.setBounds(800, 330, 100, 40);
        btnReset2.setFont(font);
        btnReset2.setBackground(red);


        add(btnHome);
        btnHome.setBounds(30, 55, 75, 50);
        btnHome.setFont(font);
        btnHome.setBackground(blue);
        btnHome.setForeground(blue2);
    }

    public String getNama() {

        return tfSupplier.getText();
    }

    public String getContact() {
        return tfContact.getText();
    }
    public String getKategori() {
        return tfKategori.getText();
    }

}

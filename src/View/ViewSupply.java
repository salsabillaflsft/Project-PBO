package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewSupply extends JFrame{
    JLabel title = new JLabel("RESTAURANT SUPPLY");
    JLabel title2 = new JLabel("RESTAURANT SUPPLY");


    public JButton btnHome = new JButton("Home");

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane jScrollPane;
    Object namaKolom[] = {"Supply","Jumlah","Kategori","Tanggal Pengiriman","Tanggal Penerimaan","Supplier","Supplier Contact"};
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

    ImageIcon img = new ImageIcon("src\\Assets\\sushi2.jpg");
    JLabel logo = new JLabel(img);


    Font font = new Font("Garamond",Font.ITALIC,20);

    public ViewSupply(){
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        jScrollPane = new JScrollPane(tabel);
        getContentPane().setBackground(salem);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(340,50,800,50);
        title.setFont(new Font("Garamond",Font.BOLD,50));
        title.setForeground(orange);
        add(title2);
        title2.setBounds(370,100,800,50);
        title2.setFont(new Font("Garamond",Font.BOLD,45));
        title2.setForeground(peach);

        add(jScrollPane);
        jScrollPane.setBounds(100,180,1000,400);
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        add(logo);
        logo.setBounds(1000,80,100,100);

        add(btnHome);
        btnHome.setBounds(30, 55, 75, 50);
        btnHome.setFont(font);
        btnHome.setBackground(blue);
        btnHome.setForeground(blue2);

    }
}

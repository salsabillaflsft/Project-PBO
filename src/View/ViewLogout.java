package View;

import javax.swing.*;
import java.awt.*;

public class ViewLogout extends JFrame{
    JLabel title = new JLabel("123180141 - 123180144");

    public JButton btnLogin = new JButton("Kembali Login");

    Color salem  = new Color(249, 239, 234);
    Color red2 = new Color(150, 54, 54);
    Color red = new Color(212, 76, 76);
    Color green2 = new Color(61, 99, 65);
    Color green = new Color(85, 138, 90);
    Color yellow = new Color(255, 196, 33);
    Color pink = new Color(255, 148, 177);

    Color bg = new Color(176, 208, 211);
    Color puce = new Color(192, 132, 151);
    Color orange  = new Color(247, 175, 157);
    Color peach = new Color(247, 227, 175);
    Color yellow2 = new Color(243, 238, 195);


    ImageIcon img = new ImageIcon("src\\Assets\\logout.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Helvetica",Font.PLAIN,25);

    public ViewLogout(){
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(330,50,800,50);
        title.setFont(new Font("Helvetica",Font.BOLD,50));

        add(logo);
        logo.setBounds(280,120,626,417);

        add(btnLogin);
        btnLogin.setBounds(500, 540, 180, 40);
        btnLogin.setFont(new Font("Helvetica",Font.ITALIC,20));
        btnLogin.setBackground(salem);
        btnLogin.setForeground(green);

    }
}

package View;

import javax.swing.*;
import java.awt.*;

public class ViewMain extends JFrame {
    JLabel title = new JLabel("WELCOME");

    JLabel lUser = new JLabel("Username : ");
    JTextField tfUser = new JTextField();
    JLabel lPass = new JLabel("Password : ");
    JTextField tfPass = new JTextField();

    public JButton btnLogin = new JButton("Log In");
    public JButton btnRegis = new JButton("Register");

    Color bg = new Color(66, 129, 164);
    Color grey = new Color(156, 175, 183);
    Color wheat = new Color(234, 210, 172);
    Color orange  = new Color(230, 184, 156);
    Color red = new Color(254, 147, 140);

    ImageIcon img = new ImageIcon("src\\home.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Helvetica",Font.PLAIN,25);

    public ViewMain(){
        getContentPane().setBackground(bg);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(470,50,500,50);
        title.setFont(new Font("Helvetica",Font.BOLD,50));

        add(logo);
        logo.setBounds(300,150,626,174);

        add(lUser);
        lUser.setBounds(425, 350, 200, 25);
        lUser.setFont(font);
        add(tfUser);
        tfUser.setBounds(575, 350, 200, 30);
        tfUser.setBackground(red);
        add(lPass);
        lPass.setBounds(425, 400, 200, 25);
        lPass.setFont(font);
        add(tfPass);
        tfPass.setBounds(575, 400, 200, 30);
        tfPass.setBackground(red);

        add(btnLogin);
        btnLogin.setBounds(670, 450, 100, 30);
        btnLogin.setBackground(wheat);
        add(btnRegis);
        btnRegis.setBounds(670, 490, 100, 30);
        btnRegis.setBackground(orange);
    }

    public String getUser(){
        return tfUser.getText();
    }
    public String getPass(){
        return tfPass.getText();
    }

}

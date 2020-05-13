package Controller;

import MVC.MVC_Home;
import Model.ModelMain;
import View.ViewMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerMain  {
    ModelMain modelmain;
    ViewMain viewmain;

    public ControllerMain(ModelMain modelmain, ViewMain viewmain) {
       this.modelmain = modelmain;
       this.viewmain = viewmain;

       viewmain.btnLogin.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if (viewmain.getUser().equals("")) {
                   JOptionPane.showMessageDialog(null, "Username Kosong");
               } else if (viewmain.getPass().equals("")) {
                   JOptionPane.showMessageDialog(null, "Password Kosong");
               } else {
                   try {
                       String Username = viewmain.getUser();
                       String Password = viewmain.getPass();
                       String data[][] = modelmain.logIn(Username, Password);
                       if ( Username.equals(data[0][1]) && Password.equals(data[0][2])) {
                           System.out.println("Login Success");
                           JOptionPane.showMessageDialog(null, "Login Berhasil!");
                           viewmain.setVisible(false);
                           MVC_Home mvc_home = new MVC_Home(data);
                       } else {
                           System.out.println("Login Gagal");
                           JOptionPane.showMessageDialog(null, "Username/Password Salah");
                       }
                   } catch (Exception ex) {
                       JOptionPane.showMessageDialog(null, ex.getMessage());
                   }
                }
            }
        });
    }
}
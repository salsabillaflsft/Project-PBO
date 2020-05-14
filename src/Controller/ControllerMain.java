package Controller;

import MVC.MVC_Home;
import Model.ModelMain;
import View.ViewMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerMain  {
    ModelMain modelMain;
    ViewMain viewMain;

    public ControllerMain(ModelMain modelMain, ViewMain viewMain) {
       this.modelMain = modelMain;
       this.viewMain = viewMain;

       viewMain.btnLogin.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               if (viewMain.getUser().equals("")) {
                   JOptionPane.showMessageDialog(null, "Username Kosong");
               } else if (viewMain.getPass().equals("")) {
                   JOptionPane.showMessageDialog(null, "Password Kosong");
               } else {
                   try {
                       String Username = viewMain.getUser();
                       String Password = viewMain.getPass();
                       String data[][] = modelMain.logIn(Username, Password);
                       if ( Username.equals(data[0][1]) && Password.equals(data[0][2])) {
                           System.out.println("Login Success");
                           JOptionPane.showMessageDialog(null, "Login Berhasil!");
                           viewMain.setVisible(false);
                           MVC_Home mvc_home = new MVC_Home();
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
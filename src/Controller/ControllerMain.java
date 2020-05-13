package Controller;

import Model.ModelMain;
import View.ViewHome;
import View.ViewMain;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ControllerMain extends javax.swing.JFrame {
    ModelMain modelmain;
    ViewMain viewmain;
    Connection connection = null;
    Statement statement = null;

    public ControllerMain(ModelMain modelmain, ViewMain viewmain) {
        //initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/restaurant", "root", "");
            statement = connection.createStatement();
            JOptionPane.showMessageDialog(null, "berhasil koneksi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
    }
    //this.modelmain = modelmain;
    //this.viewmain = viewmain;
    // viewmain.btnLogin.addActionListener((ActionListener) this);

    /* viewmain.btnLogin.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
              String user = viewmain.getUser();
              String pass = viewmain.getPass();
              String dataLogin[][]=modelmain.logIn();
          }
      });*/

    private void CekLogin() {
        try {
            if (tfUser.getText().equals("") || tfPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Data tidak boleh kosong", "pesan", JOptionPane.ERROR_MESSAGE);
                tfUser.requestFocus();
            } else {
                statement = connection.createStatement();
                String sql = ("SELECT FROM user WHERE username ='" + tfUser.getText() + "' AND password ='" + String.valueOf(tfPass.getText()) + "'");
                ResultSet rs = statement.executeQuery(sql);
                if (rs.next()) {
                    this.dispose();
                    new ViewHome().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "user atau pass salah", "pesan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        CekLogin();
    }
    /*public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ViewMain dialog = new ViewMain(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                public void windowClosing(java.awt.event.WindowEvent e){
                    System.exit(0);
                }
            });
                dialog.setVisible(true);
            }
        });
    }*/
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lUser;
    private javax.swing.JLabel lPass;
    private javax.swing.JTextField tfUser;
    private javax.swing.JTextField tfPass;
}
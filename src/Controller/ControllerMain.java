package Controller;

import Model.ModelMain;
import View.ViewMain;

import javax.swing.*;
import java.awt.event.*;

public class ControllerMain {
    ModelMain modelmain;
    ViewMain viewmain;

    public ControllerMain(ModelMain modelmain, ViewMain viewmain){
        this.modelmain = modelmain;
        this.viewmain = viewmain;

        viewmain.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String user = viewmain.getUser();
                String pass = viewmain.getPass();
                String dataLogin[][]=modelmain.logIn();
            }
        });
    }
}

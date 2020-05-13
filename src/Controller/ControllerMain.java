package Controller;

import Model.ModelMain;
import View.ViewMain;
import java.awt.event.*;

public class ControllerMain {
    ModelMain modelMain;
    ViewMain viewMain;

    public ControllerMain(ModelMain modelMain, ViewMain viewMain){
        this.modelMain = modelMain;
        this.viewMain = viewMain;

       viewMain.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String user = viewMain.getUser();
                String pass = viewMain.getPass();
               // String dataLogin[][]=viewMain;
            }
        });
    }
}

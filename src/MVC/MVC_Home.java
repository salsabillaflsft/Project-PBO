package MVC;

import Controller.ControllerHome;
import Model.ModelHome;
import View.ViewHome;

public class MVC_Home {
    String data[][];

    public MVC_Home(String[][] data) {
        this.data=data;
        ViewHome viewHome = new ViewHome();
        ModelHome modelHome = new ModelHome();
        ControllerHome controllerHome = new ControllerHome(modelHome,viewHome);


    }
}

package MVC;

import Controller.ControllerHome;
import View.ViewHome;

public class MVC_Home {
    public MVC_Home() {
        ViewHome viewHome = new ViewHome();
        ControllerHome controllerHome = new ControllerHome(viewHome);
    }
}

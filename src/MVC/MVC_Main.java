package MVC;

import Controller.ControllerMain;
import Model.ModelMain;
import View.ViewMain;

public class MVC_Main {
    ViewMain viewMain = new ViewMain();
    ModelMain modelMain = new ModelMain();
    ControllerMain controllerMain = new ControllerMain(modelMain,viewMain);
}

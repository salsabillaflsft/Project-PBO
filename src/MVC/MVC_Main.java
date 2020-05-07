package MVC;

import Controller.ControllerMain;
import Model.ModelMain;
import View.ViewMain;

public class MVC_Main {
    ViewMain viewmain = new ViewMain();
    ModelMain modelmain = new ModelMain();
    ControllerMain controllermain = new ControllerMain(modelmain,viewmain);
}

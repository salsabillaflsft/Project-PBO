package MVC;

import Controller.ControllerSupply;
import Model.ModelSupply;
import View.ViewSupply;

public class MVC_Supply {
    ViewSupply viewSupply = new ViewSupply();
    ModelSupply modelSupply = new ModelSupply();
    ControllerSupply controllerSupply = new ControllerSupply(modelSupply,viewSupply);
}

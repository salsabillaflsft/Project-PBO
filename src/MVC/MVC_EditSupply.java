package MVC;

import Controller.ControllerEditSupply;
import Model.ModelSupply;
import View.ViewEditSupply;

public class MVC_EditSupply {
    ViewEditSupply viewEditSupply = new ViewEditSupply();
    ModelSupply modelSupply = new ModelSupply();
    ControllerEditSupply controllerEditSupply = new ControllerEditSupply(viewEditSupply, modelSupply);
}

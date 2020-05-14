package MVC;

import Controller.ControllerAddSupply;
import Model.ModelSupply;
import View.ViewAddSupply;


public class MVC_AddSupply {
    public MVC_AddSupply(){
        ViewAddSupply viewAddSupply = new ViewAddSupply();
        ModelSupply modelSupply = new ModelSupply();
        ControllerAddSupply controllerAddSupply = new ControllerAddSupply(viewAddSupply,modelSupply);
    }
}

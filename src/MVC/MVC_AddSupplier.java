package MVC;

import Controller.ControllerAddSupplier;
import Model.ModelAddSupplier;
import View.ViewAddSupplier;

public class MVC_AddSupplier {
    public MVC_AddSupplier(){
        ViewAddSupplier viewAddSupplier = new ViewAddSupplier();
        ModelAddSupplier modelAddSupplier = new ModelAddSupplier();
        ControllerAddSupplier controllerAddSupplier = new ControllerAddSupplier(viewAddSupplier,modelAddSupplier);
    }
}

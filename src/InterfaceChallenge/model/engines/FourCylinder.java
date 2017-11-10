package InterfaceChallenge.model.engines;

import InterfaceChallenge.interfacess.Engine;

public class FourCylinder implements Engine {


    @Override
    public void accelerate() {
        System.out.println("vroom");
    }
}

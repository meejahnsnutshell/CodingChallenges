package InterfaceChallenge;

import InterfaceChallenge.model.Car;
import InterfaceChallenge.model.engines.FourCylinder;
import InterfaceChallenge.model.engines.V6;
import InterfaceChallenge.model.transmissions.Automatic;
import InterfaceChallenge.model.transmissions.Manual;

public class CarFactory {

    public static void main(String[] args) {

        // create objects of the V6 and Automatic classes
        V6 vSix = new V6();
        Automatic auto = new Automatic();
        // then pass those 2 objects to a new Car object.
        Car car1= new Car(vSix, auto);
        car1.turnOn();
        car1.getEngine().accelerate();
        car1.turnOff();
        System.out.println("--------");

        FourCylinder fourCyl = new FourCylinder();
        Manual man = new Manual();
        Car car2 = new Car();
        car2.setEngine(fourCyl);
        car2.setTrans(man);
        car2.turnOn();
        car2.getEngine().accelerate();
        car2.turnOff();

    }

}

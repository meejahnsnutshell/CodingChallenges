package InterfaceChallenge.model;

import InterfaceChallenge.interfacess.CarInterface;
import InterfaceChallenge.interfacess.Engine;
import InterfaceChallenge.interfacess.Transmission;

public class Car implements CarInterface {

    private Engine engine;
    private Transmission trans;

    public Car() {
    }

    public Car(Engine engine, Transmission trans) {
        this.engine = engine;
        this.trans = trans;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTrans() {
        return trans;
    }

    public void setTrans(Transmission trans) {
        this.trans = trans;
    }

    @Override
    public void turnOn() {
        System.out.println("Car is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Car is off.");
    }
}

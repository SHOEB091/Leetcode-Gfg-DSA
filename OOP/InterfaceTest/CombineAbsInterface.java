package OOP.InterfaceTest;

interface GPS {
    void trackLocation();
}

abstract class Vehicle {
    abstract void drive();
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class SmartCar extends Vehicle implements GPS {
    @Override
    void drive() {
        System.out.println("Driving smart car...");
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking location via GPS...");
    }
}
public class CombineAbsInterface {
    public static void main(String[] args) {
        SmartCar myCar = new SmartCar();
        myCar.drive();
        myCar.trackLocation();
        myCar.stop();
    }
}
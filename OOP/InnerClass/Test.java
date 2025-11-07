package OOP.InnerClass;

public class Test {
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        Car.Engine engine = myCar.new Engine(); // Creating instance of Member Inner Class
        engine.startEngine();
        engine.stopEngine();
    }

}

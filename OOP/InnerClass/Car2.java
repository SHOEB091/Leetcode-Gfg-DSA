package OOP.InnerClass;

// Example of a static nested class in Java
public class Car2 {
    private String model = "Sedan";

    // Static nested class
    public static class Engine {
        public void start() {
            System.out.println("Engine started!");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        Car2.Engine engine = new Car2.Engine();
        engine.start();
    }
}
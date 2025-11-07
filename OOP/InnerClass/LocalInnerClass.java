package OOP.InnerClass;
//Local Inner class means a class defined within a method of the outer class.
//Local inner classes can access final or effectively final variables from the enclosing method.
public class LocalInnerClass {
    private String model = "SUV";

    public void showEngineStatus() {
        // Local inner class defined inside a method
        class Engine {
            public void start() {
                System.out.println("Engine of " + model + " started!");
            }
        }

        // Create and use the local inner class
        Engine engine = new Engine();
        engine.start();
    }

    public static void main(String[] args) {
        LocalInnerClass car = new LocalInnerClass();
        car.showEngineStatus();
}
}

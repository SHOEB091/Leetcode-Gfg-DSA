package OOP.Polymorphism;

public class Calculator {

    // Method overloading: same method name, different parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }


}

class Main{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using overloaded methods
        System.out.println("Integer addition: " + calc.add(5, 10)); // Calls int version
        System.out.println("Double addition: " + calc.add(5.5, 10.2)); // Calls double version
        System.out.println("String addition: " + calc.add("Hello, ", "World!")); // Calls String version
    }
}

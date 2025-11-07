package OOP.InnerClass;

// Anonymous Inner Class means a class without a name that is defined and instantiated in a single expression.
// They are often used to provide a quick implementation of an interface or to extend a class for one-time use.

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Anonymous inner class implementing an interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class!");
            }
        };
        greeting.sayHello();

        // Anonymous inner class extending a class
        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Anonymous animal sound!");
            }
        };
        animal.makeSound();
    }
}

// Interface for demonstration
interface Greeting {
    void sayHello();
}

// Class for demonstration
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
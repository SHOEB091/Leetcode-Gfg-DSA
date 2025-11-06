package OOP;

abstract class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}


public class AbstractionLearning {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.setName("Buddy");
        dog.setAge(4);
        System.out.println("Dog's Name: " + dog.getName());
        System.out.println("Dog's Age: " + dog.getAge());
        dog.makeSound(); // Calls the implemented abstract method
        dog.eat();       // Calls the regular method from the abstract class
    }
}

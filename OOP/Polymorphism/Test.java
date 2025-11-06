package OOP.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.setAge(5);
        myDog.setName("Buddy");
        myDog.sayHello(); // This will call the overridden method in Dog class
    }   
}

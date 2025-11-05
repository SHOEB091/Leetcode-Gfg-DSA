package OOP.Inheritance.animal;

public class Test {
    public static void main(String[] args) {
      Dog dog = new Dog();
      dog.setAge(15);
      dog.setName("bob");
      dog.sayHello();

      Cat cat = new Cat();
      cat.sayHello();
    }
}

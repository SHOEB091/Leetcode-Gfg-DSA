package OOP.Inheritance.thissuper;

// Child class to demonstrate 'this' and 'super'
class DogChild extends AnimalBase {
    // Field hiding just for demo (not recommended in real code)
    protected String name; // hides AnimalBase.name
    String breed;

    // Default constructor chains to another constructor using 'this()'
    DogChild() {
        this("Buddy", 1, "Labrador"); // calls own 3-arg constructor
        System.out.println("DogChild(): default constructor finished");
    }

    // Constructor that calls parent constructor using 'super(...)'
    DogChild(String name, int age, String breed) {
        super(name + " (parent)", age); // initialize AnimalBase part
        this.name = name;                 // initialize DogChild's own 'name'
        this.breed = breed;
        System.out.println("DogChild(String,int,String): child constructor called");
    }

    @Override
    void speak() {
        System.out.println("Woof!");
    }

    // Show difference between 'this' and 'super' when fields/methods are hidden/overridden
    void showNames() {
        System.out.println("Child name (this.name): " + this.name);
        System.out.println("Parent name (super.name): " + super.name);
    }

    void demoSpeakCalls() {
        System.out.print("Child speak via this: ");
        this.speak();
        System.out.print("Parent speak via super: ");
        super.speak();
    }
}

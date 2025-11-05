package OOP.Inheritance.thissuper;

// Parent/base class kept simple for clarity
class AnimalBase {
    // protected so child classes can access (and we can demo super.name)
    protected String name;
    protected int age;

    // Default constructor
    AnimalBase() {
        System.out.println("AnimalBase(): default constructor called");
    }

    // Parameterized constructor
    AnimalBase(String name, int age) {
        // 'this' refers to the current object's fields
        this.name = name;
        this.age = age;
        System.out.println("AnimalBase(String,int): super constructor called");
    }

    void speak() {
        System.out.println("Some animal sound");
    }

    void whoAmI() {
        System.out.println("AnimalBase => name=" + name + ", age=" + age);
    }
}

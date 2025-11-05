package OOP.Inheritance.thissuper;

/*
 Mini guide
 - this(...)  => call another constructor in the same class (must be first line)
 - super(...) => call a constructor of the parent class (must be first line)
 - this.name  => current class' field
 - super.name => parent's field (when hidden)
 - this.speak() calls overridden method; super.speak() calls parent's method
*/
public class Demo {

    private static void banner(String title) {
        System.out.println("\n==== " + title + " ====");
    }

    public static void main(String[] args) {
        banner("Using default constructor (this() -> super())");
        // Flow: DogChild() -> this("Buddy",1,"Labrador") -> super(name,age)
        DogChild d1 = new DogChild();
        System.out.println("[1] Names via this/super:");
        d1.showNames();
        System.out.println("[2] speak() vs super.speak():");
        d1.demoSpeakCalls();

        banner("Using parameterized constructor (direct super(...))");
        DogChild d2 = new DogChild("Rocky", 3, "Beagle");
        System.out.println("[1] Names via this/super:");
        d2.showNames();
        System.out.println("[2] speak() vs super.speak():");
        d2.demoSpeakCalls();

        banner("Parent whoAmI() on the same instances");
        d1.whoAmI();
        d2.whoAmI();
    }
}

/*
Expected (abridged) output order:
==== Using default constructor (this() -> super()) ====
AnimalBase(String,int): super constructor called
DogChild(String,int,String): child constructor called
DogChild(): default constructor finished
[1] Names via this/super:
Child name (this.name): Buddy
Parent name (super.name): Buddy (parent)
[2] speak() vs super.speak():
Child speak via this: Woof!
Parent speak via super: Some animal sound

==== Using parameterized constructor (direct super(...)) ====
AnimalBase(String,int): super constructor called
DogChild(String,int,String): child constructor called
[1] Names via this/super:
Child name (this.name): Rocky
Parent name (super.name): Rocky (parent)
[2] speak() vs super.speak():
Child speak via this: Woof!
Parent speak via super: Some animal sound

==== Parent whoAmI() on the same instances ====
AnimalBase => name=Buddy (parent), age=1
AnimalBase => name=Rocky (parent), age=3
*/

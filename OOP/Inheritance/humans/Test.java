package OOP.Inheritance.humans;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("ramesh");
        child.setAge(20);

        Parent parent = new Parent();
        parent.setAge(50);
        parent.setName("mukesh");

        System.out.println(child.getName());
        System.out.println(child.getAge());
        System.out.println(parent.getName());
        System.out.println(parent.getAge());
        
    }
    //This keyword is used to refer to the current class instance variable.
    //super keyword is used to refer to the parent class instance variable. or constructor
}

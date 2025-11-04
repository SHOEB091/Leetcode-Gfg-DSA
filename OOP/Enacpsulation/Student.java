package OOP.Enacpsulation;

//Encapsulation is Binding the Data and Enttity and basically hiding the implementation


public class Student{
    private String name;
    private int age;
    private int rollNumber;
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
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

}

package OOP.Constructors;



public class Student{
    private String name;
    private int age;
    private int rollNumber;

    //overload constructor
    public Student(){
        this.age = 10;
    }

    //parameterized constructor
    public Student(String name , int rollNumber , int age){
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }



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

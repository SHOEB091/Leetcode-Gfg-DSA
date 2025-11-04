package OOP.Enacpsulation;

public class Test {

    public static void main(String[] args) {
        
        // student.name = "ramesh";
        // student.age=19;
        // student.rollNumber=210102265;

        // System.out.println(student.rollNumber);
         Student student = new Student();
        student.setName("ritik chooliya");
        student.setAge(19);
        student.setRollNumber(210102265);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollNumber());

    }

}

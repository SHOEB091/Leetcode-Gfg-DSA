package ExceptionHandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowAndThrows {
    //Throws basically declares an exception might occur
    public static void method1() throws FileNotFoundException{
        FileReader filereader = new FileReader("somefile.txt");
    }
    
    public static void method2() throws FileNotFoundException{
            method1();
    }

    public static void main(String[] args) throws IOException{
        method2();
    }

    //Throw forcefully throws an exception
    public static void validate(int age){
        if(age < 18){
            throw new ArithmeticException("Not valid age to vote");
        } else {
            System.out.println("Valid age to vote");   
        }
    }
}

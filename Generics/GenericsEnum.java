package Generics;

enum Status {
    SUCCESS, FAILURE;

    public <T> void printType(T data) {
        System.out.println("Type: " + data.getClass().getSimpleName());
    }
}

public class GenericsEnum {
     public static void main(String[] args) {
        Status.SUCCESS.printType(100);       // Type: Integer
        Status.FAILURE.printType("Error");   // Type: String
    }
}

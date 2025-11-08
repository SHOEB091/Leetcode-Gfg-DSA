package ExceptionHandeling;

public class Finallykeyword {
    
    //finally basically do the cleanup activity it will always execute whether exception occurs or not

    public static int divide(int a, int b){
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            e.printStackTrace();
        } finally {
            System.out.println("Execution of the try-catch block is complete.");
        }
        return result;
    }

}

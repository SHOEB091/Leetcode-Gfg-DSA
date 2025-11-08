package ExceptionHandeling;

public class tryCatchExample {
    // Example of try-catch block
    public static int divide(int a, int b){
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int divisionResult = divide(num1, num2);
        System.out.println("Result: " + divisionResult);
    }

}

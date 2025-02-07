import java.util.Scanner;


public class fibonacciSeries {

    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a);

        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        printFibonacciSeries(n);
        scanner.close();
    }
}
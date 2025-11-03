package basicMaths;

public class GCD {

    // Continue loop as long as both
    // a and b are greater than 0
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }

    public static int calculateGCD(int number1, int number2){

        int gcd=1;
        for(int i=1;i<=Math.min(number1,number2);i++){
            if(number1%i==0 && number2%i==0){
                gcd=i;
            }
        }
        return gcd;

    }
    public static void main(String[] args) {
        int number1 = 20 , number2=15;
        System.out.println(calculateGCD(number1, number2));
    }
}

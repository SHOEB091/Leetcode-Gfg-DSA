package basicMaths;

public class ArmstringNumber {
    
    public static int numberOfDigits(int number){
        int count = 0;
        while(number > 0){
            count++;
            number = number / 10;
        }
        return count;
    }

    // Helper function to compute base^exp without using Math.pow
    public static int power(int base, int exp) {
        int result = 1;
        for(int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }

    public static boolean checkArmstrong(int number){
        int count = numberOfDigits(number);
        int original = number;
        int arms = 0;
        while(original != 0){
            int leftdigit = original % 10;
            arms += power(leftdigit, count);
            original = original / 10;
        }
        return number == arms;
    } 

    public static void main(String[] args) {
        int number = 153;
        System.out.println(checkArmstrong(number)); // true
    }
}
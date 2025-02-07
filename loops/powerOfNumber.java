package loops;

public class powerOfNumber {
    public static void main(String[] args) {
        int base = 3;
        int exponent =5;
        long power =1;

        for(int i=0;i<exponent;i++){
            power *= base;
        }
        System.out.println(power);
    }
}

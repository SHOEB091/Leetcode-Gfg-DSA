package loops;

public class profuctOfNumber {
    
    int num = 1234;
    int product = 1;

    public void calculateProduct() {
        while (num > 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }
    }


}

package loops;

public class primeFactor {
    public static void main(String[] args) {
        
        int num =10;
        int isPrime;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                isPrime=1;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = 0;
                        break;
                    }
                }
                if(isPrime==1){
                    System.out.print(i + ",");
                }

            }
        }


    }
}

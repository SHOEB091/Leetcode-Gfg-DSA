package loops;

public class fiboononacciNumber {
    public static void main(String[] args) {
        int N = 10;
        int a=0;
        int b=1;
        int c=0;

        for(int i=0;i<N;i++){
            System.out.print(c + " ");
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(c);

        
    }
}

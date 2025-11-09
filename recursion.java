public class recursion {

    //Recursion Demo
    public static String recursionDemo(int n1){
        if(n1==1){
            return "shoeb";
        }
        String name = "shoeb";
        return name + recursionDemo(n1-1); 
    }

    public static int sumOfNnsturalNumber(int n1){
        //base case
        if(n1==1){
            return 1;
        }
       
        return n1+sumOfNnsturalNumber(n1-1);
    }

    public static int factorial(int n){
        ///base case
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int N = 10;
       printNToOne(N);
    }

    public static void printNameNtimes(String name , int count , int N){
        //Base Case
        if(count == N){
            return;
        }
        //logic
        System.out.println(name);

        // Recursive call with incremented count
        printNameNtimes(name,count+1,N);

    }

    public static void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(current + 1, n);
    }

    public static void printNToOne(int n){
        //Base case
        if(n<1){
            return;
        }
        System.out.println(n + " ");
        printNToOne(n- 1);
    }

    

}

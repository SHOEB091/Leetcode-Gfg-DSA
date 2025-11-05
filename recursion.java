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
        int n1 = 10;
        System.out.println("Sum of N natural Number" + n1 + " is: " + recursionDemo(n1));
    }
}

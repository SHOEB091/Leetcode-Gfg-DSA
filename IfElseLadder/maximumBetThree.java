package IfElseLadder;

public class maximumBetThree {
    public static int maximum(int a , int b , int c) {
         a=10;
        b=20;
        c=30;
        int max;
        if(a>b){
            if(a>c){
                max = a;
            }
            else{
                max =b;
            }
        }
        else{
            if(b>c){
                max=b;
            }
            else{
                max=c;
            }
        }
        return max;

    }
}

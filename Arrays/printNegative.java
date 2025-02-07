package Arrays;
import java.util.*;
public class printNegative {

    public static void negativeNumberPrint(int[]arr){
        int negative = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<negative){
                negative = arr[i];
                list.add(negative);

            }
        }

        System.out.println("neative elemtns are " + list);
    }

    public static void main(String[] args) {
        int [] arr = { -1, -10 , 100, 5 , 61 , -2, -23 , 8 , -90 , 51};
        negativeNumberPrint(arr);
    }
}

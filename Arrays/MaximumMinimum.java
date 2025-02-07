package Arrays;

public class MaximumMinimum {

    public static int[] findMaxAndMin(int[]arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max  = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        
        return new int[]{max,min};
    }


    public static void main(String[] args) {

        int arr[]= {10,50,12,16,2};
       int [] result =findMaxAndMin(arr);
       System.out.println(result[0]);
       System.out.println(result[1]);

    }
}

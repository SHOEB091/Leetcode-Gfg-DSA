package Arrays;

public class CountEvenOddsArrayElement {

    public static int[] countEvenOdds(int[]arr){
        int count=0;
        int count2=0;
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
            else{
                count2++;
            }
        } 
        return new int[]{count,count2};
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9};
        int result[] = countEvenOdds(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

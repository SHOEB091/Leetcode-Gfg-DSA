package Recursion;

public class ArrarySortedOrNot {

    static boolean checkSorted(int []arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if (arr[index] > arr[index+1]) {
            return false;
        }
       return checkSorted(arr,index+1);

    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(checkSorted(arr,0)?"Sorted":"Not Sorted");
    }
}

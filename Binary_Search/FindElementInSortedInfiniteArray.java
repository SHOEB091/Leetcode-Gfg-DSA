package Binary_Search;

import java.util.Scanner;

public class FindElementInSortedInfiniteArray {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Suppose Enter the Infinite Array ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Target element to Search: ");
        int target = sc.nextInt();


    }
    public static int findEelementInInfiniteArray(int[]arr,int target)
    {
        int start = 0;
        int end = 1;

        // First try to find the lower and upper bounds before applying binary search
        while (target > arr[end]) {
            start = end;
            end *= 2;
        }

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}

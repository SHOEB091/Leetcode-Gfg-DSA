package Binary_Search;

import java.util.Scanner;

public class CeilingFloor {

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int []arr= new int[10];
        System.out.println("Enter numbers in array\n");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        //int []arr={2,4,5,9,10,12,13,18,19};
        System.out.println("enter the target element");
        int target = sc.nextInt();

        System.out.println("ceiling of a number is :");
        int ans = Ceiling(arr,target);
        System.out.println(ans);

        System.out.println("floor of a number is :");
        int ans2 = floor(arr,target);
        System.out.println(ans2);

    }

    public static int Ceiling(int []arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length-1])
        {
            return -1;
        }

        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }

    public static int floor(int []arr,int target)
    {
        int start=0;
        int end = arr.length-1;

        if(target>arr[arr.length-1])
        {
            return -1;
        }
        while(start<=end)
        {
            int mid = start+(end-start)/2;

            if(target<arr[mid])
            {
                end= mid-1;
            }
            else if (target>arr[mid])
            {
                start= mid+1;
            }
            else if (target==arr[mid])
            {
                return mid;
            }
        }
        return end;

    }

}

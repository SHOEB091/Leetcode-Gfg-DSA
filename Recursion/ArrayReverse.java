package Recursion;

public class ArrayReverse {

    //int base appraoch
    static void ReverseArray(int i,int[]arr,int num)
    {
        //base case
        if(i<num/2)
        {
            return;

        }
        int temp = arr[i];
        arr[i]=arr[num-i-1];
        arr[num-i-1]=temp;
         ReverseArray(i+1,arr,num);
    }


    static void reverseArray(int []arr, int left , int right)
    {
        //base case
        if(left>=right)
        {
            return;
        }
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverseArray(arr,left+1,right-1);
    }
//    static void printArray(int []arr, int size)
//    {
//        for (int i=0; i < size; i++)
//            System.out.print(arr[i] + " ");
//        System.out.println("");
//    }

    /*Driver function to check for above functions*/
    public static void main (String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6};
       // printArray(arr, 6);
        reverseArray(arr,0,arr.length-1);
        System.out.println("Reversed array is ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
       // printArray(arr, 6);

        int num =6;
        ReverseArray(0,arr,num);
        System.out.println("Second Approach");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}



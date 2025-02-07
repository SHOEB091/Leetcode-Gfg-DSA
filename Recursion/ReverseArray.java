package Recursion;

//arr= 1,2,3,4,2
//opt = 2,4,3,2,1

public class ReverseArray {

//    static void reverse1(int i,int []arr,int num)
//    {
//
//        if(i>=num/2)
//        {
//            return;
//        }
//        int temp = arr[i];
//        arr[i]=arr[num-i-1];
//        arr[num-i-1]=temp;
//
//        reverse1(i+1,arr,num);
//    }

    static void Reverse(int []arr,int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        Reverse(arr,start+1,end-1);

    }
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5};

        // Display the array before reversing
        System.out.println("Array before reversing:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Reverse the array
        Reverse(array, 0, array.length - 1);

        // Display the array after reversing
        System.out.println("Array after reversing:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

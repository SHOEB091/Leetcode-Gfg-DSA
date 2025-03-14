package SlidingWindow;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int low =0;
        int high = arr.length-1;
        int search = 70;
        while(low<high){
            int mid = low+(high-low)/2;
            if(search ==arr[mid]){
                System.out.println("Element found");
                return;
            }
            if(search>arr[mid]){
                low = mid+1;
            }
            else if(search<arr[mid]){
                high = mid-1;
            }
        }
        System.out.println("Element not Found ");
    }
}

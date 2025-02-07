package BinarySearch;

public class FindFloorOfElement {

    //FLOOR of an element is = Greatest element smaller than given element 

    public static int floorElement(int[]arr,int key ){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==key){
                return arr[mid];
            }
            else if(arr[mid]<key){
                result= arr[mid];
                start = mid+1;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int key = 5;
        System.out.println("Floor of " + key + " is: " + floorElement(arr, key));
    }
}

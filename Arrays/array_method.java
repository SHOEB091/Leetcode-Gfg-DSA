package Arrays;

public class array_method {

    static void show(int[]arr){
        arr[0]=100;
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // int arr[] = new int [3] // all are fill with 0
        // /{0,0,0}
        // int [] arr = {10,20,30};
        int [] arr = new int [] {10,20,30};
        show(arr);
    }

}

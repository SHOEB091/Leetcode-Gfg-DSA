package sorting;

public class selectionSort {
    public static void selection(int[]arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int mini = i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[mini]= arr[i];
            arr[i]=temp;
        }
    }
}

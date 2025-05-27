package sorting;

public class MergeSort {
    
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort(int[]arr , int start , int end){

        if(start>=end){
            return;
        }

        int mid = start+(end-start)/2;
        mergesort(arr, start, mid); //left part 
        mergesort(arr, mid+1, end); //right part 
        merge(arr,start,mid,end);
    }

    public static void merge(int []arr,int start , int mid ,int end ){
    int temp[] = new int[end-start+1];
    int i = start;
    int j = mid+1;
    int k = 0;

    while(i <= mid && j<= end){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
    }
    // if left residue
    while(i<=mid){
        temp[k++]=arr[i++];
    }
    //if right residue
    while(j <= end){
        temp[k++]=arr[j++];
    }

    //copy temp to original arr
    for(k=0,i=start;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
}

    public static void main(String args[]){
        int [] arr={6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);

    printArray(arr);
    }

}

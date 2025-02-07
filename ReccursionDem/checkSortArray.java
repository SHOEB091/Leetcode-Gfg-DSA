package ReccursionDem;
public class checkSortArray{
    
    static boolean checkSorted(int arr[],int index)
    {
        if(index==arr.length-1)
        {   
            return true;
        }
        if(arr[index]>arr[index+1])
        {
            return false;
        }
        return checkSorted(arr, index+1);
    } 


    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        System.out.println(checkSorted(arr, 0));
    }
}
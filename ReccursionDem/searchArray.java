package ReccursionDem;

public class searchArray {
    
    static boolean isFound(int []arr,int index, int search)
    {
        if(index==arr.length)
        {
            return false;
        }
        if(arr[index]==search)
        {
            return true;
        }
        return isFound(arr, index+1, search);
    }

    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        int index = 0;
        int search = 50;
        System.out.println(isFound(arr,index,search));
    }

}

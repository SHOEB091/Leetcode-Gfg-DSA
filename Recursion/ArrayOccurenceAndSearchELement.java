package Recursion;

public class ArrayOccurenceAndSearchELement {

    static int[] findAllHelper(int[]arr, int index , int search, int count)
    {
        //base case
        if(index==arr.length)
        {
            int result[] = new int[count];
            return result;
        }

        if(arr[index]==search)
        {
            count++;
        }

        //small problem + recursive call

        //stack building
        int [] result= findAllHelper(arr,index+1,search,count);

        //stack falling
        if(arr[index]==search)
        {
            result[count-1]=index;
        }

        return result;

    }
    static int[] findAll(int arr[],int index, int search){

        return findAllHelper(arr,index,search,0);
    }

    public static void main(String[] args) {
        int[]arr= {10,20,50,40,50,60};
        int index =0;
        int search= 50;
        int [] result = findAll(arr,index,search);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }


}

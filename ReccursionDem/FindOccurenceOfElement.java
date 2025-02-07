package ReccursionDem;

public class FindOccurenceOfElement {
    
    static int[] foundOccurence(int[]arr,int index,int search,int count)
    {
        if(index==arr.length)
        {
            int[]result = new int[count];
            return result;
        }
        if(arr[index]==search)
        {
            count++;
        }
        return foundOccurence(arr, index, 3,count);
        

    }
    static int[] foundElement(int[]arr,int index,int search)
    {
        return foundOccurence(arr, index, search, 0);
    }

    public static void main(String[] args) {
        int[]arr={10,20,50,40,50,60};
        int index=0;
        int search=50;
        int []result= foundElement(arr,index,search);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

}

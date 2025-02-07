package Binary_Search;

public class SearchInfiniteArray {
    public static int binarySearch(int[]arr,int start,int end,int target)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]<target) {
                start = mid + 1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //finding index in an infinite array
    public static int findIndex(int []arr,int target)
    {
        int start=0;
        int end=1;
        while(arr[end]<target)
        {
            start=end;
            end=2*end;
        }
        return binarySearch(arr,start,end,target);
    }
    public static void main(String []args)
    {
        int[]arr={3,5,7,9,10,90,100,130,140,160,170};

        int ans = findIndex(arr,130);
        System.out.println("Element Foud at index" + ans);
    }

}

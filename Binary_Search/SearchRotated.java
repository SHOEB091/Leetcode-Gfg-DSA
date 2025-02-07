package Binary_Search;

public class SearchRotated {

    public static int SearchRotatedSortedArray(int []arr,int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }

            //if left part is sorted
            if(arr[start]<=arr[mid])
            {
                if(arr[start]<=target && target<=arr[mid])
                {
                    //element exist
                    end=mid-1;
                }
                else {
                    //element does not exist
                    start=mid+1;
                }
            }

            //if right part is sorted
            else
            {
                if(arr[mid]<=target && target<=arr[end])
                {
                    start=mid+1;
                }
                else {
                    end= mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int target = 1;
        int result = SearchRotatedSortedArray(arr, target);
        if (result == -1) {
            System.out.println("Target is not present");
        } else {
            System.out.println("Target found at index : " + result);
        }

    }
}

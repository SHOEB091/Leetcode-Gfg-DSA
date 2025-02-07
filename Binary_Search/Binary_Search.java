package Binary_Search;

public class Binary_Search {

    public static void main(String[] args) {
    int []arr={2,4,7,8,12,36,78,92};
    int target = 12;
        System.out.println(BinarySearch(arr,target));
    }

    public static int BinarySearch(int []arr, int target )
    {
        int start =0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = ((start+end)/2);
            if(target<arr[mid])
            {
                end = mid -1;
            }
            if(target>arr[mid])
            {
                start = mid +1;
            }
            if(target == arr[mid])
            {
                return mid;
            }
        }
        return -1;
    }

}
package Binary_Search;

public class MountainArray {

    public static void main(String[] args) {

        int [] arr={2,4,7,9,16,36,27,9,3};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }
    public static int peakIndexInMountainArray(int[] arr)
    {
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }
            else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start;
    }
}

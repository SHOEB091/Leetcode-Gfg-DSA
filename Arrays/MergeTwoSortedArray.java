package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    
    public static int[] mergeArray(int[]arr1,int[] arr2){

        int newArr [] = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;


        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                newArr[k++] = arr1[i++];
            }
            else{
                newArr[k++]=arr2[j++];
            }

        }

        while(i<arr1.length){
            newArr[k++]=arr1[i++];
        }

        while(j<arr2.length){
            newArr[k++]=arr2[j++];
        }

                



        return newArr;
    }

    //Optimal Approach 1 without using extra space 

    public static void merge(long[] arr1, long[] arr2, int n, int m) {

        // Declare 2 pointers:
        int left = n - 1;
        int right = 0;

        // Swap the elements until arr1[left] is
        // smaller than arr2[right]:
        while (left >= 0 && right < m) {
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        // Sort arr1[] and arr2[] individually:
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    //Optimal Approach 2 without using nay extra space 
    // this approach use gap method the gap method is based on sorting technique called shell sort.
    // Similar to optimal approach 1, in this approach, we will use two pointers i.e. left and right, and swap the elements if the element at the left pointer is greater than the element at the right pointer. 
    // But the placing of the pointers will be based on the gap value calculated. The formula to calculate the initial gap is the following:
    // Initial gap = ceil((size of arr1[] + size of arr2[]) / 2)

    public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    public static void merge2(long[] arr1, long[] arr2, int n, int m) {

        // len of the imaginary single array:
        int len = n + m;

        // Initial gap:
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            // Place 2 pointers:
            int left = 0;
            int right = left + gap;
            while (right < len) {
                // case 1: left in arr1[]
                //and right in arr2[]:
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                // case 2: both pointers in arr2[]:
                else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                // case 3: both pointers in arr1[]:
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++; right++;
            }
            // break if iteration gap=1 is completed:
            if (gap == 1) break;

            // Otherwise, calculate new gap:
            gap = (gap / 2) + (gap % 2);
        }
    }



























    public static void main(String[] args) {
        int [] arr1 = {1,4,6,9,15};
        int[] arr2 = { 2,5,8,10};
        int [] result = mergeArray(arr1, arr2);
        
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

}

package Arrays;

public class SortColors{
    /*
     arr = {0,1,1,0,1,2,1,2,0,0,0,1}
        [0---- low-1] are zeroes 
        [high +1 --- n ] are two 

        0 a[low] , a[mid]
          low++    mid++
        
        1 mid++

        2 a[mid] , a[high]
           high --
     */

     public static void sortColors(int[] nums){
        int n = nums.length;

        int i = 0;   // denotes for 0
        int j = 0;   // denotes for 1
        int k = n - 1; // denotes for 2

        while (j <= k) {
            if (nums[j] == 1) {
                j++;
            } else if (nums[j] == 2) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            } else { // nums[j] == 0
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j++;
            }
        }

        }
    }

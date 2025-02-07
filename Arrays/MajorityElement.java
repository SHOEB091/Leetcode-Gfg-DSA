package Arrays;

public class MajorityElement {

    /* 
    //Approach1
    public static int majorityElement(int []v) {
        //size of the given array:
        int n = v.length;

        for (int i = 0; i < n; i++) {
            //selected element is v[i]
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                // counting the frequency of v[i]
                if (v[j] == v[i]) {
                    cnt++;
                }
            }

            // check if frquency is greater than n/2:
            if (cnt > (n / 2))
                return v[i];
        }

        return -1;
    }
    */
    
    /*
     * Approach 2

    public int majorityElement(int[] nums) {
        int n = nums.length;

        // Base case: If there's only one element, it's the majority element
        if (n == 1) {
            return nums[0];
        }

        // Create a HashMap to count occurrences of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the element with frequency > n/2
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }

        // Return -1 if no majority element is found (though the problem assumes there is one)
        return -1;
    }
     */


     //Boyer Moores algorithm 
     
     //nums = [2,2,1,1,1,2,2]  , n=7;
    //Assume first one is camdidate element
    public static int BoyerMooreAlgorithm(int[]arr){
        int candidate = arr[0];
        int count =1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }
            else if(count==0){
                candidate = arr[i];
                count=1;
            }
            else{
                count--;
            }
            
        }

        //verification 
        count =0;
        for(int nums : arr){
            if(nums==candidate){
                count++;
            }
        }
        return candidate;
    }
}

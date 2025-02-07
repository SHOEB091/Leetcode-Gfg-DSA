package Arrays;

public class RearangeSignFollowUp {


    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0; // Pointer for positive numbers
        int negIndex = 1; // Pointer for negative numbers

        // Traverse through the nums array
        for (int num : nums) {
            if (num > 0 && posIndex < nums.length) {
                // Place positive number at the current posIndex
                result[posIndex] = num;
                posIndex += 2; // Move to the next even index
            } else if (num < 0 && negIndex < nums.length) {
                // Place negative number at the current negIndex
                result[negIndex] = num;
                negIndex += 2; // Move to the next odd index
            }
        }

        // If there are leftover positive or negative numbers, fill them in
        for (int num : nums) {
            if (posIndex < nums.length && num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else if (negIndex < nums.length && num < 0) {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }


}

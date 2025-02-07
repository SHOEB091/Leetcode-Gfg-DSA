package Binary_Search2dArray;

public class SearchTwoDimensional {

    public static int[] searching(int[][]arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [][]arr= {
                {13, 17, 43, 76},
                {18, 14, 9, 21},
                {1, 7, 6, 45},
                {9, 65, 80, 33}
        };
        int target = 9;
        int[] result = searching(arr, target);

        if (result != null) {
            System.out.println("Element " + target + " found at index (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

}

package Binary_Search2dArray;

public class SpiralMatrix {

    public static int spiral(int[][]arr)
    {
        int n=arr.length;//no. of rows
        int m =arr[0].length;//no.columns;

        //initialize the pointers required for traversal
        int top=0, left=0,bottom=n-1,right=m-1;

        while(top <= bottom && left <=right)
        {
            //moving left to right
            for(int i=left;i<=right;i++)
            {
                System.out.print(arr[top][i]+"  ");

            }
            top++;

            //for moving top to bottom;
            for(int i= top;i<=bottom;i++)
            {
                System.out.print(arr[i][right]+"  ");
            }
            right--;
            if(top<=bottom) {


                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            //for moving right to left .
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        //Matrix initialization.
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int ans = spiral(arr);

        for(int i = 0;i<=ans; i++){
            System.out.print(i);
        }

        System.out.print("");
    }

}


    /*int arr[] = {1,2,3,4,
                5,6,7,8,
                10,11,12,13};*/
        //Approach
        // TOP = first row is constant and column change we print first row 
        //when top printed then we shift top to one step down now 

        // RIGHT = now we print right column here constant is right column now we shift the column that is RIGHT to one left side  right--

        // DOWN = down is constant then we have to print the constant down row
        
        //LEFT = left column is constant print that constant column and make left one ahead  left++

        //now repeat the whoe process 
        //basically in this we have to move in four directions

        package Arrays;

        import java.util.ArrayList;
        
        public class SpiralMatrix {
        
            public static ArrayList<Integer> spiral(int[][] arr) {
                int m = arr.length; // rows
                int n = arr[0].length; // columns
        
                ArrayList<Integer> list = new ArrayList<>();
                int top = 0;
                int down = m - 1;
                int left = 0;
                int right = n - 1;
                int dir = 0;
        
                /*
                 * dir = 0 : left to right
                 * dir = 1 : top to down
                 * dir = 2 : right to left
                 * dir = 3 : down to top
                 */
                while (top <= down && left <= right) {
                    if (dir == 0) {
                        // left to right
                        // constant: row(top)
                        for (int i = left; i <= right; i++) {
                            list.add(arr[top][i]); // top is fixed, only column changes
                        }
                        top++;
                    } else if (dir == 1) {
                        // top to down
                        // constant: column(right)
                        for (int i = top; i <= down; i++) {
                            list.add(arr[i][right]); // right is fixed, only row changes
                        }
                        right--;
                    } else if (dir == 2) {
                        // right to left
                        // constant: row(down)
                        for (int i = right; i >= left; i--) {
                            list.add(arr[down][i]); // down is fixed, only column changes
                        }
                        down--;
                    } else if (dir == 3) {
                        // down to top
                        // constant: column(left)
                        for (int i = down; i >= top; i--) {
                            list.add(arr[i][left]); // left is fixed, only row changes
                        }
                        left++;
                    }
                    dir = (dir + 1) % 4;
                }
                return list;
            }
        
            public static void main(String[] args) {
                int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
                };
        
                ArrayList<Integer> result = spiral(matrix);
                System.out.println(result); // Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
            }
        }

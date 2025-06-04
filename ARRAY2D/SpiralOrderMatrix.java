package ARRAY2D;

import java.util.*;

class SpiralOrderMatrixx {
    public List<Integer> spiralOrder(int[][] arr) {
         List<Integer> ans = new ArrayList<>();
        
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
}
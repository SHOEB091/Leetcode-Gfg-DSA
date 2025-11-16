package SlidingWindow;

import java.util.List;

/*
    Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example



Lily wants to find segments summing to Ron's birth day,  with a length equalling his birth month, . In this case, there are two segments meeting her criteria:  and .

Function Description

Complete the birthday function in the editor below.

birthday has the following parameter(s):

int s[n]: the numbers on each of the squares of chocolate
int d: Ron's birth day
int m: Ron's birth month
Returns

int: the number of ways the bar can be divided

 */

public class ChocolateBar {



    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
        int n = s.size();
    

    // 1) Convert List<Integer> -> int[]
     int[] arr = new int[n];
     for (int i = 0; i < n; i++) {
        arr[i] = s.get(i);
     }
     int count =0;
     for(int i=0;i<=n-m;i++){
        int sum = 0;
        for(int j=i;j<i+m;j++){
            sum+=s.get(j);
        }
            if(sum == d){
                count++;
            }
     }
     return count;
     
     
    }
}

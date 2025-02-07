package Arrays;
import java.util.*;

/* You have n jobs and m workers. You are given three arrays: difficulty, profit, and worker where:

difficulty[i] and profit[i] are the difficulty and the profit of the ith job, and
worker[j] is the ability of jth worker (i.e., the jth worker can only complete a job with difficulty at most worker[j]).
Every worker can be assigned at most one job, but one job can be completed multiple times.

For example, if three workers attempt the same job that pays $1, then the total profit will be $3. If a worker cannot complete any job, their profit is $0.
Return the maximum profit we can achieve after assigning the workers to the jobs.

 

Example 1:

Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
Output: 100
Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get a profit of [20,20,30,30] separately.
Example 2:

Input: difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]
Output: 0
 

Constraints:

n == difficulty.length
n == profit.length
m == worker.length
1 <= n, m <= 104
1 <= difficulty[i], profit[i], worker[i] <= 105*/

public class MaxProfitAssignment {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }

        // Sort jobs by difficulty
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        // Sort worker array
        Arrays.sort(worker);

        int maxProfit = 0;
        int bestProfit = 0;
        int j = 0;

        // Iterate over each worker
        for (int ability : worker) {
            // Update the best job the worker can do
            while (j < n && jobs[j][0] <= ability) {
                bestProfit = Math.max(bestProfit, jobs[j][1]);
                j++;
            }
            // Add the best profit for this worker
            maxProfit += bestProfit;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfitAssignment solution = new MaxProfitAssignment();

        int[] difficulty = {2, 4, 6, 8, 10};
        int[] profit = {10, 20, 30, 40, 50};
        int[] worker = {4, 5, 6, 7};

        int result = solution.maxProfitAssignment(difficulty, profit, worker);
        System.out.println(result);  // Output: 100
    }
}

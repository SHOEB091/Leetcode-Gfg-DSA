package Arrays;

public class BestTimeToBuySellStock {
      
    // int arr[] = [7,1,5,3,6,4]  n=6;
    // before selling the stock you have to buy it first 
    // to sell 4 the minimum we have to buy is 1 
    //same for 6 as well 

    public int maxProfit(int[] prices) {
        int mini = prices[0]; // Initialize the minimum price
        int maxProfit = 0; // Initialize maximum profit

        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i] - mini; // Calculate the current cost
            maxProfit = Math.max(maxProfit, cost); // Update the maximum profit
            mini = Math.min(mini, prices[i]); // Update the minimum price
        }
        return maxProfit; // Return the maximum profit
    }

}

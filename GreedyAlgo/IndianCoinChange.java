package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoinChange {
    // We are given an Infinite supply of denominations[1,2,5,10,20,50,100,500,2000].
    // Find min no. of coins/notes to make change for a value V.
    // V=121
    // ans=3(100+20+1)
    
    // V=590
    // ans=4(500+50+20+20)
    // Currency system is Canonical so greedy can be used

    //Steps 
    //Sort in Descending Order

    public static void minCoin(Integer[] coins, int amount) {
    
        // Sort coins in descending order
        Arrays.sort(coins, Comparator.reverseOrder());
        
        int countOfCoins=0;
        ArrayList<Integer>ans= new ArrayList<>();


        // iterate from largest to smallest
        for (int i= 0;i<coins.length;i++) {
           if(coins[i]<=amount){

               // take as many of this coin as possible
               while (coins[i]<=amount) {
                     amount -= coins[i];
                     countOfCoins++;
                     ans.add(coins[i]);
               }
           }

        }
        System.out.println("Minimum number of coins/notes required: "+countOfCoins);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    public static void main(String[] args) {
       // Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Integer coins[] = {2000,500,100,50,20,10,5,2,1};
        int amount = 590;

        minCoin(coins, amount);
    }


}

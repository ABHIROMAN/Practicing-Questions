package LeetCode.Arrays;

public class bestTimeToBuySellStock121 {

    // Brute Force Approach - O(n^2)
//    public int maxProfit(int[] prices) {
//
//        int maxProfit = 0;
//        for(int i = 0; i < prices.length; i++) {
//            for(int j = i + 1; j < prices.length; j++) {
//
//                int profit = prices[j] - prices[i];
//
//                if(profit > maxProfit) {
//
//                    maxProfit = profit;
//                }
//            }
//        }
//        return maxProfit;
//    }

    //Optimised Solution - O(n)

    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if(prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}

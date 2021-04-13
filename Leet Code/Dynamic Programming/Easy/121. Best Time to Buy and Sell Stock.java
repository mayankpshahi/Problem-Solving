//121. Best Time to Buy and Sell Stock

////Linear DP
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0,min=prices[0];
        for(int i = 1;i<prices.length;i++){
                min =  Math.min(min,prices[i]);
                profit =  Math.max(profit,prices[i]-min);
            
        }
        
        
        return profit;
    }
}
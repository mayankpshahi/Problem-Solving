//714. Best Time to Buy and Sell Stock with Transaction Fee

class Solution {
    public int maxProfit(int[] prices, int fee) {
         int lastbuy= -prices[0];
         int profit = 0;
        
        for(int i=1;i<prices.length;i++){
            lastbuy=Math.max(lastbuy,profit-prices[i]);
            profit=Math.max(profit,lastbuy+prices[i]-fee);}
        return Math.max(lastbuy,profit);
    }
}
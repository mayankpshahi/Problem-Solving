

//Best Time to Buy and Sell Stocks I


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> prices) {
        if(prices.size()==0) return 0;
         int min = prices.get(0);
        int profit = 0;
        for(int i = 1;i<prices.size();i++){
            min = Math.min(min,prices.get(i));
            profit =  Math.max(profit,prices.get(i)-min);
        }
        
        return profit;
    }
}

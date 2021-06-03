



//Best Time to Buy and Sell Stocks II


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> prices) {
          
        int profit=0;         
             for(int i=1;i<prices.size();i++){             
                  profit+=Math.max(0,prices.get(i)-prices.get(i-1));         
             }        
             return profit;    
    }
}

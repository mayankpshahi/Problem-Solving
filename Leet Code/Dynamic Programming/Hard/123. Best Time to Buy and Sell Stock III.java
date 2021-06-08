


//123. Best Time to Buy and Sell Stock III



class Solution {
    public int maxProfit(int[] prices) {
        
         int n = prices.length;
        if(n < 2){
            return 0;
        }

        int[] left = new int[n];        
        int[] right = new int[n];      

        
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - min);
        }

       
        int max = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max = Math.max(max, prices[i]);
            right[i] = Math.max(right[i + 1], max - prices[i]);
        }

        int profit = 0;
        for (int i = 0; i < n; i++) {
            profit = Math.max(profit, left[i] + right[i]);
        }
        
        return profit;
        
    }
}





//Other Solution




class Solution {
    public int maxProfit(int[] prices) {
        // profits after each of the events
        int buy1  = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2  = Integer.MIN_VALUE;
        int sell2 = 0;
        
        for(int price: prices){
            buy1  = Math.max(buy1, -price); 
            sell1 = Math.max(sell1, buy1 + price); 
            buy2  = Math.max(buy2, sell1 - price);
            sell2 = Math.max(sell2, buy2 + price); 
        }
        
        return sell2;
    }
}
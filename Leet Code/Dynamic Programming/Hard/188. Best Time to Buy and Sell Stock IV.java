



//188. Best Time to Buy and Sell Stock IV



class Solution {
    public int maxProfit(int k, int[] prices) {
        int len  =   prices.length;
        
        if(len<=1 || k<=0) return 0;
        
        int profit = 0;
        if(k>=len/2){
            for(int i=0;i<len-1;i++){
                if(prices[i]<prices[i+1])
                profit+=prices[i+1] - prices[i];
            }
            
            return profit;
        }
        
        int []buy =  new int[k];
        Arrays.fill(buy,Integer.MIN_VALUE);
        int []sell =  new int[k];
        
        for(int i=0;i<len;i++){
             for(int j=0;j<k;j++){
                 buy[j] = Math.max(buy[j],j==0?0-prices[i]:sell[j-1]-prices[i]);
                  sell[j] = Math.max(sell[j],buy[j]+prices[i]);
             }
        }
        
        return sell[k-1];
        
    }
}
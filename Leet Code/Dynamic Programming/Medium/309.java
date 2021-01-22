//309. Best Time to Buy and Sell Stock with Cooldown


class Solution {
    public int maxProfit(int[] prices) {
      if(prices.length<=1) return 0;
        
        int s1=0,s2= - prices[0],s3=0;
        for(int i=1;i<prices.length;i++){
            int tmp = s1;
            s1 = Math.max(tmp,s3);
            s3= s2+prices[i];
            s2 = Math.max(s2,tmp-prices[i]);
            
        }
        
        
        return Math.max(s1,s3);
        
    }
}
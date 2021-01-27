//322. Coin Change



class Solution {
    public int coinChange(int[] coins, int amount) {
     int n =  coins.length;
     int mincoins[][] = new int[n+1][amount+1];
        
     for(int i=0;i<=n;i++){
         for(int j=0;j<=amount; j++){
             if(j==0)
                 mincoins[i][j] = 0;
             else if(i==0)
                 mincoins[i][j] = 100000;
             else if(coins[i-1]>j)
                 mincoins[i][j] = mincoins[i-1][j];
             else
                 mincoins[i][j] = Math.min(mincoins[i-1][j], mincoins[i][j-coins[i-1]] + 1);
         }
     }
        
    return mincoins[n][amount]>10000?-1:mincoins[n][amount];
    }
}
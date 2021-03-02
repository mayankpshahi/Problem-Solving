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

//Another solution.
class Solution {
    public int coinChange(int[] coins, int amount) {
     int M =  coins.length;
     int V = amount;
     int t[][] =  new int[M+1][V+1];
         int i=0,j=0;
        for(j=0;j<V+1;j++)
          t[i][j]=Integer.MAX_VALUE -1;
          
        j=0;
        for(i=1;i<M+1;i++)
          t[i][j]=0;
          
        i=1;
         for(j=1;j<V+1;j++){
             if(j%coins[0]==0)
              t[i][j] = j/coins[0];
             else
              t[i][j]=Integer.MAX_VALUE -1;
         }
          
         
        i=0;j=0;
        for(i=2;i<M+1;i++){
            for(j=1;j<V+1;j++){
                if(coins[i-1]<=j)
                 t[i][j] = Math.min(1+t[i][j-coins[i-1]] , t[i-1][j]);
                else
                  t[i][j]=t[i-1][j];
            }
        }
         
        return t[M][V]!=Integer.MAX_VALUE-1?t[M][V]:-1 ;
    }
}
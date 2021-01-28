//650. 2 Keys Keyboard



class Solution {
    public int minSteps(int n) {
        
        if(n==1) return 0;
        else if(n==2) return 2;
        
        int dp [] =  new int[n+1];
        
        dp[1] = 0; dp[2] = 2;
        
        for(int i=3;i<=n;i++){
          dp[i] = i;
          int j= i/2;
          while(j>=1){
              if(i%j==0){
                  dp[i]= Math.min(dp[i],dp[j]+(i/j));
                  break;
              }  
            j--;
          }
        }
        
        return dp[n];
    }
}


//Prime Factorization

class Solution {
    public int minSteps(int n) {
        int ans = 0, d = 2;
        while (n > 1) {
            while (n % d == 0) {
                ans += d;
                n /= d;
            }
            d++;
        }
        return ans;
    }
}
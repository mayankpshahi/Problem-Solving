



//62. Unique Paths


class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp = new int[n][m];
        
        return find(m-1,n-1);
        
    }
    private int find(int m, int n){
    if (m < 0 || n < 0) return 0;
    else if (m == 0 || n == 0) return 1;
    else if(dp[n][m]>0) return dp[n][m];
    else {
      dp[n][m] = find(m - 1, n) + find(m, n - 1);
      return dp[n][m];
    }
        
    }
}
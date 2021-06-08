


//1411. Number of Ways to Paint N × 3 Grid


class Solution {
    public int numOfWays(int n) {
        int[][][][] dp = new int[n+1][4][4][4]; 
        return dfs(n, 0, 0, 0, dp);
    }
   
    int dfs(int n, int p, int q, int r, int[][][][] dp) {
        if (n == 0) return 1;
        if (dp[n][p][q][r] != 0) return dp[n][p][q][r];
        
        int res = 0;
        
        int[] colors = new int[]{1, 2, 3}; 
        for (int a : colors) {
            if (a == p) continue; 
            
            for (int b : colors) {
                if (b == q || b == a) continue; 
                
                for (int c : colors) {
                    if (c == r || c == b) continue; 
                    
                    res += dfs(n - 1, a, b, c, dp);
                    res %= 1000000007;
                }
            }
        }
        return dp[n][p][q][r] = res;
        
    }
}





//Best Solution

class Solution {
    private long mod = 1000000007;
    public int numOfWays(int n) {
        if (n == 0) return 0;

        long twoColors = 6;
        long threeColors = 6;

        while (--n > 0) {
            long nextTwoColors = (3 * twoColors + 2 * threeColors) % mod;
            threeColors = (2 * twoColors + 2 * threeColors) % mod;
            twoColors = nextTwoColors;
        }

        return (int)((twoColors + threeColors) % mod);
    }
   

}
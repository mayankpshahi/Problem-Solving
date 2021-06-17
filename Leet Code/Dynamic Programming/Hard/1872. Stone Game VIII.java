


//1872. Stone Game VIII


//Recursive TLE



class Solution {
    private int solve(int idx, int turn, int[] prefix) {
        int curScore = prefix[idx];
        
        if(idx == prefix.length - 1) 
            return turn == 0 ? curScore : -curScore;
        
        if(turn % 2 == 0) 
            return Math.max(solve(idx + 1, turn, prefix), curScore + solve(idx + 1, turn ^ 1, prefix));
        else
            return Math.min(solve(idx + 1, turn, prefix), -curScore + solve(idx + 1, turn ^ 1, prefix));
                        }
    public int stoneGameVIII(int[] stones) {
         int n = stones.length;
        for(int i = 1; i < n; i++)
            stones[i] += stones[i - 1];
        
        return solve(1, 0, stones);
    }
}



//Memoization



class Solution {
    int t[][];
    private int solve(int idx, int turn, int[] prefix) {
        
        if(t[idx][turn] != 0)
            return t[idx][turn];
        int curScore = prefix[idx];
        
        if(idx == prefix.length - 1) 
            return turn == 0 ? curScore : -curScore;
        
        if(turn % 2 == 0) 
            return t[idx][turn] =Math.max(solve(idx + 1, turn, prefix), curScore + solve(idx + 1, turn ^ 1, prefix));
        else
            return t[idx][turn] =Math.min(solve(idx + 1, turn, prefix), -curScore + solve(idx + 1, turn ^ 1, prefix));
                        }
    public int stoneGameVIII(int[] stones) {
         int n = stones.length;
        for(int i = 1; i < n; i++)
            stones[i] += stones[i - 1];
        
        t = new int[n][2];
        
        return solve(1, 0, stones);
    }
}



//Bottom Up


class Solution {
    
    public int stoneGameVIII(int[] stones) {
		// find the sum first
        int[] sum = new int[stones.length];
        sum[0] = stones[0];
        for (int i = 1; i < stones.length; i++) {
            sum[i] = sum[i - 1] + stones[i];
        }
		// apply dp
        int[] dp = new int[stones.length];
        dp[stones.length - 1] = sum[stones.length - 1];
        for (int i = stones.length - 2; i >= 0; i--) {
            dp[i] = Math.max(sum[i] - dp[i + 1], dp[i + 1]);
        }
		// alice cannot take only one stone, so it has to be starting from dp[1], not dp[0].
        return dp[1];
    }
}
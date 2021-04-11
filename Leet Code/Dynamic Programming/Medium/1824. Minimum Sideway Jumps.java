
//1824. Minimum Sideway Jumps


class Solution {
    public int minSideJumps(int[] obstacles) {
        
        int dp[] = new int[]{1,0,1};
        
        for (int a: obstacles) {
            if (a > 0)
                dp[a - 1] = 1000000;
            for (int i = 0; i < 3; ++i)
                if (a != i + 1)
                    dp[i] = Math.min(dp[i], Math.min(dp[(i + 1) % 3], dp[(i + 2) % 3]) + 1);
        }
        return  Math.min(dp[0],Math.min(dp[1], dp[2]));  
        
    }
}
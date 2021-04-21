



// Recursive Solution





class Solution {
    public int numSquares(int n) {
       if(n < 4) return n;
        int count = n;
        for(int i = 1; i* i <= n; i++) {
            count = Math.min(count, numSquares(n - i * i) + 1);
        }
        return count;
    }
}


//Memoization

class Solution {
    
    Map<Integer, Integer> map = new HashMap();
    public int numSquares(int n) {
       if(n < 4) return n;
        
          if (map.containsKey(n))
            return map.get(n);
        
        int count = n;
        for(int i = 1; i* i <= n; i++) {
            count = Math.min(count, numSquares(n - i * i) + 1);
        }
         map.put(n, count);
        return map.get(n);
    }
}


//Pure DP

class Solution {
    public int numSquares(int n) {
        if(n < 4) return n;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; dp[1] = 1; dp[2] = 2; dp[3] = 3;
        
        for(int i = 4; i <= n; i++) 
            for(int j = 1; j * j <= i; j++)
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
        
        return dp[n];
    }
}
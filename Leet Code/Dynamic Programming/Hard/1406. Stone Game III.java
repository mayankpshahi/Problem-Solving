



//1406. Stone Game III

//Memoization
class Solution {
    int t[];
    public String stoneGameIII(int[] stoneValue) {
        t =  new int[stoneValue.length + 1];
        int alice = solve(stoneValue,0);
        if(alice>0) return "Alice";
        else if(alice==0) return "Tie";
        else return "Bob";
        
    }
    private int solve(int[]s ,int i){
        if(i>=s.length)return 0;
        else if(t[i]!=0) return t[i];
        else{
            int res =  Integer.MIN_VALUE;
            res = Math.max(res,s[i]-solve(s,i+1));
            if(i+1<s.length)res = Math.max(res,s[i]+s[i+1]-solve(s,i+2));
             if(i+2<s.length)res = Math.max(res,s[i]+s[i+1]+s[i+2]-solve(s,i+3));
             return t[i]=res;
        }
    }
}



//Top Down


public String stoneGameIII(int[] A) {
    int n = A.length, dp[] = new int[n+1];
    for (int i = n - 1; i >= 0; --i) {
        dp[i] = Integer.MIN_VALUE;
        for (int k = 0, take = 0; k < 3 && i + k < n; ++k) {
            take += A[i + k];
            dp[i] = Math.max(dp[i], take - dp[i + k + 1]);
        }
    }
    if (dp[0] > 0) return "Alice";
    if (dp[0] < 0) return "Bob";
    return "Tie";
}




//O(1) space


public String stoneGameIII(int[] A) {
    int n = A.length, dp[] = new int[4];
    for (int i = n - 1; i >= 0; --i) {
        dp[i % 4] = Integer.MIN_VALUE;
        for (int k = 0, take = 0; k < 3 && i + k < n; ++k) {
            take += A[i + k];
            dp[i % 4] = Math.max(dp[i % 4], take - dp[(i + k + 1) % 4]);
        }
    }
    if (dp[0] > 0) return "Alice";
    if (dp[0] < 0) return "Bob";
    return "Tie";
}
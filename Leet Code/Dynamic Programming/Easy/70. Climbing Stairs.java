
//70. Climbing Stairs
//Linear DP


//Recursive Solution
class Solution {
    
  
    private int solve(int i,int n){
       if(i>n) return 0;
        
        if (i == n) {
            return 1;
        }
        
     int ways = solve(i+1,n) + solve(i+2,n);
    
      return ways;
    }
    public int climbStairs(int n) {
      if(n<=1) return 1;
        
     return solve(0,n);
       
     
      
    
    }
}



//Memoization

class Solution {
    
   int t[] = new int[46];
    private int solve(int i,int n){
       if(i>n) return 0;
        
        if (i == n) {
            return 1;
        }
        
        if(t[i]!=0) return t[i];
        
     t[i] =  solve(i+1,n) + solve(i+2,n);
    
      return t[i];
    }
    public int climbStairs(int n) {
      if(n<=1) return 1;
        
     return solve(0,n);
       
     
      
    
    }
}

//Pure Dp without recursion

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

//More optimization since it is similar  to fibonacci function

public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
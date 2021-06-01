

//70. Climbing Stairs


public class Solution {
     int t[] = new int[46];
    public int climbStairs(int n) {
        if(n<=1) return 1;
        
     return solve(0,n);
       
    }
    
    private int solve(int i,int n){
       if(i>n) return 0;
        
        if (i == n) {
            return 1;
        }
        
        if(t[i]!=0) return t[i];
        
     t[i] =  solve(i+1,n) + solve(i+2,n);
    
      return t[i];
    }
}

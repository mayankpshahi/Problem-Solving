


//Intersecting Chords in a Circle



//Memoization


public class Solution {
    int t [] =  new int[2001];
    int mod  = 1000000007;
    public int chordCnt(int n) {
        
        if(n==1 || n==2) return n;
        int res = 0;
        if(t[n]!=0) return t[n];
        
        for(int i=0;i<n-2;i++){
            res = chordCnt(i)* chordCnt(n-2-i);
        }
        res%=1000000007;
        
        return t[n]=res;
    }
}


public class Solution {
   
    public int chordCnt(int A) {
        
        long [] dp = new long[A+1];
        
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=A;i++){
            
            for(int k=0;k<i;k++){
                dp[i]=(dp[i]+dp[k]*dp[i-1-k])%1000000007;
            }
        }
        
        return (int)dp[A];
    }
}


//catalan No.


int Solution::chordCnt(int n) {
    
    vector<long int> dp(n+1,0);
    dp[0]=1;
    dp[1]=1;
    for(int i=2;i<=n;i++)
    {
        for(int x=0,y=i-1;x<i;x++,y--)
        {
            dp[i]=(dp[i] + (dp[x]*dp[y]))%1000000007;
        }
    }
    return dp[n]%1000000007;
}
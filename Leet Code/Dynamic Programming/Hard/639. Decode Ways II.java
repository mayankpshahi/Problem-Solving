




//639. Decode Ways II


class Solution {
    public int numDecodings(String s) {
         long dp[]=new long[s.length()+1];
        Arrays.fill(dp,-1);
        return (int)((helper(s,s.length(),dp)%1000000007));
        
    }
     long helper(String s,int i,long dp[])
    {
        if(i==0)
            return 1;
        long one=0;
        if(dp[i]!=-1)
            return dp[i];
        if(i-1>=0 && s.charAt(i-1)!='0')
        {
            one=helper(s,i-1,dp);
            if(s.charAt(i-1)=='*')
                one=one*9;
        }
        long two=0;
        if(i-2>=0)
        {
            if((s.charAt(i-2)=='1' || (s.charAt(i-2)=='2' && s.charAt(i-1)<'7')) && s.charAt(i-1)!='*')
                two=helper(s,i-2,dp);
            else if(s.charAt(i-2)=='*')
            {
                if(s.charAt(i-1)<'7' && s.charAt(i-1)!='*')
                    two=2*helper(s,i-2,dp);
                else if(s.charAt(i-1)!='*')
                    two=helper(s,i-2,dp);
                else
                    two=15*helper(s,i-2,dp);
            }
            else if(s.charAt(i-1)=='*')
            {
                if(s.charAt(i-2)=='1')
                    two=9*helper(s,i-2,dp);
                else if(s.charAt(i-2)=='2')
                    two=6*helper(s,i-2,dp);
            }
        }
        return dp[i]=(one+two)%1000000007;
    }
}
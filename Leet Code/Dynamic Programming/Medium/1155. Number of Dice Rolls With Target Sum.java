


//1155. Number of Dice Rolls With Target Sum



class Solution {
    private int dp[][]=new int[32][1002];
    int mod=(int)(Math.pow(10,9))+7;
    public int numRollsToTarget(int d, int f, int target) {
        
        for(int arr[]:dp)Arrays.fill(arr,-1);
        
        return helper(d,f,target);
        
    }
    private int helper(int d,int f,int target){

        if(d==0 && target==0){
            return 1;
        }
		
        if(target<0 || d==0){
            return 0;
        }
        if(dp[d][target]!=-1){
            return dp[d][target];
        }
        int ans=0;
        for(int i=1;i<=f;i++){
            ans=(ans%mod+helper(d-1,f,target-i)%mod)%mod;
        }
        return dp[d][target]= ans;
        
        
    }
}
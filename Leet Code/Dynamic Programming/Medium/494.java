
//494. Target Sum


class Solution {
    
    
    public int findTargetSumWays(int[] nums, int S) {
       int sum=0;
	    for(int i=0;i<nums.length;i++)
	      sum+=nums[i];
        
          if(sum<S || (S+sum)%2 !=0){
            return 0;
        }
        
        sum = (S+sum)/2;
        
        int tsum[]=new int[sum+1];
       
        tsum[0]=1;
        
        for(int i=0;i<nums.length;i++){
            
            for(int j=sum;j>=nums[i];j--){
                
                tsum[j]=tsum[j]+tsum[j-nums[i]];
            }
        }
        return tsum[sum];
    }
}
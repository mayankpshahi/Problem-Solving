





//416. Partition Equal Subset Sum


class Solution {
    private boolean isSubsetSum(int sum, int arr[], int n) 
    {   boolean t[][] =  new boolean[n+1][sum+1];
         int i=0,j=0;
        for(j=1;j<sum+1;j++)
          t[i][j]=false;
          
        j=0;
        for(i=0;i<n+1;i++)
          t[i][j]=true;
         
        i=0;j=0;
        for(i=1;i<n+1;i++){
            for(j=1;j<sum+1;j++){
                if(arr[i-1]<=j)
                 t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                else
                  t[i][j]=t[i-1][j];
            }
        }
         
        return t[n][sum];  
        
    }

    public boolean canPartition(int[] nums) {
        int n = nums.length;
          int sum = 0;
        for(int i=0;i<n;i++) sum+=nums[i];
        
        if(sum%2!=0) return false;
        else 
        return isSubsetSum(sum/2,nums,n);

        
    }
}
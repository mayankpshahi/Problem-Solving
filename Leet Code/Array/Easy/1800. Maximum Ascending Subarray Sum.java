

//1800. Maximum Ascending Subarray Sum


class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = Integer.MIN_VALUE, curr=nums[0];
        
       for(int i=1;i<nums.length;i++){
           if(nums[i]<=nums[i-1]){
               max = Math.max(max,curr);
               curr=0;
           }
           curr+=nums[i];
       }
        
        return Math.max(max,curr);
        
    }
}
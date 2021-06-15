

//Max Product Subarray



public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProduct(final int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int max = nums[0],min = nums[0], res =  nums[0];
        
        for(int i=1;i<nums.length;i++){
            int temp = max;
            max =  Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            min =  Math.min(Math.min(temp*nums[i],min*nums[i]),nums[i]); 
            
            res =   Math.max(res,max);
        }
        
        
        return res;
    }
}

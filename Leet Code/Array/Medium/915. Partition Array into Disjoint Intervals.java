


//915. Partition Array into Disjoint Intervals



class Solution {
    public int partitionDisjoint(int[] nums) {
        
       int curr = nums[0];
       int next  =  nums[0];
        
        int res = 0;
        
        for(int i=0;i<nums.length;i++){
            next =  Math.max(next,nums[i]);
            if(nums[i]<curr){
                res = i;
                curr=next;
            }
        }
        
        return res+1;
        
        
    }
}
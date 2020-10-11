class Solution {
    public int[] runningSum(int[] nums) {
        int [] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        if(nums.length>1){
        for(int i = 1; i<nums.length;i++){
            runningSum[i] = runningSum[i-1]+nums[i]; 
        }
        }
        else{
            return runningSum;
        }
        return runningSum;
        
    }
}

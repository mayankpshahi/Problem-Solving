//1685. Sum of Absolute Differences in a Sorted Array

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] res = new int[nums.length];
        
        
        int[] prefixSum = new int[nums.length];
        
        int totalsum = 0;
        for(int i=0; i < nums.length; i++) {
            prefixSum[i] = totalsum;
            totalsum += nums[i];
        }
        
        for(int i=0; i < nums.length; i++) {
            int leftSum = prefixSum[i];
            int rightSum = totalsum - (prefixSum[i]) - nums[i];
            res[i] = Math.abs((nums[i] * i) - leftSum) + Math.abs((nums[i] * (nums.length-i-1)) - rightSum);
        }
        
        return res;
        
    }
}
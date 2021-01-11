//1658. Minimum Operations to Reduce X to Zero


class Solution {
    public int minOperations(int[] nums, int x) {
        
        int total = 0;
    for (int n : nums) total += n;
        
        int target= total - x, currSum = 0, maxSize = -1;
        int left = 0;
        for (int right = 0; right < nums.length; ++right) {
        currSum += nums[right];  
        while (left <= right && target < currSum) {
            currSum -= nums[left];
            left++;
        }
        if (currSum == target) maxSize = Math.max(maxSize, right - left + 1);
    }
     if(maxSize==-1) return -1;
     else return nums.length - maxSize;   
        
        
    }
}
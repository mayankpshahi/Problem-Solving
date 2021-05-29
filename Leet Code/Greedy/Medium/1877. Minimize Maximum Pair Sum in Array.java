

//1877. Minimize Maximum Pair Sum in Array


class Solution {
    public int minPairSum(int[] nums) {
       Arrays.sort(nums);
        
       int max=Integer.MIN_VALUE;
        
       int start = 0,end = nums.length -1;
        while(start<end){
            int curr =  nums[start] + nums[end];
            max = Math.max(max,curr);
            start++;
            end--;
        }
        
        
        return max;
    }
}
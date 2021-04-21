

//198. House Robber


//Recursive

class Solution {
    public int rob(int[] nums) {
        
     return rob(nums, nums.length-1); 
    }
    private int rob(int[] nums, int i) {
    if (i < 0) {
        return 0;
    }
    return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
}
}


//Recursive + Memoization


class Solution {
    
    int t [] = new int[101];
    public int rob(int[] nums) {
    
     Arrays.fill(t, -1);
     return rob(nums, nums.length-1); 
    }
    private int rob(int[] nums, int i) {
    if (i < 0) {
        return 0;
    }
    
    if(t[i]>=0) return t[i];
    return t[i]=Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
}
}



public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    int prev1 = 0;
    int prev2 = 0;
    for (int num : nums) {
        int tmp = prev1;
        prev1 = Math.max(prev2 + num, prev1);
        prev2 = tmp;
    }
    return prev1;
}
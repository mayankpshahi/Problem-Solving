//376. Wiggle Subsequence

class Solution {
    public int wiggleMaxLength(int[] nums) {
       
        if (nums.length <= 1) return nums.length;
    
    int count = nums.length;
    Boolean flag = null;
    
    for (int i = 0; i < nums.length-1; i++){
        int curr = nums[i+1] - nums[i];
        if (curr == 0) count--;
        else if (flag == null) flag = curr > 0;
        else if ((curr > 0 && flag) || (curr < 0 && !flag))
            count--;
        else
            flag = !flag;
    }
    return count;
        
    }
}
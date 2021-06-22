


//Region in BinaryMatrix



public class Solution {
    public int solve(int[][] nums) {
        int i, j, k = Integer.MIN_VALUE;
        for (i = 0; i < nums.length; ++i){
            for (j = 0; j < nums[0].length; ++j){
                if (nums[i][j] == 1){
                    k = Math.max(k, find(nums, i, j));
                    
                }
                
            }
            
        }
        return k;
    }
    private int find(int [][] nums, int i, int j){
        if (i >= 0 && i < nums.length && j >= 0 && j < nums[0].length){
            if (nums[i][j] == 1){
                nums[i][j] = 2;
                return 1 + find(nums, i + 1, j) + find(nums, i - 1, j) + find(nums, i, j + 1) + find(nums, i, j - 1) + find(nums, i + 1, j + 1) + find(nums, i + 1, j - 1) + find(nums, i - 1, j + 1) + find(nums, i - 1, j - 1);
                
            }
            
        }
        return 0;
        
    }
}

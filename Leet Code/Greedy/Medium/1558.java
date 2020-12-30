//1558. Minimum Numbers of Function Calls to Make Target Array



class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        boolean arr0 = false;
        
        while(!arr0){
            arr0 = true;         
            
            for(int j=0;j<nums.length;j++){
                res += nums[j] % 2;
                nums[j] /= 2;
                if(nums[j] != 0)
                    arr0 = false;
            }
            
            res++;
        }                
        return res - 1;       
        
    }
}
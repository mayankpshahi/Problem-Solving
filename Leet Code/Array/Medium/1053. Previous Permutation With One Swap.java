




//1053. Previous Permutation With One Swap



class Solution {
    public int[] prevPermOpt1(int[] nums) {
   int n =  nums.length;
   int i = n - 1;
    
    while (i > 0 && nums[i - 1] <=nums[i])// Longest non-decreasing suffix
        i--;
        
    // Now i is the head index of the suffix
    
    // Are we at the last permutation already?
    if (i <= 0){
     
        return nums;
        
    }
       
    
    // Let array[i - 1] be the pivot
    // Find rightmost element less than the pivot
    int j = n - 1;
    while (j>=i){
        if (nums[j] < nums[i-1] && nums[j] != nums[j - 1]) {
                int tmp = nums[j];
                nums[j] = nums[i-1];
                nums[i-1] = tmp;
                break;
            }
        j--;
    
    }
        
  
    // Successfully computed the next permutation
    return nums;
     
        
    }
}
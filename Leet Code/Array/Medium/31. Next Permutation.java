




//31. Next Permutation




class Solution {
    public void nextPermutation(int[] nums) {
      
    int n =  nums.length;
   int i = n - 1;
    
    while (i > 0 && nums[i - 1] >= nums[i])// Longest non increasing suffix
        i--;
        
    // Now i is the head index of the suffix
    
    // Are we at the last permutation already?
    if (i <= 0){
      int p=0;  
      int  j = n - 1;
    while (p < j) {
        int temp = nums[p];
        nums[p] = nums[j];
        nums[j] = temp;
        p++;
        j--;
    }
        
       
         return;
        
    }
       
    
    // Let array[i - 1] be the pivot
    // Find rightmost element greater than the pivot
    int j = n - 1;
    while (nums[j] <= nums[i - 1])
        j--;
    
    // Now the value array[j] will become the new pivot
    // Assertion: j >= i
    
    // Swap the pivot with j
    int temp = nums[i - 1];
    nums[i - 1] = nums[j];
    nums[j] = temp;
    
    // Reverse the suffix
    j = n - 1;
    while (i < j) {
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
    
    // Successfully computed the next permutation
    return;
        
    }
}
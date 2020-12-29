//540. Single Element in a Sorted Array

class Solution {
    
    public int singleNonDuplicate(int[] nums) {
         int l =0,h=nums.length-1;
        while(l<h){
            int mid=(l+h)/2;
        if (mid % 2 == 0) {
                if (nums[mid] == nums[mid - 1]) {
                    h = mid;
                }
                else{
                    l= mid;
                }
        }
        else {
                if (nums[mid] == nums[mid - 1]) {
                    l= mid + 1;
                }
                else {
                    h= mid - 1;
                }
            }
        }
        
        
        return nums[l];
        
        
    }
}


//1753. Maximum Score From Removing Stones
class Solution {
    public int maximumScore(int a, int b, int c) {
        int[] nums=new int[]{a,b,c};
     Arrays.sort(nums);
        
     if(nums[2]>nums[1]+nums[0])
         return nums[0]+nums[1];
     else
         return (a+b+c)/2;
        
    
        
        
    }
}
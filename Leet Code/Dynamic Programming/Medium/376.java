//376. Wiggle Subsequence

class Solution {
    public int wiggleMaxLength(int[] nums) {
       
      if(nums.length < 2) return nums.length;
    int inc[] = new int[nums.length], dec[] = new int[nums.length];
        
   inc[0]=1;
   dec[0]=1;
    
        
    for(int i=1;i<nums.length;i++) {
        if( nums[i] > nums[i-1] ){
                inc[i] = dec[i-1]+1;
                dec[i] = dec[i-1];
            }else if( nums[i] < nums[i-1]){
                dec[i] = inc[i-1]+1;
                inc[i] = inc[i-1];
            }else{
                dec[i] = dec[i-1];
                inc[i] = inc[i-1];
            }
    }
    
    return Math.max(inc[nums.length-1],dec[nums.length-1]);
        
    }
}
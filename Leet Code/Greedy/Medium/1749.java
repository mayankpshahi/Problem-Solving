
//1749. Maximum Absolute Sum of Any Subarray

class Solution {
    public int maxAbsoluteSum(int[] nums) {
       
        
    
        if(nums.length == 1) return nums[0];
        int store = 0, max =Integer.MIN_VALUE,min=Integer.MAX_VALUE;

        
        for(int x : nums){
            
                store += x;
            
               if (max < store) 
                max = store; 
            

            if(store<0)store = 0;
            
            
        }
        
         store= 0;
        for(int x : nums){
            
            store += x;
             
            if(min>store) 
                min = store; 
            
             if(store>0)
                store = 0;
            
        
        }
        
      return Math.max(max,Math.abs(min));
    }
}
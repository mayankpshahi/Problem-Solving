

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




class Solution {
    int t[];
    public int rob(int[] nums) {
          if(nums.length==0) return 0;
          t =  new int[nums.length+1];
          t[0] =  0;
          t[1] =  nums[0];
          for(int i=1;i<nums.length;i++)
              t[i+1] =  Math.max(t[i-1] + nums[i],t[i]);
        
         return t[nums.length];
            
        }
        
        
        
    
    }
    
    
    //Memoization Solution
    
    class Solution {
    int t[];
    public int rob(int[] nums) {
          if(nums.length==0) return 0;
          if(nums.length==1) return nums[0];
          if(nums.length==2) return nums[0]>=nums[1]?nums[0]:nums[1];
        
          t =  new int[nums.length+1];
          Arrays.fill(t,-1);
         
          return findMax(nums,0);
            
        }
        private int findMax(int[]nums, int index){
            if(index>=nums.length)return 0;
            if(t[index]!=-1)return t[index];
            return t[index]=Math.max(nums[index]+findMax(nums,index+2),findMax(nums,index+1));
        }
        
        
    
    }
    
    //Flipkart Interview Fail code below
    
    class Solution {
        
       
        public int rob(int[] nums) {
        
    
         int n =  nums.length;
            
            
         int suffix[][] =  new int[n][2];
            
        for(int i=0;i<n;i++){
            for(int j=i+2;j<n;j++){
                if(nums[j]>0){
                suffix[i][0] = nums[j];
                suffix[i][1]=j;
                break;
                }
                
            }
        }
            
            
        int max =  Integer.MIN_VALUE; 
        for(int i=0;i<n;i++){
             int sum =  nums[i];
            for(int j=i;j<n;){
                
                sum+=  suffix[j][0];
                if(suffix[j][1]!=0)
                 j=suffix[j][1];
                else
                    j+=2;
                
               
            }
            
            max =  Math.max(sum,max);
        }
            
        return max;
            
        }
    
    }
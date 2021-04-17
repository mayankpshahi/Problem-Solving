

//1829. Maximum XOR for Each Query


class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int max =(int)Math.pow(2,maximumBit) -1;
        
        int res[] =  new int[nums.length];
        int q=0;
        int full=0;
        for(int i=0;i<nums.length;i++){
                full^=nums[i];
        }
        int j= nums.length;
        while(j-->0){
            res[q] = full^max;
            q++;
            full^=nums[j];
            
            
        }
     
        
        return res;
        
    }
}
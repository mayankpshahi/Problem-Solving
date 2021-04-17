
//1827. Minimum Operations to Make the Array Increasing


class Solution {
    public int minOperations(int[] nums) {
       int prev = nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<prev){
              
                count+=Math.abs(prev-nums[i])+1;
                nums[i]+=Math.abs(prev-nums[i])+1;
                prev=nums[i];
              
            }
            else if(nums[i]==prev){
              
                count++;
                nums[i]+=1;
                prev=nums[i];
               
            }else{
                prev=nums[i];
            }
        }
        
        //for(int i: nums)System.out.println(i);
        return count;
        
    }
}
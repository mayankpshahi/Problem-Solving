My Solution

class Solution {
    public int findNumbers(int[] nums) {
        int [] countnums = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int firstcount = 0;
            while (nums[i]>0){
                nums[i] = nums[i]/10;
                firstcount++;
            }
            countnums[i] = firstcount;
        }
        int secondcount = 0;
        for(int i=0;i<nums.length;i++){
            if(countnums[i]%2 == 0){
                secondcount++;
            }
        }
        return secondcount;
    }
}

Second Solution

class Solution {
    public int findNumbers(int[] nums) {
        if(nums == null) return -1;
        
        int countEven = 0; 
        int numsLen = nums.length;
        
        for(int i = 0; i < numsLen; i++){
            countEven += isEven(nums[i]);
        }
        
        return countEven; 
    }
    
    private int isEven(int num){ 
        boolean even = true; 
        
        if(num/10 == 0) even = false; 
        else if(num/100 == 0) even = true; 
        else if(num/1_000 == 0) even = false; 
        else if(num/10_000 == 0) even = true; 
        else if(num/100_000 == 0) even = false; 
        
        return (even == true)? 1:0; 
    }
}



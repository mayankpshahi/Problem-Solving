First Solution:

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] small =  new int[101];
        for(int i=0; i<nums.length;i++){
            small[nums[i]]++;
        }
        for(int i=1;i<101;i++){
            small[i]+=small[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int pos = nums[i];
            if(pos==0) nums[i] = 0;
            else{
                nums[i] = small[pos-1];
            }
        }
        return nums;
    }
}



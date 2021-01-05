//283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
    for (int i = 0; i < nums.length; i++) {
		if(nums[i]==0)
			count++;
		if(count!=0&&nums[i]!=0){
			nums[i-count]=nums[i];
			nums[i]=0;
		}
	}
        
    }
}
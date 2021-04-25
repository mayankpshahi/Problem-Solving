

//1838. Frequency of the Most Frequent Element


// O(n^2)
class Solution {
    public int maxFrequency(int[] nums, int k) {
       Arrays.sort(nums);
	int result = 1, currentItems = 1;
	for(int i=1;i<nums.length;i++) {
		int currentSum = 0 ;
		if(nums[i] == nums[i-1]) currentItems++;
		else {
			currentItems = 1;
			for(int j=i-1;j>=0;j--) {
				currentSum += (nums[i] - nums[j]);
				if (currentSum > k) break;
				currentItems ++;
			}
		}
		result = Math.max(result, currentItems);
	}
	return result;
        
    }
}




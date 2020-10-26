class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffleArray = new int[nums.length];
        int k = 0;
        for(int i = 0;i<nums.length && k<nums.length;i++){
            shuffleArray[k] = nums[i];
            shuffleArray[k+1] = nums[n];
            n++;
            k+=2;
            
        }
        return shuffleArray;
        
    }
}




//384. Shuffle an Array



import java.util.Random;
class Solution {
    
    private int nums[];
    private Random rand;

    public Solution(int[] nums) {
        this.nums= nums;
        rand = new Random();
        
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
        
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums==null) return null;
        
        int [] arr =  nums.clone();
        
        for(int j = 1; j < arr.length; j++) {
            int i = rand.nextInt(j+1);
            swap(arr, i, j);
        }
        return arr;
        
    }
    
    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */




//1027. Longest Arithmetic Subsequence


class Solution {
    public int longestArithSeqLength(int[] nums) {
        int max = 2, n = nums.length;
        if(n==1)return 1;
        HashMap<Integer, Integer>[] t  = new HashMap[n];
        
        for (int i = 0; i < nums.length; i++) {
            t[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int d = nums[i] - nums[j];
                t[i].put(d, t[j].getOrDefault(d, 1) + 1);
                max = Math.max(max, t[i].get(d));
            }
        }
        return max;
        
        
        
    }
   
}
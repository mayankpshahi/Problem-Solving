//1695. Maximum Erasure Value


class Solution {
    public int maximumUniqueSubarray(int[] nums) {
         Set<Integer> s = new HashSet<>();
        
        int start = 0, n = nums.length, sum = 0; 
        int ans = -1;
        
        for(int end = 0; end < n; end++) {
            
            if(s.contains(nums[end])) {
                while(s.contains(nums[end])) {
                    sum -= nums[start];
                    s.remove(nums[start]);
                    start++;
                }
            }
            
            s.add(nums[end]);
            sum += nums[end];
          
            ans = Math.max(ans, sum);
        }
        
        return ans;
        
    }
}
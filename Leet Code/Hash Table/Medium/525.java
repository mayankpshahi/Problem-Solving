//525. Contiguous Array

class Solution {
    public int findMaxLength(int[] nums) {
        
         if (nums == null || nums.length == 0) {
            return 0;
        }
        //nums = [0,1,0]
        
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] == 0) {
               nums[i] = -1;
           }
       }
        
        //nums = [-1,1,-1]
        
        int currsum = 0;
        int maxlen = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);// m = {(0,-1)}
        
        for (int i = 0; i < nums.length; i++) {
           currsum += nums[i]; //currsum {-1,0,-1}
            
            if (m.containsKey(currsum)) {
                int lastsum = m.get(currsum);
                maxlen = Math.max(maxlen, i - lastsum);//maxlen = {2}
            } else {
                m.put(currsum, i); //m = {(0,-1),(-1,0)}
            }
       }
        
        return maxlen;
        
    }
}
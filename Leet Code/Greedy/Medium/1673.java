//1673. Find the Most Competitive Subsequence

class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
         
      Stack<Integer> st = new Stack<>();
     
        int res[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
        while (!st.empty() && nums[i] < nums[st.peek()] && (nums.length-k)>(i-st.size())) {
             st.pop();
        }
        if (st.size() < k) {
            st.push(i);
        }
    }
        for (int i = k - 1; i >= 0; i--) {
        res[i] = nums[st.pop()];
    }
        
        return res;
    }
}
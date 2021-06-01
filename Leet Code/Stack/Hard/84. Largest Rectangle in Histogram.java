

//84. Largest Rectangle in Histogram


class Solution {
    public int largestRectangleArea(int[] nums) {
        int n= nums.length;
  int res = 0;
   Stack<Integer> stack = new Stack<>();
      int left[] = new int[n];
      int right[] = new int[n];
      for (int i = 0; i < n; i++) {
          left[i] = -1;
      }
      for (int i = 0; i < n; i++) {
          right[i] = n;
      }
      for (int i = n-1; i >=0; i--) {
          while (!stack.isEmpty()&&nums[stack.peek()]>=nums[i]) {                     
              left[stack.pop()] = i;
          }
          stack.add(i);
      }
      stack.clear();
       for (int i = 0; i < n; i++) {
          while (!stack.isEmpty()&&nums[stack.peek()]>nums[i]) {                     
              right[stack.pop()] = i;
          }
          stack.add(i);
      }
      for (int i = 0; i < n; i++) {
           res = Math.max(res, (right[i]-left[i]-1)*nums[i]);
      }
      return res;
        
    }
}
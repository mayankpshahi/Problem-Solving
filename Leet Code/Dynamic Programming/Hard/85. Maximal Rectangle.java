

//85. Maximal Rectangle

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        
        
         int n =  matrix.length;
        int m  =  matrix[0].length;
        
        int newMatrix[][] = new int[n][m];
        
        for (int i = 0; i < m; i++) {
      newMatrix[0][i] = matrix[0][i]-'0';
      for (int j = 1; j < n; j++) {
          if (matrix[j][i]-'0' == 1) {
              newMatrix[j][i] = newMatrix[j-1][i]+1;
          }
      }
  }
        
       int maxArea =0;
        for (int i = 0; i < n; i++) {           
           maxArea = Math.max(maxArea, LargestRectangleinHistogram(newMatrix[i]));     
  }
        return maxArea;
        
        
        
    }
    
   private int LargestRectangleinHistogram(int nums[])
  {
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
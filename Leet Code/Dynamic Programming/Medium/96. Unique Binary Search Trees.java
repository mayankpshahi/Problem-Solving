

//96. Unique Binary Search Trees

class Solution {
    public int numTrees(int n) {
        
    int [] t = new int[n+1];
  t[0] = t[1] = 1;
    
  for(int i=2; i<=n; ++i) {
    for(int j=1; j<=i; ++j) {
      t[i] += t[j-1] * t[i-j];
    }
  }
  return t[n];
        
    }
}
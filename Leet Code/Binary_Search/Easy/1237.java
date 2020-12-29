//1237. Find Positive Integer Solution for a Given Equation


/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
       int start = 1,end = 1000;
        int currStart = start,currEnd = end;
        
        List<List<Integer>> res = new ArrayList();
        
        while(currStart <= end && currEnd>=start) {
          int val = customfunction.f(currStart, currEnd);
          if(val == z) {
              List<Integer> l = new ArrayList<Integer>();
              l.add(currStart);
              l.add(currEnd);
              res.add(l);
              currStart++;
              currEnd--;
          } else if(val < z) {
              currStart++;
          } else {
              currEnd--;
          }
          
      }
        
    return res;
        
        
        
    }
}


//645. Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        
    Map<Integer, Integer> m = new HashMap<>();
 
    for (int i : nums) {
    m.put(i, m.getOrDefault(i, 0) + 1);
    }
    
  int duplicate = -1, missing = -1;
        
  for (int i = 1; i <= n; ++i) {
    if (m.containsKey(i) == false) missing = i;
    else if (m.get(i) == 2) duplicate = i;
    
    if (duplicate > 0  && missing > 0) break;
  }
  return new int[] { duplicate, missing };    
        
    }
}
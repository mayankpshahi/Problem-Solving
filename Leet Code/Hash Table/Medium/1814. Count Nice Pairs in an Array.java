
//1814. Count Nice Pairs in an Array

class Solution {
    private int reverse(int num){
    int rev_num = 0;
 
  while (num > 0){
    
    rev_num = rev_num * 10 +
              num % 10;
    num = num / 10;
  }
  return rev_num;
}
    
public int countNicePairs(int[] nums) {
        long res = 0;
         int n =  nums.length;
        
      int rev [] =   new int[n];
        
    for(int i = 0;i<n;i++)
        rev[i] = reverse(nums[i]);
  
HashMap<Integer,Integer> freq =new HashMap<>();
        
    for(int i = 0; i < n; ++i){
      freq.put(nums[i] -  rev[i], freq.getOrDefault(nums[i] -  rev[i], 0) + 1);
    
  }
        
for(Map.Entry<Integer, Integer> map: freq.entrySet()){
            int val = map.getValue();
            res += (((long)val)*(val-1))/2;
            res %=1000000007;
        }
        
    return (int)res;
        
    }
}
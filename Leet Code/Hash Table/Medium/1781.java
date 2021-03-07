

//1781. Sum of Beauty of All Substrings

class Solution {
    public int beautySum(String s) {
      int n =  s.length();
      int res = 0;
      char [] s1 = s.toCharArray();
      for(int i=0;i<n-2;i++){
          int freq[] =  new int[26];
          for(int j=i;j<n;j++){
              freq[s1[j]-'a']++;
              int max = Integer.MIN_VALUE; 
              
              int min = Integer.MAX_VALUE;
              for(int c: freq) {
            if(c ==0) continue; 
            min = Math.min(min, c);
            max = Math.max(max, c);
        }
              res+=max-min;
          }
          
          
      }
        
    return res;
    }
}
//738. Monotone Increasing Digits

class Solution {
    
    public int monotoneIncreasingDigits(int N) {
          char[] s = (String.valueOf(N)).toCharArray();
          
          int i=1;
          while(i<s.length && s[i]>=s[i-1])i++;
        
          while(i>0 && i<s.length && s[i-1]>s[i]){
              s[i-1]--;
              i--;
          }
          
        for(int j=i+1;j<s.length;j++) s[j]='9';
        
        return Integer.valueOf(String.valueOf(s));
    }
}
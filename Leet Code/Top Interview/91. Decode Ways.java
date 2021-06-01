



////91. Decode Ways


class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] t = new int[n + 1];
        t[0] = 1;
        t[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
               t[i] += t[i-1];  
            }
            if (second >= 10 && second <= 26) {
                t[i] += t[i-2];
            }
        }
        return t[n];
    }
}

// Memoization



public class Solution {
    int t [];
   public int numDecodings(String s) {
      t = new int[s.length()+1];
       Arrays.fill(t,-1);
       return s.length()==0?0:numDecodings(0,s);
   }
   private int numDecodings(int p, String s) {
       
       int n=s.length();
       if(p==n) return 1;
       if(s.charAt(p)=='0') return 0;
       if(t[p]!=-1) return t[p];
       int res=numDecodings(p+1,s);
       if(p<n-1&&(s.charAt(p)=='1'||s.charAt(p)=='2'&&s.charAt(p+1)<'7')) 
           res+=numDecodings(p+2,s);
       return t[p]=res;
   }
}

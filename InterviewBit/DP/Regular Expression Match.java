




// Java solution runs on 10. Regular Expression Matching



public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
   
    public int isMatch(final String s, final String p) {
     if (p.length() == 0) return s.length() == 0?1:0;
        int si = 0, pi = 0, match = 0, star = -1;
        int sl = s.length(), pl = p.length();
        char[] sc = s.toCharArray(), pc = p.toCharArray();
        while (si < sl) {
            if (pi < pl && (pc[pi] == sc[si] || pc[pi] == '?')) {
                si++;
                pi++;
            } else if (pi < pl && pc[pi] == '*') {
                star = pi++;
                match = si;
            } else if (star != -1) {
                si = ++match;
                pi = star + 1;
            } else return false?1:0;
        }
        while (pi < pl && pc[pi] == '*') pi++;
        return pi == pl?1:0;
    }    
    
    
    
}





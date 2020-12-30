//1247. Minimum Swaps to Make Strings Equal


class Solution {
    public int minimumSwap(String s1, String s2) {
        
        if(s1.length()!=s2.length()) return -1;
        
         int xmiss = 0;
         int ymiss = 0;
        
        for (int i =0; i<s1.length(); i++) {
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y') {
                xmiss++;
            } else if (s1.charAt(i) == 'y' && s2.charAt(i) == 'x') {
                ymiss++;
            }
        }
         if (xmiss % 2 != ymiss % 2) {
            return -1;
        }
        
         int res = xmiss / 2 + ymiss / 2; 
        if (xmiss % 2 == 1) {
            res += 2; 
        }
        
        return res;
        
    }
}
//1309. Decrypt String from Alphabet to Integer Mapping

//O(n)
class Solution {
    public String freqAlphabets(String s) {
        
         StringBuilder res = new StringBuilder();
         for(int i = s.length()-1; i >= 0; i--){
             if(s.charAt(i) == '#'){
            res.append((char)('a' + (s.charAt(i-1) -'0' ) + 10*(s.charAt(i-2)-'0') -1) );               i -= 2;
            } 
            else {
                res.append((char)('a' + (s.charAt(i) - '0') -1));
            }
        }
        res.reverse();
        
        return res.toString();
        
        
    }
}
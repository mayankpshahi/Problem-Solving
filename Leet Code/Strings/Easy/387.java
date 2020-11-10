//387. First Unique Character in a String

//O(n)
class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
        
        
    }
}

//O(1) Best Solution
class Solution {
    public int firstUniqChar(String s) {
        int res = s.length();
        for (char c = 'a'; c <= 'z'; c++) {
            int i = s.indexOf(c);
            if (i != -1 && i == s.lastIndexOf(c)) {
                res = Math.min(res, i);
            }
        }
        return res == s.length() ? -1 : res;
    }
}
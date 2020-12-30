//1400. Construct K Palindrome Strings


class Solution {
    public boolean canConstruct(String s, int k) {
        if(s == null || s.isEmpty() || s.length()<k) return false;
        int [] count = new int[26];
        
        for(int i=0;i<s.length();i++)
            count[s.charAt(i)-'a']++;
        
        int countodd = 0;
        for(int i=0;i<26;i++)
            if(count[i]%2!=0)countodd++;
        
        if(countodd>k) return false;
        else return true;
         
    }
}
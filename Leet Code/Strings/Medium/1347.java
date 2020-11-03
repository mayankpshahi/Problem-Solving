//1347. Minimum Number of Steps to Make Two Strings Anagram

//O(n)

class Solution {
    public int minSteps(String s, String t) {
        int freqs[] = new int[26];
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            freqs[s.charAt(i) - 'a']++;
            freqs[t.charAt(i) - 'a']--;
        }
        for(int i : freqs)if(i > 0) ans += i;
        return ans;
    }
}

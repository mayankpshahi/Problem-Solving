//1657. Determine if Two Strings Are Close

class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!=word2.length()) return false;
        
        int freq1[] = new int[26],freq2[] = new int[26];
        boolean seen1[] = new boolean[26],seen2[] = new boolean[26];
      
        for(char ch : word1.toCharArray()){
            freq1[ch-'a']++;
            seen1[ch - 'a'] = true;
           
        }
        
        for(char ch : word2.toCharArray()){
            freq2[ch-'a']++;
            seen2[ch - 'a'] = true;
            
        }
        
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        boolean f = true;
        for (int i = 0; i < 26; i++) {
            if(seen1[i]!=seen2[i] || freq1[i]!=freq2[i])
                f=false;
            
        }
        
        return f;
        
    }
}
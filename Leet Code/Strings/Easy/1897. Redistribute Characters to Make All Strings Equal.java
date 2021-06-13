

//1897. Redistribute Characters to Make All Strings Equal


class Solution {
    public boolean makeEqual(String[] s) {
          int freq[] = new int[26];
        if(s.length<= 1)
            return true;
        for(int i = 0; i < s.length; i++){
            for(int j = 0; j < s[i].length(); j++){
                freq[s[i].charAt(j) - 'a']++;
            }
            
        }
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0 && freq[i]%s.length != 0){
                return false;
            }
        }
        return true;
        
        
    }
}
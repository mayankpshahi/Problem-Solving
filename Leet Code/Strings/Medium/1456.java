//1456. Maximum Number of Vowels in a Substring of Given Length

//O(n)
class Solution {
    public int maxVowels(String s, int k) {
        
        int vowel = 0;
        for(int j =0; j< k; j++)
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') vowel++;
        
        int max = vowel;
        
        for(int j = k; j < s.length(); j++){
            if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') 
                vowel++;
            if(s.charAt(j-k) == 'a' || s.charAt(j-k) == 'e' || s.charAt(j-k) == 'i' || s.charAt(j-k) == 'o' || s.charAt(j-k) == 'u') 
                vowel--;
            max = Math.max(max, vowel);
        
        }
        
        return max;
        
    }
}


//Best Solution
class Solution {
    public int maxVowels(String s, int k) {
              
        int i = 0;
        int j = k;        
        int currVcount = 0;        
        int maxCount = 0;
        
        int[] vowel = new int[26];
        vowel['a' - 'a'] = 1;
        vowel['e' - 'a'] = 1;
        vowel['i' - 'a'] = 1;
        vowel['o' - 'a'] = 1;
        vowel['u' - 'a'] = 1;
        
        char[] sChar = s.toCharArray();
                
        while(i<k-1){        
            currVcount+=vowel[sChar[i]-'a'];
            i++;
        }
                
        i=0;
        k = k - 1 ;
        
        while(k<sChar.length){         
            
            currVcount+=vowel[sChar[k]-'a'];           
            maxCount = Math.max(maxCount,currVcount);                        
            currVcount-=vowel[sChar[i]-'a'];            
            i++;
            k++;
        }
        
        return maxCount;
    }
}
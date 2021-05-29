

//1160. Find Words That Can Be Formed by Characters

class Solution {
    public int countCharacters(String[] words, String chars) {
        int freqc []  =  new int[26];
       
        for(char ch : chars.toCharArray()) freqc[ch - 'a']++;
        
        int sum =0;
            
        for(int i = 0;i<words.length;i++){
            int freqb[]  =  new int[26];
            for(char ch:words[i].toCharArray()) freqb[ch - 'a']++;
            
            boolean flag =true;
            
            for(int j=0;j<26;j++){
                if(freqb[j]>0){
                if(freqc[j] <freqb[j]){
                    flag = false;
                    break;
                }
                }
            }
                
            
            if(flag) sum+=words[i].length();
            
            
        }
        
        return sum;
        
    }
}
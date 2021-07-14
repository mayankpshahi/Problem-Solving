






//1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence


class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] str = sentence.split(" ");
        
        
        
        for(int i=0;i<str.length;i++){
            if(str[i].length()>=searchWord.length()){
            int count=0;
            for(int j = 0;j<searchWord.length();j++){
                if(str[i].charAt(j)==searchWord.charAt(j))
                    count++;
                else
                    break;
            }
            if(count ==searchWord.length() )return i+1;
            }
        }
        
        return -1;
        
    }
}
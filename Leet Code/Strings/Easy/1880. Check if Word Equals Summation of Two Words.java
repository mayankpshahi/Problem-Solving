



//1880. Check if Word Equals Summation of Two Words


class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String fval="",sval="",tval="";
        
        for(char ch : firstWord.toCharArray()) fval+=(ch-'a');
        for(char ch : secondWord.toCharArray()) sval+=(ch-'a');
        for(char ch : targetWord.toCharArray()) tval+=(ch-'a');
        
        if(Integer.parseInt(fval) + Integer.parseInt(sval) == Integer.parseInt(tval) )
            return true;
        else
            return false;
        
        
    }
}
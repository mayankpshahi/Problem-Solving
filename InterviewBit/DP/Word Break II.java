




//Word Break II

public class Solution {
    public ArrayList<String> wordBreak(String s, ArrayList<String> wordDict) {
        
         HashSet<String> dict =  new HashSet<>(wordDict);
        
        return wordBreakHelper(s,dict,0);
    }
    private ArrayList<String> wordBreakHelper(String s,HashSet<String> dict,int start){
        
        ArrayList<String> valid = new ArrayList<>();
        
        if(start==s.length()) valid.add("");
        
        for(int end = start+1;end<=s.length();end++){
            String prefix = s.substring(start,end);
            if(dict.contains(prefix)){
                 List<String> suffix = wordBreakHelper(s,dict,end);
                
                for(String word:suffix){
                    valid.add(prefix + (word.equals("")?"":" ")+word);
                }
            }
        }
        
        return valid;
        
    }
}

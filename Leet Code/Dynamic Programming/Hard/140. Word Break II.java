







//140. Word Break II




class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        HashSet<String> dict =  new HashSet<>(wordDict);
        
        return wordBreakHelper(s,dict,0);
        
    }
    private List<String> wordBreakHelper(String s,HashSet<String> dict,int start){
        
        List<String> valid = new ArrayList<>();
        
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


//Memoization



class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
        HashMap<Integer, List<String>> hm = new HashMap<>();
        HashSet<String> dict =  new HashSet<>(wordDict);
        
        return wordBreakHelper(s,dict,0,hm);
        
    }
    private List<String> wordBreakHelper(String s,HashSet<String> dict,int start, HashMap<Integer, List<String>> hm){
        
        if(hm.containsKey(start))return hm.get(start);
        
        List<String> valid = new ArrayList<>();
        
        if(start==s.length()) valid.add("");
        
        for(int end = start+1;end<=s.length();end++){
            String prefix = s.substring(start,end);
            if(dict.contains(prefix)){
                 List<String> suffix = wordBreakHelper(s,dict,end,hm);
                
                for(String word:suffix){
                    valid.add(prefix + (word.equals("")?"":" ")+word);
                }
            }
        }
        
        hm.put(start,valid);
        return valid;
        
    }
}




//Partial Solution


class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
       // boolean res = false;
        
        
      boolean[] f = new boolean[s.length() + 1];
        
         f[0] = true;
        
       for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && wordDict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        
        return f[s.length()];
        
    }
     
}
       



















//Solution



public class Solution {
    public int wordBreak(String s, ArrayList<String> wordDict) {
          byte[] dp = new byte[s.length()];    // dp[i] = if possible to use words from wordDict to make s up to index i
        Arrays.fill(dp, (byte) -1);          // initialize all to -1 to indicate not calculated yet
        
        return wordBreak(s, 0, wordDict, dp)==true?1:0;
    }
     private boolean wordBreak(String s, int index, ArrayList<String> wordDict, byte[] dp) {
        if (index >= s.length())                  // index past entire string already, means we found a solution
            return true;
        
        if (dp[index] != -1)
            return dp[index] == 1;               // decision here was using 1 to represent true, and 0 to represent false
        
        byte match = 0;
        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);
            if (s.startsWith(word, index) && wordBreak(s, index + word.length(), wordDict, dp)) {    // if the word starts at index, we recursively look for solution down this path   
                match = 1;
                break;    // found a solution already so can break and skip work
            }
        }
        
        dp[index] = match;    // save result in dp for future use
        
        return match == 1;
    }
}

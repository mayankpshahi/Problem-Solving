//1754. Largest Merge Of Two Strings




class Solution {
    public String largestMerge(String word1, String word2) {
        char st[]  = new char[word1.length() + word2.length()];
        
        int p=0,q=0,i=0;
       while(p<word1.length() || q<word2.length()){
            if(q == word2.length() || word1.substring(p).compareTo(word2.substring(q)) > 0)
            {
                st[i]=word1.charAt(p);
               
                p++;
                i++;
            }else {
                st[i]=word2.charAt(q);
               
                q++;
                i++;
            
            }
            
        }
        
        return String.valueOf(st);
    
    }
}
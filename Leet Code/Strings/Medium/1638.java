//1638. Count Substrings That Differ by One Character

//Bruteforce O(n^2)

class Solution {
    public int countSubstrings(String s, String t) {
        
        List<String> subs = new ArrayList<>();
        List<String> subt= new ArrayList<>();
        
        generateSubString(s,subs);
        generateSubString(t,subt);
        
        int count = 0;
        
        for(String ss : subs){
            for(String st: subt){
                int diff = 0;
    
                if(ss.length() == st.length()){
                    for(int i=0; i<ss.length();i++){
					
                        if(ss.charAt(i)!=st.charAt(i))
                            diff++;
                        
                        if(diff > 1)  break;
                    }
				 	
                    if(diff==1) count++;
                }
            }
            
        }
        return count;
        
    }
    
     private void generateSubString(String s, List<String> list){
        int window = 0;
        
        while(window<s.length()){
            
        for(int i=0; i+window<s.length(); i++){
            list.add(s.substring(i,i+window+1));
         }
            window++;
        }
    }
}

//Best Solution

class Solution {
    public int countSubstrings(String s, String t) {
       int res = 0 ;
       for (int i = 0; i < s.length(); ++i)
           res += helper(s, t, i, 0);
       for (int j = 1; j < t.length(); ++j)
           res += helper(s, t, 0, j);
       return res;
   }


   public int helper(String s, String t, int i, int j) {
       int res = 0, pre = 0, cur = 0;
       for (int n = s.length(), m = t.length(); i < n && j < m; ++i, ++j) {
           cur++;
           if (s.charAt(i) != t.charAt(j)) {
               pre = cur;
               cur = 0;
           }
           res += pre;
       }
       return res;
   }
}
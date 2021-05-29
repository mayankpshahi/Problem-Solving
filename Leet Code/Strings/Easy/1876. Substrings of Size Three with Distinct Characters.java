

//1876. Substrings of Size Three with Distinct Characters

class Solution {
    
    private int distinctSubString(String P, int N)
{
    
    ArrayList<String> S =  new ArrayList<String>();
   
    for (int i = 0; i < N; ++i) {
   
        boolean []freq = new boolean[26];
   
        String s = "";
   
        for (int j = i; j < N; ++j) {

            int pos = P.charAt(j) - 'a';
   
            
            if (freq[pos] == true)
                break;
   
            freq[pos] = true;
   
            
            s += P.charAt(j);
   
           
            S.add(s);
        }
    }
    int count =0;
        
    for(String q : S){
   if(q.length()==3)
       count++;
}
    
    
   
    return count;
}
    public int countGoodSubstrings(String s) {
        
       return distinctSubString(s, s.length());
    }
}
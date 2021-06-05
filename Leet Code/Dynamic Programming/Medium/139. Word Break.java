
//139. Word Break

//TLE

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
       // boolean res = false;
        
      //  boolean[] f = new boolean[s.length() + 1];
        
        if (s.length() == 0) 
            return true;
        
        for(int i=1;i<=s.length();i++){
            
            if(wordDict.contains(s.substring(0,i)) && wordBreak(s.substring(i,s.length()),wordDict)){
                
               return true;
                
            }
         
             //System.out.println(res);
            //if(res)return res;
        }
        
        return false;
        
        
    }
     
}




//139. Word Break


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
       
       
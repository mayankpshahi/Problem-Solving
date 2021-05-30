

//Generate all Parentheses II

public class Solution {
    public ArrayList<String> generateParenthesis(int A) {
       ArrayList<String> res = new ArrayList<>();
       
       backtrack(res,"",0,0,A);
       return res;
    }
    public void backtrack(ArrayList<String> res,String s,int open,int close,int max){
        
           if(s.length()==2*max) {
            res.add(s);
            return;
        }
               
        
      if(open<max)
           backtrack(res,s+"(",open+1,close,max);
           
      
      if(close<open)
         backtrack(res,s+")",open,close+1,max);
        
        
        
        
    }
    
}

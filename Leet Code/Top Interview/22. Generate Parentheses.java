
//22. Generate Parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> res = new ArrayList<>();
       
       backtrack(res,"",0,0,n);
       return res;
    }
    public void backtrack(List<String> res,String s,int open,int close,int max){
        
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
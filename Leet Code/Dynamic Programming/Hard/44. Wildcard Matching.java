


//44. Wildcard Matching



class Solution {
    Boolean[][] t;
    public boolean isMatch(String s, String p) {
     t = new Boolean[s.length()+1][p.length()+1];
     return isMatch(0,s,0,p);
    }
    private boolean isMatch(int i, String s, int j, String p) { 
       if(t[i][j]!=null) return t[i][j];
        
       if(i==s.length() && j==p.length()) return t[i][j]=true;  //pattern = bcd and s=bcd
        
       if(i==s.length()){  // pattern  = bcd***** and s= bcd and i pointing to d inside s
           for(int ind =  j;ind<p.length();ind++){
               if(p.charAt(ind)!='*') return t[i][j]=false;
           }
           return t[i][j]=true;
       }
        
       if(j==p.length() && i!=s.length()) return t[i][j]=false;
        
        boolean res =  false;
        
        if(p.charAt(j)=='?'){
            if(isMatch(i+1,s,j+1,p)) res =  true; // pattern  = b?d and s= bcd
            
        }else  if(p.charAt(j)=='*'){
            if(isMatch(i,s,j+1,p)) res =  true; //pattern = *bcd and s=bcd
            
            if(isMatch(i+1,s,j+1,p)) res =  true; //pattern  = b*d and s= bcd
            
             if(isMatch(i+1,s,j,p)) res =  true; // pattern  = *d  and s= bcd
            
        }else { //both i and j pointing to character
            
            if(s.charAt(i)==p.charAt(j) && isMatch(i+1,s,j+1,p)){
               res =  true;
            }
            
        }
        
        return t[i][j]=res;
        
    }
}
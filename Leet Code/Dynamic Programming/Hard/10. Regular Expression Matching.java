



//10. Regular Expression Matching

class Solution {
    Boolean[][] t;
    public boolean isMatch(String s, String p) {
         t = new Boolean[s.length()+1][p.length()];
        return isMatch(0,s,0,p);
        
    }
     private boolean isMatch(int i, String s, int j, String p) { 
        int sn = s.length(), pn = p.length();
        if(j==pn) { // since * in p can match 0 of previous char, so empty string(i==sn) may match p
            return i==sn;    
        }
        if(t[i][j]!=null) {
            return t[i][j];
        }
        char pj = p.charAt(j);
        if(j+1<pn && p.charAt(j+1)=='*') { //match *, needs to look at the next char to repeate current char
            if(isMatch(i,s,j+2,p)) {
                return t[i][j]=true;
            }
            if(i<sn && (pj == '.'||pj==s.charAt(i))) {
                if(isMatch(i+1,s,j,p)) {
                    return t[i][j]=true;
                }
            }
        } else if(i<sn && (s.charAt(i) == pj ||    //match char
                   pj=='.')) {              //match dot
            return t[i][j]=isMatch(i+1, s, j+1, p);
        }
        return t[i][j]=false;
    }
}
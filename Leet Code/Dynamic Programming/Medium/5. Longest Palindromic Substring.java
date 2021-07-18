




//5. Longest Palindromic Substring




class Solution {
    Boolean dp[][];
    public String longestPalindrome(String s) {
        dp =  new Boolean[s.length()][s.length()];
        if(s.length()==1){
            return s;
        }else if(s.length()==2){
            if(s.charAt(0)==s.charAt(1)){
                return s;
            }else{
                return s.charAt(0)+"";
            }
        }else{
            
            int p=0,q=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && checkPalindrome(s,i+1,j-1)){
                    if((j-i)>=(q-p)){
                        p=i;
                        q=j;
                    }
                }
            }
        }
        return s.substring(p,q+1);
        }
    }
    public boolean checkPalindrome(String s, int i, int j){
        
         if (i >=j)return true;
        
         if (dp[i][j] != null)return dp[i][j] ;
        
        
        if (s.charAt(i) != s.charAt(j)) {
            return dp[i][j]=false;
        }
        
        if (j - i <= 2){
            return dp[i][j]=true;
        }
        
        return dp[i][j]=checkPalindrome(s,i + 1, j - 1);
        
        
    }
}
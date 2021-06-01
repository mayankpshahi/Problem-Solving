


//Longest Palindromic Subsequence

public class Solution {
    int t[][];
    public int solve(String A) {
        StringBuilder sb=new StringBuilder(A);
         t = new int[A.length()+1][A.length()+1];
        return lcs(A.length(),A.length(),sb.toString(),sb.reverse().toString());
    }
    private int lcs(int p,int q,String A, String B ){
        if(p==0 || q==0) return 0;
        
        for(int i=1;i<p+1;i++){
       for(int j=1;j<q+1;j++){
            if(A.charAt(i-1) == B.charAt(j-1)) t[i][j] = 1+t[i-1][j-1];
            else t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
       } 
    } 
    
    return t[p][q];

        
        
    }
}

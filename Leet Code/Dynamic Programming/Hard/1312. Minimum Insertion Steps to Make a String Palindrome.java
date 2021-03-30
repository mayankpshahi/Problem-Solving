

//1312. Minimum Insertion Steps to Make a String Palindrome

class Solution {
    private int t[][]= new int[501][501]; 
    private int lcs(int p, int q, String s1, String s2){
        for(int i=0;i<t.length;i++)
         t[i][0] = 0;
        for(int j=0;j<t[0].length;j++)
         t[0][j] = 0;
        
    for(int i=1;i<p+1;i++){
       for(int j=1;j<q+1;j++){
            if(s1.charAt(i-1) == s2.charAt(j-1)) t[i][j] = 1+t[i-1][j-1];
            else t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
       } 
    } 
    
    return t[p][q];
    }

    public int minInsertions(String s) {
         int n =  s.length();
        StringBuilder sb=new StringBuilder(s);
        
        int p =  lcs(n,n,sb.toString(),sb.reverse().toString());
        
        return n-p;

        
    }
}

//Form a palindrome

class Solution{
    static int t[][]= new int[1001][1001]; 
    static int lcs(int p, int q, String s1, String s2){
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

    static int countMin(String str)
    {
        // code here
         int n =  str.length();
        StringBuilder sb=new StringBuilder(str);
        
        int p =  lcs(n,n,sb.toString(),sb.reverse().toString());
        
        return n-p;

    }
}
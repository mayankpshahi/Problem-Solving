



//Distinct Subsequences



public class Solution {
    int t[][];
    public int numDistinct(String s1, String s2) {
        t = new int[s2.length()+1][s1.length()+1];
        int count = distinctSubsequence(s1,s2);
         return count;
    }
    public int distinctSubsequence(String str1, String str2)
    {   
        int p = str1.length();
        int q = str2.length();
        // code here
        
        
    for(int j=0; j<p+1; j++) {
        t[0][j] = 1;
    }
       
    for(int i=1;i<q+1;i++){
       for(int j=1;j<p+1;j++){
            if(str2.charAt(i-1) == str1.charAt(j-1))  t[i][j] = t[i-1][j-1] + t[i][j-1];
            else t[i][j] = t[i][j-1];
       } 
    } 
    
    return t[q][p];
    }
}

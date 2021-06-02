



//Repeating Sub-Sequence


public class Solution {
    int t[][];
    public int anytwo(String A) {
        t =  new int[A.length()+1][A.length()+1];
        
        int len = LongestRepeatingSubsequence(A);
        //System.out.println(len);
        
        if(len<=1) return 0;
        else return 1;
        
    }
     public int LongestRepeatingSubsequence(String str)
    {   
        int p = str.length();
        int q = p;
        // code here
       
    for(int i=1;i<p+1;i++){
       for(int j=1;j<q+1;j++){
            if(str.charAt(i-1) == str.charAt(j-1) && i!=j) t[i][j] = 1+t[i-1][j-1];
            else t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
       } 
    } 
    
    return t[p][q];
    }
}

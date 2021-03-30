

//String Subsequence 


class Solution {
    int t[][]= new int[501][501]; 
    int countWays(String S1, String S2) { 
        // code here 
        int m= S1.length();
         int n =  S2.length();
         
         
         
        for( int i = 0 ; i <= n ; i++)
        t[0][i] = 0;
        
        for( int i = 0 ; i <= m ; i++)
        t[i][0] = 1;
        
         
         
         
         for (int i = 1; i <= m; i++){
        for (int j = 1; j <= n; j++){
            
            if (S1.charAt(i - 1) == S2.charAt(j - 1))
                t[i][j] = t[i - 1][j - 1] + t[i - 1][j];
            else
                t[i][j] = t[i - 1][j];
        }
    }
    
    return t[m][n];
    }
}
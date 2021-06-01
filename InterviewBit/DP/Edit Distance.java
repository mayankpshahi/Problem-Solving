


//Edit Distance



public class Solution {
    int t[][];
    public int minDistance(String A, String B) {
        t = new int[A.length()+1][B.length()+1];
        return minDistance(A.length(),B.length(),A,B);
    }
    private int minDistance(int p,int q,String A, String B ){
        // Fill d[][] in bottom up manner 
        for (int i = 0; i <= p; i++) { 
            for (int j = 0; j <= q; j++) { 
                // If first string is empty, only option is to 
                // insert all characters of second string 
                
                if (i == 0) t[i][j] = j; // Min. operations = j 
                
                // If second string is empty, only option is to 
                // remove all characters of second string 
                
                else if (j == 0) 
                    t[i][j] = i; // Min. operations = i 
                
                // If last characters are same, ignore last char 
                // and recur for remaining string 
                
                else if (A.charAt(i - 1) == B.charAt(j - 1)) 
                    t[i][j] = t[i - 1][j - 1]; 
  
                // If the last character is different, consider all 
                // possibilities and find the minimum 
                else
                    t[i][j] = 1 + Math.min(Math.min(t[i][j - 1], // Insert 
                                       t[i - 1][j]), // Remove 
                                       t[i - 1][j - 1]); // Replace 
            } 
        } 
  
       
    
    return t[p][q];
     }
}

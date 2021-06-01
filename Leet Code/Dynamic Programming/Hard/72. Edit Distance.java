


//72. Edit Distance


class Solution {
    int t[][];
    public int minDistance(String word1, String word2) {
        t = new int[word1.length()+1][word2.length()+1];
        return minDistance(word1.length(),word2.length(),word1,word2);
        
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


//1758. Minimum Changes To Make Alternating Binary String

class Solution {
    public int minOperations(String s) {
        
        int count = 0;
        char a [] = s.toCharArray();
        
        for(int i=0;i<a.length;i++){
            if (i % 2 == 0 && a[i]== '1') 
                count++; 
  
          
            if (i % 2 == 1 && a[i] == '0') 
                count++; 
        }
        
        return Math.min(count, a.length - count);
    }
}
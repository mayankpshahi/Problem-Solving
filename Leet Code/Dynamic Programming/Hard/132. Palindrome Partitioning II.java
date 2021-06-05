






//Memoized Solution but TLE

class Solution {
    int t[][];
    public int minCut(String s) {
        t=  new int[s.length()+1][s.length()+1];
        
        for (int[] row : t) 
            Arrays.fill(row, -1);

        char arr [] =  s.toCharArray();
        
        return solve(arr,0,arr.length-1);
        
    }
     private boolean isPalindrome(char arr[],int p,int q){
    int i=p,j=q;
      while (i < j) {
           if (arr[i] != arr[j])
                return false;
            i++;
            j--;
        }
 
        
        return true;
    }
    

    private int solve(char arr[],int i,int j){
        if(i>=j)
         return 0;
         
       
        if(t[i][j]!=-1) return t[i][j];
        
         if(isPalindrome(arr,i,j)) return t[i][j]=0;
         
        int min =  Integer.MAX_VALUE;
        int left =0,right =0;
         
        for(int k=i;k<=j-1;k++){
            
             if(t[i][k]!=-1) left = t[i][k];
             else{
                 left = solve(arr,i,k);
                 t[i][k] =  left;
             }
             
             if(t[k+1][j]!=-1) right = t[k+1][j];
             else{
                 right = solve(arr,k+1,j);
                 t[k+1][j] =  right;
             }
            
            int temp = 1+left + right ;
            
            min =  Math.min(temp,min);
        }
        
        return t[i][j]=min;
    }

}




//Bottom Up DP


class Solution {
    
    public int minCut(String s) {
      char[] c = s.toCharArray();
    int n = c.length;
    int[] cut = new int[n];
    boolean[][] pal = new boolean[n][n];
    
    for(int i = 0; i < n; i++) {
        int min = i;
        for(int j = 0; j <= i; j++) {
            if(c[j] == c[i] && (j + 1 > i - 1 || pal[j + 1][i - 1])) {
                pal[j][i] = true;  
                min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);
            }
        }
        cut[i] = min;
    }
    return cut[n - 1];
    
    }
}
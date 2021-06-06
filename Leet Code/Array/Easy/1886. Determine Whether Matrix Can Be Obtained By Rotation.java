



//1886. Determine Whether Matrix Can Be Obtained By Rotation



class Solution {
    private void rotate(int[][] matrix) {
    int n=matrix.length;
    for (int i=0; i<n/2; i++) 
        for (int j=i; j<n-i-1; j++) {
            int tmp=matrix[i][j];
            matrix[i][j]=matrix[n-j-1][i];
            matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
            matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
            matrix[j][n-i-1]=tmp;
        }
    }
    private boolean checkequal(int[][] mat, int[][] target){
        int n=mat.length;
         for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            if(mat[i][j]!=target[i][j]) return false;
            
        }
    }
        
    return true;
        
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for(int k=0;k<4;k++){
            
            rotate(mat);
            
            if(checkequal(mat,target)) return true;
            
            
            
        }
        
        return false;
        
    }
    
}
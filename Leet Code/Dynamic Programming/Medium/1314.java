//1314. Matrix Block Sum


class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
       int m =  mat.length , n = mat[0].length;
        int res[][] = new int[m][n];
        int[][] psum = new int[m][n]; 
        psum[0][0] = mat[0][0];
         
          for(int j= 1;j<n;j++)
              psum[0][j] = psum[0][j-1] + mat[0][j];
        
        
        
        for(int i= 1;i<m;i++){
            psum[i][0] = psum[i-1][0] + mat[i][0];
             for(int j= 1;j<n;j++){
                psum[i][j] = psum[i-1][j]+psum[i][j-1] + mat[i][j] - psum[i-1][j-1];
                 
             }
            
        }
        //psum =  [[1,3,6],[5,12,21],[12,27,45]]
        
        for(int i= 0;i<m;i++){
             for(int j= 0;j<n;j++){
                 
                 int r = Math.min(m-1,i+k);
                 int c =  Math.min(n-1,j+k);
                 res[i][j] = psum[r][c];
                 if(i<=k){
                     if(j>k) res[i][j]-=psum[r][j-k-1];
                 }else{
                     res[i][j] -=psum[i-k-1][c];
                     if(j>k) res[i][j]-=psum[r][j-k-1] - psum[i-k-1][j-k-1];
                     
                 }
                 
                 
             }
        }
        
        return res;
        
        
        
    }
}
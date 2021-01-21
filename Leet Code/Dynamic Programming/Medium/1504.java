//1504. Count Submatrices With All Ones


class Solution {
    public int numSubmat(int[][] mat) {
         int res  = 0;
         int m =  mat.length;
         int n =  mat[0].length;
        
        for(int i = 0;i<m;i++)
            for(int j = n-2;j>=0;j--)
                if(mat[i][j]==1)
                    mat[i][j]+=mat[i][j+1];
        
        
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int min_width = mat[i][j];
                   for(int d=i;d<m;d++){
                       if(mat[d][j]==0)
                           break;
                       
                       min_width =  Math.min(mat[d][j],min_width);
                       
                       res+=min_width;
                   }
                
                
            }
            
     }
        
        
        
      return res; 
      
    }
}
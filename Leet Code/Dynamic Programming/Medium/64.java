//64. Minimum Path Sum

//Recursion TLE
class Solution {
    static int minfind(int [][]grid,int i,int j){
        if(i==grid.length-1 && j==grid[0].length-1){
            return grid[i][j];
        }
        if(i == grid.length-1) return grid[i][j] + minfind(grid, i, j + 1); 
        if(j == grid[0].length-1) return grid[i][j] + minfind(grid, i+1, j);
        
        return grid[i][j] + Math.min(minfind(grid,i,j+1),minfind(grid,i+1,j));
    }
    public int minPathSum(int[][] grid) {
        
        return minfind(grid,0,0);
    }
}



//Dp Solution
class Solution {
    
    public int minPathSum(int[][] grid) {
        int n =  grid.length;
        int m =  grid[0].length;
        
    for(int j=1;j<m;j++){
        grid[0][j] +=grid[0][j-1];
    }
    for(int i=1;i<n;i++){
        grid[i][0] +=grid[i-1][0];
    }
 for (int i = 1; i < n; i++) {
   for (int j = 1; j < m; j++) {
       grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
   }
}
  
return grid[n-1][m-1];
    }
}
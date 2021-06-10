



//Unique Paths in a Grid


public class Solution {
    int t[][];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        t = new int[m][n];
        for(int[]row : t) Arrays.fill(row,-1);
        return solve(obstacleGrid,0,0,m,n);
    }
    private int solve(int[][]grid, int x, int y, int m, int n){
       if(x>=m || x<0 || y>=n || y<0 || grid[x][y]==1) return 0; //sanity check
        
       if(x==m-1 && y==n-1) return 1; // reached final destination
        
       if(t[x][y] != -1) return t[x][y];
       grid[x][y] = 1; //mark visited
       int ways = solve(grid,x+1,y,m,n) + solve(grid,x,y+1,m,n);
       grid[x][y] = 0; //backtrack
       return t[x][y]=ways;
    }
}

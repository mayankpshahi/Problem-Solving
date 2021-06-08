




//221. Maximal Square

class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0) return 0;
        
    int m = matrix.length, n = matrix[0].length, res = 0;
        
    int[][] newmatrix = new int[m+1][n+1];
        
    for (int i = 1 ; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if(matrix[i-1][j-1] == '1') {
         newmatrix[i][j] = Math.min(Math.min(newmatrix[i][j-1] , newmatrix[i-1][j-1]), newmatrix[i-1][j]) + 1;
                
                res = Math.max(newmatrix[i][j], res);
            }
        }
    }
    return res*res;
        
    }
}
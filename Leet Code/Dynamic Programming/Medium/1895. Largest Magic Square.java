


//1895. Largest Magic Square




class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
       int[][] rowsum = new int[m + 1][n + 1];
        int[][] colsum = new int[m + 1][n + 1];
        int[][] diagsum = new int[m + 1][n + 1];
        int[][] antidiagsum = new int[m + 1][n + 1];
        
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                rowsum[i + 1][j + 1] = rowsum[i + 1][j] + grid[i][j];
                colsum[i + 1][j + 1] = colsum[i][j + 1] + grid[i][j];
                diagsum[i + 1][j + 1] = diagsum[i][j] + grid[i][j];
                antidiagsum[m - i - 1][n - j] = antidiagsum[m - i][n - j - 1] + grid[m - i - 1][n - j - 1];
                }
            }
        
        
      int res = 1;

        for (int side = 2; side <= Math.min(m, n); side++) {
            for (int i = side - 1; i < m; i++) {
                for (int j = side - 1; j < n; j++) {
                    
                    boolean rowvalid = true;
                    
                    int effectiveRowSum = rowsum[i + 1][j + 1] - rowsum[i + 1][j + 1 - side];
                    
                    for (int k = i - side + 1; k < i; k++) {
                        if (rowsum[k + 1][j + 1] - rowsum[k + 1][j + 1 - side] != effectiveRowSum) {
                            rowvalid = false;
                            break;
                        }
                    }

                    if (!rowvalid) continue;

                    boolean colvalid = true;
                    int effectiveColSum = colsum[i + 1][j + 1] - colsum[i - side + 1][j + 1];
                    if (effectiveColSum != effectiveRowSum) continue;
                    for (int k = j - side + 1; k < j; k++) {
                        if (colsum[i + 1][k + 1] - colsum[i + 1 - side][k + 1] != effectiveColSum) {
                            colvalid = false;
                            break;
                        }
                    }

                    if (!colvalid) continue;

                    int effectiveDiaSum = diagsum[i + 1][j + 1] - diagsum[i + 1 - side][j + 1 - side];
                    int effectiveAntiDiaSum = antidiagsum[i + 1 - side][j + 1] - antidiagsum[i + 1][j + 1 - side];
                    if (effectiveDiaSum == effectiveColSum && effectiveDiaSum == effectiveAntiDiaSum) res = Math.max(res, side);
                }
            }
        }
        return res;
        
        
        
        
        
        
    }
}
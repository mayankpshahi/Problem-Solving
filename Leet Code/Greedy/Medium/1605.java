//1605. Find Valid Matrix Given Row and Column Sums


class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        
        int m = rowSum.length, n = colSum.length;
        int[][] res = new int[m][n];
        int i=0,j=0;
        while (i < m && j < n){
                res[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= res[i][j];
                colSum[j] -= res[i][j];
                if (rowSum[i] == 0) i++;
                if (colSum[j] == 0) j++;
            }
        
        return res;
        
    }
}
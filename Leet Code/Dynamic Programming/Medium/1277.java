//1277. Count Square Submatrices with All Ones


class Solution {
    public int countSquares(int[][] matrix) {
        int res  = 0;
        
        
        for(int i = 0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(i>0 && j>0 && matrix[i][j]>0){
                    int minNbr = Math.min(matrix[i-1][j], Math.min(matrix[i][j-1], matrix[i-1][j-1]));
                    matrix[i][j] = minNbr + 1;
                }
                res+=matrix[i][j];
            }
        }
        
        return res;
    }
}
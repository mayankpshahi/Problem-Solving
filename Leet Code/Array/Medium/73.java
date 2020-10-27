//73. Set Matrix Zeroes

//O(MN) time O(1) space

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean col0 = true;
        int row = matrix.length, col = matrix[0].length;
        for(int i=0;i<row;i++){
            if(matrix[i][0] == 0) col0 = false;
            for(int j=1;j<col;j++){
                if(matrix[i][j]==0) matrix[i][0] = matrix[0][j] = 0;
            }
        }

        for(int i=row -1;i>=0;i--){
            for(int j=col-1;j>=1;j--)
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            if(col0 == false) matrix[i][0]=0;

        }

    }
}

//48. Rotate Image

//O(n^2)time O(1)space

class Solution {
    static void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        int t = matrix[r1][c1];
        matrix [r1][c1] = matrix [r2][c2];
        matrix[r2][c2] = t;
    }

    public void rotate(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return;
        }
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i != j) {
                    swap(matrix, i, j, j, i);
                }
            }
        }

         for (int i = 0; i < n; i ++) {
            for (int j = 0; j < (int) n/2; j++) {
                swap (matrix, i, j, i, n-1-j);
            }
        }





    }
}

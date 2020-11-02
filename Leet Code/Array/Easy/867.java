//867. Transpose Matrix


//O(n^2)

class Solution {
    public int[][] transpose(int[][] A) {
        int t = 0;
        int res[][] = new int[A[0].length][A.length];
        for(int i = 0;i<A.length;i++){
            for(int j = 0;j<A[0].length;j++){
                res[j][i] = A[i][j];
            }
        }

        return res;

    }
}

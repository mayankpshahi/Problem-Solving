
//931. Minimum Falling Path Sum


class Solution {
    public int minFallingPathSum(int[][] A) {
        
        for(int i=1;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(j==0)
                    A[i][0] = Math.min(A[i][0]+A[i-1][0],A[i][0]+A[i-1][1]);
                else if(j==A[0].length-1)
                    A[i][j] = Math.min(A[i][j]+A[i-1][j],A[i][j]+A[i-1][j-1]);
                else
                    A[i][j] =Math.min( A[i][j]+A[i-1][j-1],Math.min(A[i][j]+A[i-1][j],A[i][j]+A[i-1][j+1]));
            }
        }
        
        int min = Integer.MAX_VALUE;
        
         for(int j=0;j<A[0].length;j++){
                min = Math.min(min,A[A.length-1][j]);
            }
        
        return min;
    }
}
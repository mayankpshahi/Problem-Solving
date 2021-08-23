
//1975. Maximum Matrix Sum


class Solution {
    public long maxMatrixSum(int[][] mat) {
        long sum = 0,count=0,min =  Integer.MAX_VALUE;
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]<0)count++;
                min =  Math.min(min,Math.abs(mat[i][j]));
                sum+=Math.abs(mat[i][j]);
            }
        }
        
        return count%2==0?sum:sum-2*min;
      
        
    }
}
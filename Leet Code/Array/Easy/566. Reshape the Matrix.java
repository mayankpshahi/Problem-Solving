



//566. Reshape the Matrix



class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] res =  new int[r][c];
        
        int p=0,q=0;
        if((r*c)>(mat.length * mat[0].length)|| (r*c)<(mat.length * mat[0].length)) return mat;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(p<=r-1 && q<c-1){
                    res[p][q] = mat[i][j];
                    q++;
                    }
                else if(p<=r-1 && q==c-1){
                    res[p][q] = mat[i][j];
                    q=0;
                    p++;
                }
            }
        }
        
        return res;
        
    }
}







//Other Solution




public int[][] matrixReshape(int[][] nums, int r, int c) {
    int n = nums.length, m = nums[0].length;
    if (r*c != n*m) return nums;
    int[][] res = new int[r][c];
    for (int i=0;i<r*c;i++) 
        res[i/c][i%c] = nums[i/m][i%m];
    return res;
}





//59. Spiral Matrix II




class Solution {
    public int[][] generateMatrix(int num) {
        int mat [][] = new int[num][num];
        
        int m = mat.length, n = mat[0].length, p =0, q = 0;
        //List<Integer> res  =  new ArrayList<>();
        
        int val=1;
        while(p<m && q <n){
            //firstrow
            for(int i=q;i<n;i++){
                mat[p][i] =  val;
                val++;
            }
            p++;
            
            //last col
            for(int i=p;i<m;i++){
            mat[i][n-1] =  val;
                val++;
            }
            n--;
            
            //last row
            if(p<m){
            for(int i=n-1;i>=q;i--){
                mat[m-1][i] =  val;
                val++;
            }
            m--;
            }
            
           //first col
            if(q<n){
            for(int i=m-1;i>=p;i--){
            mat[i][q]=val;
            val++;
            }
            q++;
            }
            
            
        }
        
        return mat;
        
    }
}
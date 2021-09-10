



//54. Spiral Matrix


class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length, p =0, q = 0;
        List<Integer> res  =  new ArrayList<>();
        
        while(p<m && q <n){
            //firstrow
            for(int i=q;i<n;i++){
                res.add(mat[p][i]);
            }
            p++;
            
            //last col
            for(int i=p;i<m;i++){
                res.add(mat[i][n-1]);
            }
            n--;
            
            //last row
            if(p<m){
            for(int i=n-1;i>=q;i--){
                res.add(mat[m-1][i]);
            }
            m--;
            }
            
           //first col
            if(q<n){
            for(int i=m-1;i>=p;i--){
                res.add(mat[i][q]);
            }
            q++;
            }
            
            
        }
        
        return res;
    }
}
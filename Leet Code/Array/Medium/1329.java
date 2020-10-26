My Solution:

class Solution {
    public int[][] diagonalSort(int[][] mat) {
     int m = mat.length, n = mat[0].length;
        
        sort(mat,m-1,n-1); 
        for(int r=m-2; r>=0; r--) sort(mat,r,n-1);  
        for(int c=n-2; c>=0; c--) sort(mat,m-1,c);  
        
        return mat;
    }
    
    void sort(int mat[][],int r, int c){
        List<Integer> v = new ArrayList<>();
        for(int i=r,j=c; i>=0 && j>=0; i--,j--) v.add(mat[i][j]);
        Collections.sort(v);
        for(int i=r,j=c,idx=v.size()-1; i>=0 && j>=0; i--,j--,idx--) mat[i][j] = v.get(idx);
    } 
}

Other Solution: Using Counting Sort

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        int n = mat.length, m = mat[0].length;
        for(int i = 0; i < n - 1; i++) {
            countingSort(mat, i, 0, n, m);
        }
        for(int j = 1; j < m - 1; j++) {
            countingSort(mat, 0, j, n, m);
        }
        return mat;
    }
    
    private void countingSort(int[][] mat, int i, int j, int n, int m) {
        
        int[] arr = new int[101];        
        int k = i, l = j, val = 0;
        while(k < n && l < m) {
            arr[mat[k][l]]++;
            k++; l++;
        }
        
        k = i; l = j;
        for(int p = 0; p < 101; p++) {
            if(arr[p] > 0) {
                val = arr[p];
                while(val > 0){
                    mat[k][l] = p;
                    k++; l++; val--;  
                }
            }
        }
    }
}
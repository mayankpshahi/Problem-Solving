



//0-1 Knapsack



public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
        int n = B.size();
        int t[][] =  new int[n+1][C+1];
        
         for(int i=1;i<n+1;i++){
            for(int j=1;j<C+1;j++){
                if(B.get(i-1)<=j)
                 t[i][j] = Math.max(A.get(i-1)+t[i-1][j-B.get(i-1)],t[i-1][j]);
                else
                  t[i][j]=t[i-1][j];
            }
        }
         
        return t[n][C];  
    }
}

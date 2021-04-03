


//Matrix Chain Multiplication

class Solution{
    static int t[][] =  new int[501][501];
    static int solve(int arr[],int i,int j){
        if(i>=j)
         return 0;
         
        if(t[i][j]!=-1) return t[i][j];
         
        int min =  Integer.MAX_VALUE;
         
        for(int k=i;k<=j-1;k++){
            int temp = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1]*arr[k]*arr[j]);
            
            min =  Math.min(temp,min);
        }
        
        return t[i][j]=min;
    }
    
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
         for (int[] row : t) 
            Arrays.fill(row, -1);
            
        return solve(arr,1,N-1);
        
    }
}
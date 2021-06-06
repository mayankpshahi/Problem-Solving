




//Subset Sum Problem!


public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
        return isSubsetSum(B,A,A.size())==true?1:0;
    }
    
    private boolean isSubsetSum(int sum, ArrayList<Integer> arr, int n) 
    {   boolean t[][] =  new boolean[n+1][sum+1];
         int i=0,j=0;
        for(j=1;j<sum+1;j++)
          t[i][j]=false;
          
        j=0;
        for(i=0;i<n+1;i++)
          t[i][j]=true;
         
        i=0;j=0;
        for(i=1;i<n+1;i++){
            for(j=1;j<sum+1;j++){
                if(arr.get(i-1)<=j)
                 t[i][j] = t[i-1][j-arr.get(i-1)] || t[i-1][j];
                else
                  t[i][j]=t[i-1][j];
            }
        }
         
        return t[n][sum];  
        
    }

}

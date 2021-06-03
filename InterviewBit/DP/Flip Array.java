

//Flip Array



public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A) {
        int n = A.size();
      int sum=0;
	    for(int i=0;i<n;i++)
	      sum+=A.get(i);
         
          sum = (sum)/2;
          
          return countSubsetSum(sum,A,n);

        
    }
    private int countSubsetSum(int sum, final List<Integer> A, int n) 
    {   int t[] =  new int[sum+1];
        t[0]=0;
        
    for(int i=1;i<sum+1;i++) t[i]=Integer.MAX_VALUE;
for(int i=0;i<A.size();i++){
    for(int j=sum;j>=A.get(i);j--){
        if(t[j-A.get(i)]!=Integer.MAX_VALUE) t[j]=Math.min(t[j], t[j-A.get(i)]+1);
    }
}
for(int i=sum;i>=0 ;i--){
    if(t[i]!=Integer.MAX_VALUE) return t[i];
}   

return t[n];
        
    }

}




//1911. Maximum Alternating Subsequence Sum


class Solution {
    public long maxAlternatingSum(int[] nums) {
        
       ArrayList<Integer> v = new ArrayList<>();
    for(int i :nums)
    {
        v.add(i);
    }
     
    
    int N = v.size();
 
   
    return maxSum(v, N);
    }
    private long maxSum( ArrayList<Integer> arr, int N){
     
    
     arr.add(-1);
 
   
   Collections.reverse(arr);
 
   
    arr.add(-1);
 
   
    Collections.reverse(arr);
 
    long maxDiff = 0;
 
    
    for(int i = 1; i <= N; i++)
    {
         
       
        if (arr.get(i) >= arr.get(i - 1) && arr.get(i) > arr.get(i + 1))
        {
             
            
            maxDiff += arr.get(i);
        }
 
        if (arr.get(i) < arr.get(i - 1) && arr.get(i) <= arr.get(i + 1))
        {
             
            
            maxDiff -= arr.get(i);
        }
    }
    
    
    return maxDiff;
}
}
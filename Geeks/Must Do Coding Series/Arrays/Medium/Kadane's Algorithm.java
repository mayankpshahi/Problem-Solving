

//Kadane's Algorithm 

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        if(n==1) return arr[0];
        
         int store = 0, max =Integer.MIN_VALUE;
         
         
         for(int x : arr){
            
                store += x;
            
               if (max < store) 
                max = store; 
            

            if(store<0)store = 0;
            
            
        }
        
        return max;
        
    }
    
}


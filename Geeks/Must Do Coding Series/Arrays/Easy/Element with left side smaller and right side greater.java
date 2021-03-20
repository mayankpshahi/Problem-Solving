
//Element with left side smaller and right side greater

class Compute {
    public int findElement(int arr[], int n){
        
              int[] left_max = new int[n];
              left_max[0] = arr[0];
 
              
              for (int i = 1; i < n; i++)
                   left_max[i] = Math.max(left_max[i - 1], arr[i]);
                    
              int[] right_min = new int[n];
              right_min[n-1] = arr[n-1];
 
              
              for (int i = n - 2; i >= 0; i--){
                  right_min[i]=Math.min(arr[i],right_min[i+1]);
              }
              for (int i = 1; i<n-1; i++) 
              {
                   
                   if (left_max[i] <= arr[i] && right_min[i] >= arr[i])
                       return arr[i];
 
                   
                  
              }
                
             
              return -1;
        
    }
}
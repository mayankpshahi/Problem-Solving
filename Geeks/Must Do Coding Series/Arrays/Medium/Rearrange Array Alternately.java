

//Rearrange Array Alternately

class Solution{
    
  
    public static void rearrange(int arr[], int n){
        
        int end = n - 1, start = 0;
 
        
        int max = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
           
            if (i % 2 == 0) {
                arr[i] += (arr[end] % max) * max;
                end--;
            }
 
            
            else {
                arr[i] += (arr[start] % max) * max;
                start++;
            }
        }
 
    
        for (int i = 0; i < n; i++)
            arr[i] = arr[i] / max;
        
    }
    
}
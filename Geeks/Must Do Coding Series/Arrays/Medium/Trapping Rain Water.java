
//Trapping Rain Water
//O(n)  time and O(n) Space space

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int pre[] = new int[n];
        int suff[] = new int[n];
        
        pre[0] = arr[0];
        for(int i=1;i<n;i++)
         pre[i] = Math.max(pre[i-1],arr[i]);
         
        suff[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
         suff[i] = Math.max(suff[i+1],arr[i]);
         
         int water = 0;
         
        for(int i=0;i<n;i++){
            water+= Math.abs(Math.min(pre[i],suff[i]) - arr[i]);
        }
        
        
        return water;
         
    } 
}


//O(n)  time and O(1) Space space

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
        
        // Your code here
       
        // initialize output
        int result = 0;
 
        // maximum element on left and right
        int left_max = 0, right_max = 0;
 
        // indices to traverse the array
        int lo = 0, hi = n - 1;
 
        while (lo <= hi) {
            if (arr[lo] < arr[hi]) {
                if (arr[lo] > left_max)
 
                    // update max in left
                    left_max = arr[lo];
                else
 
                    // water on curr element =
                    // max - curr
                    result += left_max - arr[lo];
                lo++;
            }
            else {
                if (arr[hi] > right_max)
 
                    // update right maximum
                    right_max = arr[hi];
 
                else
                    result += right_max - arr[hi];
                hi--;
            }
        }
 
        return result;
         
    } 
}
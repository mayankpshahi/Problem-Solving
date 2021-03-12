

//Equilibrium Point

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long rsum=0;
        long lsum=0;
        
        for(int i=0;i<n;i++)
         rsum+=arr[i];
        
        for(int i=0;i<n;i++){
            rsum-=arr[i];
            
            if(lsum == rsum) return i+1;
            
            lsum+=arr[i];
        }
         
        return -1;
    }
}
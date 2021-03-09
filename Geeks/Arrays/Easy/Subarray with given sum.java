

//Subarray with given sum

class Solution{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        
        // Your code here
        int sum = arr[0];// to track current sum
        int start_ind = 0;// to track start index of subarray
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=1;i<n+1;i++){
           
           // If our sum is greater than given then we start decrementing start elements
            while(sum>s && start_ind< i-1){ 
                sum = sum - arr[start_ind];
                start_ind++;
            }
            
            
            // when sum is equal to s we add indexes to our list and break the loop 
            if(sum==s){
                l.add(start_ind+1);
                l.add(i);
                break;
            }
            
            if(i<n) sum+=arr[i];
            
        }
        
        if(l.size()==0)
          l.add(-1);
        
        return l;
        
    }
}

//Leaders in an array

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> l =  new ArrayList<Integer>();
        
        int rmax=arr[n-1];
        
        l.add(rmax);
       
         
        for(int i=n-2;i>=0;i--){
            
            
            if(rmax <= arr[i]){
                rmax=arr[i];
                l.add(rmax);
            } 
            
        
        }
        Collections.reverse(l);
        return l;
    }
}


//Pythagorean Triplet

class Solution {
    boolean checkTriplet(int[] arr, int n) {
        // code here
        if(n<3) return false;
        
        HashSet<Integer> s =  new HashSet<Integer>();
        
         for(int i=0;i<n;i++){
          s.add(arr[i] * arr[i]);
          arr[i] = arr[i]*arr[i];
         } 
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(s.contains(arr[i] + arr[j])) return true;
            }
        }
        
        return false;
    }
}
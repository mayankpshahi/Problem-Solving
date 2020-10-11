My Soution


class Solution {
    public int xorOperation(int n, int start) {
        
        int [] nums = new int[n];
        
         int k = start;
        for(int i = 1;i<n;i++){
            k = k^(start + (2*i));
        }
        return k;
    }
}
//1663. Smallest String With A Given Numeric Value

class Solution {
    public String getSmallestString(int n, int k) {
        char[] res = new char[n];
        for(int i = 0;i<n;i++) res[i] = 'a';
        
        k -=n;
        while(k > 0) {
            n--;
            res[n] += Math.min(25, k);
            k -= Math.min(25, k);
        }
        return String.valueOf(res);
        
    }
}
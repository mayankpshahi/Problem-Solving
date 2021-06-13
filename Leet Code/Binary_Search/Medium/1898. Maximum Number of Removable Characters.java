



//1898. Maximum Number of Removable Characters


class Solution {
   public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0; 
        int right = removable.length-1;
        while (left + 1 < right) {
            int mid = (left + right)/2;
            if (check(s, p, mid, removable)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (check(s, p, right, removable)) return right + 1;
        if (check(s, p, left, removable)) return left + 1;
        return 0;
    }
    
    boolean check(String s, String p, int k, int[] removable) {
        char[] array = s.toCharArray();
        char[] p_array = p.toCharArray();
        for (int i = 0; i <= k; i++) {
            array[removable[i]] = '*';
        }
        return isSubsequence(array, p_array);
    }
    
    boolean isSubsequence(char[] t, char[] p) {
        int i = 0;
        for(int j = 0; i < p.length && j < t.length; ++j){
            if(p[i] == t[j]){
                ++i;
            }
        }
        return i == p.length;
    }
}
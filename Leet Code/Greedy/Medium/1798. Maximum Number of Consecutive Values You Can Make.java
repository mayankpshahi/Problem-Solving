
//1798. Maximum Number of Consecutive Values You Can Make

class Solution {
    public int getMaximumConsecutive(int[] coins) {
         Arrays.sort(coins);
        
        int count = 1;
        
        for (int a: coins) {
            if (a > count) break;
            count += a;
        }
        
        return count;
    }
}
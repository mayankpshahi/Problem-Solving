

//343. Integer Break


class Solution {
    public int integerBreak(int n) {
         if (n == 0) return 0;
        int[] t = new int[n + 1];
        t[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                t[j] = Math.max(t[j], t[j - i] * i);
            }
        }
        return t[n];
    }
}
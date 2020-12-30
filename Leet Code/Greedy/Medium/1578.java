//1578. Minimum Deletion Cost to Avoid Repeating Letters


class Solution {
    public int minCost(String s, int[] cost) {
         int res = 0, max_cost = 0, n = s.length();
        for (int i = 0; i < n; ++i) {
            if (i > 0 && s.charAt(i) != s.charAt(i - 1))
                max_cost = 0;
            res += Math.min(max_cost, cost[i]);
            max_cost = Math.max(max_cost, cost[i]);
        }
        return res;
        
    }
}
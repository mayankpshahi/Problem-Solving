

//89. Gray Code


class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        boolean[] seen = new boolean[1 << n];
        seen[0] = true;
        backtrack(n, res, seen);
        return res;
        
    }
    private boolean backtrack(int n, List<Integer> res, boolean[] seen) {
        if (res.size() == 1 << n) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            int next = (1 << i) ^ res.get(res.size() - 1); 
            
            if (!seen[next]){
            seen[next] = true;
            res.add(next);
            if (backtrack(n, res, seen)) return true;
            seen[next] = false;
            res.remove(res.size() - 1);
            }
        }
        return false;
    }
}
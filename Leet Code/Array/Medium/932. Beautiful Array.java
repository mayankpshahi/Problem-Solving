





//932. Beautiful Array


class Solution {
     public int[] beautifulArray(int N) {
        return helper(N, new HashMap<>());
    }
    
    private int[] helper(int N, Map<Integer, int[]> cache) {
        if (N == 1) return new int[] {1};
        if (cache.containsKey(N)) return cache.get(N);
        
        int oddKey = (N / 2 + (N%2)), evenKey = N / 2;
        int[] odd =  helper(oddKey, cache);
        int[] even = helper(evenKey, cache);
        int[] res = new int[odd.length + even.length];
        
        int idx = 0;
        for (int i : odd) res[idx++] = 2*i - 1;
        for (int i : even) res[idx++] = 2*i;
        cache.put(N, res);
        return res;
    }
}
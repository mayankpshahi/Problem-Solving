//1711. Count Good Meals

class Solution {
 
 
    public int countPairs(int[] deliciousness) {
        
        int md = 1000000007;
        Map<Integer, Integer> m = new HashMap<>();
        
        long res = 0;
        for (int num : deliciousness) {
            int pow = 1;
            for (int i = 0; i < 22; i++) {
                if (m.containsKey(pow - num)) {
                    res += m.get(pow- num);
                    res %= md;
                }
                pow *= 2;
            }
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        return (int) res;
        
    }
}
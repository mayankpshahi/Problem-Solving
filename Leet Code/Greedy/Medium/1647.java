//1647. Minimum Deletions to Make Character Frequencies Unique


class Solution {
    public int minDeletions(String s) {
        int[] freq= new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : freq) {
            if (i == 0) continue;
            while (set.contains(i)) {
                i--;
                res++;
            }
            if (i != 0) {
                set.add(i);
            }
        }
        return res;
        
    }
}
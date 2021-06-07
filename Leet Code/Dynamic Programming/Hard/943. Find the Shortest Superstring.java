


//943. Find the Shortest Superstring




class Solution {
    public String shortestSuperstring(String[] words) {
        
     Map<String, String> map = new HashMap<>();

        // mark every word as unused
        int unused = 0;  // integer is used as a bit array
        for(int i = 0; i < words.length; i++) {

            unused |= 1 << i;
        }

        return shortestSuperstring(words, "", unused, map);
    }

    private String shortestSuperstring(String[] words, String startWord, int unused, Map<String, String> map) {
        if (unused == 0) {
            return startWord;
        }

        // check 
        String key = startWord + "|" + unused;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        String shortest = null;
        for(int i = 0; i < words.length; i++) {
            if (!isConsumed(unused, i)) {
                // get the shortest superstring starting from an unused word
                String superstring = shortestSuperstring(words, words[i], consume(unused, i), map);

                // "append" the shortest superstring to the start word
                String appended = overlapAppend(startWord, superstring);

                // keep the shortest
                if (shortest == null || appended.length() < shortest.length()) {
                    shortest = appended;
                }
            }
        }
        map.put(key, shortest);
        return shortest;
    }


    // Concat string a to b . For example, "bake" and "kelt" => "bakelt"
    private String overlapAppend(String a, String b) {
        for(int i = Math.max(1, a.length() - b.length()); i < a.length(); i++) {
            boolean match = true;
            for(int j = i; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j - i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                return a.substring(0, i) + b;
            }
        }
        return a + b;
    }

    private boolean isConsumed(int unused, int i) {
        return ((unused >> i) & 1) == 0;
    }

    private int consume(int unused, int i) {
        return unused & ~(1 << i);
    }

}



//Other and better Solution


class Solution {
    public String shortestSuperstring(String[] A) {
        int N = A.length;

        // Populate overlaps
        int[][] overlaps = new int[N][N];
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j) if (i != j) {
                int m = Math.min(A[i].length(), A[j].length());
                for (int k = m; k >= 0; --k)
                    if (A[i].endsWith(A[j].substring(0, k))) {
                        overlaps[i][j] = k;
                        break;
                    }
            }

        // dp[mask][i] = most overlap with mask, ending with ith element
        int[][] dp = new int[1<<N][N];
        int[][] parent = new int[1<<N][N];
        for (int mask = 0; mask < (1<<N); ++mask) {
            Arrays.fill(parent[mask], -1);

            for (int bit = 0; bit < N; ++bit) if (((mask >> bit) & 1) > 0) {
                // Let's try to find dp[mask][bit].  Previously, we had
                // a collection of items represented by pmask.
                int pmask = mask ^ (1 << bit);
                if (pmask == 0) continue;
                for (int i = 0; i < N; ++i) if (((pmask >> i) & 1) > 0) {
                    // For each bit i in pmask, calculate the value
                    // if we ended with word i, then added word 'bit'.
                    int val = dp[pmask][i] + overlaps[i][bit];
                    if (val > dp[mask][bit]) {
                        dp[mask][bit] = val;
                        parent[mask][bit] = i;
                    }
                }
            }
        }

        // # Answer will have length sum(len(A[i]) for i) - max(dp[-1])
        // Reconstruct answer, first as a sequence 'perm' representing
        // the indices of each word from left to right.

        int[] perm = new int[N];
        boolean[] seen = new boolean[N];
        int t = 0;
        int mask = (1 << N) - 1;

        // p: the last element of perm (last word written left to right)
        int p = 0;
        for (int j = 0; j < N; ++j)
            if (dp[(1<<N) - 1][j] > dp[(1<<N) - 1][p])
                p = j;

        // Follow parents down backwards path that retains maximum overlap
        while (p != -1) {
            perm[t++] = p;
            seen[p] = true;
            int p2 = parent[mask][p];
            mask ^= 1 << p;
            p = p2;
        }

        // Reverse perm
        for (int i = 0; i < t/2; ++i) {
            int v = perm[i];
            perm[i] = perm[t-1-i];
            perm[t-1-i] = v;
        }

        // Fill in remaining words not yet added
        for (int i = 0; i < N; ++i) if (!seen[i])
            perm[t++] = i;

        // Reconstruct final answer given perm
        StringBuilder ans = new StringBuilder(A[perm[0]]);
        for (int i = 1; i < N; ++i) {
            int overlap = overlaps[perm[i-1]][perm[i]];
            ans.append(A[perm[i]].substring(overlap));
        }

        return ans.toString();
    }
}

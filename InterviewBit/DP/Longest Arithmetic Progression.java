



//Longest Arithmetic Progression


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A) {
        
         if(A.size()==1) return 1;
          int max = 2, n = A.size();
        HashMap<Integer, Integer>[] t  = new HashMap[n];
        
        for (int i = 0; i < n; i++) {
            t[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int d = A.get(i) - A.get(j);
                t[i].put(d, t[j].getOrDefault(d, 1) + 1);
                max = Math.max(max, t[i].get(d));
            }
        }
        return max;
        
    }
}

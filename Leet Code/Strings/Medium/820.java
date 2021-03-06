

//820. Short Encoding of Words

class Solution {
    public int minimumLengthEncoding(String[] words) {
        Set<String> set = new HashSet(Arrays.asList(words));
        
          for (String w: words) {
            for (int k = 1; k < w.length(); ++k)
                set.remove(w.substring(k));
        }
        
        int res = 0;
        for (String w: set)
            res += w.length() + 1;
        return res;
    }
}
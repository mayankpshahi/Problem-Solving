
//1286. Iterator for Combination

class CombinationIterator {
    
    List<String> res;
    int ind = 0;

    public CombinationIterator(String characters, int combinationLength) {
         res = new ArrayList();
        backtrack(combinationLength, 0, characters, new ArrayList());
        
    }
    private void backtrack(int k, int index, String str, List<Character> subset) {
        if (subset.size() == k) {
            StringBuilder sb = new StringBuilder();
            for (char s : subset){
                sb.append(s);
            }
            res.add(sb.toString());
            return;
        }
        
        for (int i = index; i < str.length(); i++) {
            subset.add(str.charAt(i));
            backtrack(k, i+1, str, subset);
            subset.remove(subset.size()-1);
        } 
    }
    
    public String next() {
        
       return res.get(ind++);
        
    }
    
    public boolean hasNext() {
        return res.size() >= ind +1;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
//380. Insert Delete GetRandom O(1)

class RandomizedSet {
    
   List<Integer> l;
   Map<Integer, Integer> m;
        
    Random r = new Random();

    /** Initialize your data structure here. */
    public RandomizedSet() {
         l = new ArrayList<>();
        m = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
         Integer index = m.get(val);
        
        boolean flag = index != null && l.get(index) != null;
        
        if (!flag) {
            
            l.add(val);
            m.put(val, l.size()-1);
        }
        
        return !flag;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        Integer index = m.get(val);
        
        boolean flag = index != null && l.get(index) != null;
        
        if (flag) {
            
          l.set(index, null);
        }
        
        return flag;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
         int index = r.nextInt(l.size());
            
        while (l.get(index) == null) {
            
            index = r.nextInt(l.size());
        }
        
        return l.get(index);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
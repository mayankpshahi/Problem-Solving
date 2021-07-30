


//677. Map Sum Pairs



class MapSum {

    /** Initialize your data structure here. */
    Map<String,Integer> map;
    public MapSum() {
        map  =  new HashMap<>();
        
    }
    
    public void insert(String key, int val) {
    map.put(key, val);

        
    }
    
    public int sum(String prefix) {
        int res=0;
         for (Map.Entry ele : map.entrySet()) {
            String key = (String)ele.getKey();
            int value = ((int)ele.getValue());
             
            if(key.startsWith(prefix)){
                res+=value;
            }
        }
        
        return res;
        
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
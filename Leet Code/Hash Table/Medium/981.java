//981. Time Based Key-Value Store

class TimeMap {

    /** Initialize your data structure here. */
    private Map<String,TreeMap<Integer,String>> m;
    public TimeMap() {
         m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!m.containsKey(key)) {
            m.put(key,new TreeMap<>());
        }
        m.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> tM = m.get(key);
        if(tM==null) {
            return "";
        }
        Integer biggest = tM.floorKey(timestamp);
        if(biggest==null) {
            return "";
        }
        return tM.get(biggest);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
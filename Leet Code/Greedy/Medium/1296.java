//1296. Divide Array in Sets of K Consecutive Numbers

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) return false;
        
       TreeMap<Integer, Integer> m = new TreeMap<>();
       for (int i : nums) m.put(i, m.getOrDefault(i, 0)+1);
        
        while(m.size() > 0) {	        
	        int c = m.firstKey();	        
			for(int i = c; i < c + k; i++) {
	        	if(!m.containsKey(i)) return false;
	        	else{
	        		m.put(i, m.get(i) - 1);
        			if(m.get(i) ==0)
        				m.remove(i);
	        	}
	        }
        }
        return true;        
    }
}
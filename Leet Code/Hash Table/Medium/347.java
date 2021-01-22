//347. Top K Frequent Elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
      Map<Integer,Integer> m = new HashMap();
        for(int ele : nums){
            m.put(ele,m.getOrDefault(ele,0) + 1);
        }
        
        
         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->m.get(b) - m.get(a));
        
        
        pq.addAll(m.keySet());
        
        int[] topK = new int[k];
        
        for(int i = 0;i<k;i++){
            topK[i] = pq.poll();
        }
        return topK;
        
    }
}
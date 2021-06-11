



//K Largest Elements


public class Solution {
    public int[] solve(int[] A, int B) {
        PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
        for(int a:A)pq.offer(a);
        
        int [] res  =  new int[B];
        
        for(int i=0;i<B;i++){
            res[i] = pq.poll();
        }
        
        return res;
    }
}

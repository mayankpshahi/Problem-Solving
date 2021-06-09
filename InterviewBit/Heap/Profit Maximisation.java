


//Profit Maximisation


public class Solution {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
        
        for(int a:A)pq.offer(a);
        int res =0;
        
        while(B!=0){
            int p = pq.poll();
            res+=p;
            p--;
            pq.offer(p);
            B--;
        }
        
        return res;
    }
}

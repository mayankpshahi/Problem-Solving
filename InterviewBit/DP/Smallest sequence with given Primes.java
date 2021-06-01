

//Smallest sequence with given Primes


public class Solution {
    public ArrayList<Integer> solve(int A, int B, int C, int D) {
        ArrayList<Integer> res=new ArrayList<>();
    
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    pq.offer(A);
    pq.offer(B);
    pq.offer(C);
    while(!pq.isEmpty() && D>0){
        int val = pq.poll();
        while(!pq.isEmpty() && pq.peek()==val){
               pq.poll();
            }
        res.add(val);
        D--;
        pq.offer(val*A);
    pq.offer(val*B);
    pq.offer(val*C);
        
    }
    return res;
    }
}

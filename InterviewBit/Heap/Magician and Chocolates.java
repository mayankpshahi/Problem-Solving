



//Magician and Chocolates



public class Solution {
    public int nchoc(int A, int[] B) {
        
        PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
        
        long choc = 0;
        
        for(int i:B) pq.offer(i);
        
        for(int i=0;i<A;i++){
            int curr = pq.poll();
            choc+=curr;
            choc%=1000000007;
            curr=(int)Math.floor(curr/2);
            pq.offer(curr);
            
        }
        
        return (int)choc%1000000007;
        
        
    }
}

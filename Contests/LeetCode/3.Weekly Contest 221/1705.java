
//1705. Maximum Number of Eaten Apples

class Solution {
    public int eatenApples(int[] apples, int[] days) {
        int res = 0; 
        int i = 0; //day
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(a+days[a])-(b+days[b])); // indexes go in, sort by expiration date
        for(; i<apples.length; i++){
            if(apples[i] != 0){
                pq.offer(i);
            }            
            while(!pq.isEmpty() && pq.peek()+days[pq.peek()] <= i) //remove expired apples
                pq.poll();
            if(pq.isEmpty()) continue; 
            apples[pq.peek()]--; // eat apple of earliest expiration date
            res++; 
            if(apples[pq.peek()]==0) // remove if apples from that basket are all gone
                pq.poll();
        }
        while(!pq.isEmpty()){ // empty rest of queue
            while(!pq.isEmpty() && pq.peek()+days[pq.peek()] <= i)
                pq.poll();
            if(pq.isEmpty()) continue; 
            apples[pq.peek()]--;
            res++; 
            if(apples[pq.peek()]==0)
                pq.poll();
            i++;
        }
        return res; 
    }
}




//1353. Maximum Number of Events That Can Be Attended


class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        if(n==1)return 1;
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        int count=0,i=0;
        //int end = events[0][1];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int d=1; d<=100000 ; d++) {
             while (i<n && events[i][0] == d){
                pq.add(events[i][1]);// Add events that can be attendes on day d.
                i++;
             }
            while (!pq.isEmpty() && pq.peek() < d)//Remove events that are already closed.
                pq.poll();
            if (!pq.isEmpty()) {
                count++;
                pq.poll();//Use day d to attend the event that closes earlier.
            }
    
            
            
            
        }
        
        return count;
        
    }
}
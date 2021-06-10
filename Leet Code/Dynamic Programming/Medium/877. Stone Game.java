



//877. Stone Game




class Solution {
    public boolean stoneGame(int[] piles) {
        PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
        for(int s:piles) pq.offer(s);
        int alex =0,lee=0;
        while(!pq.isEmpty()){
            alex+= pq.poll();
            
            if(!pq.isEmpty())
                lee+=pq.poll();
        }
        
        return alex>=lee;
        
    }
}




//Other Solution

class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
}
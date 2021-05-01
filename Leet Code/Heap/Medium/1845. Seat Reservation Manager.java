
//1845. Seat Reservation Manager


class SeatManager {
    
    PriorityQueue<Integer> p;
    public SeatManager(int n) {
        p = new PriorityQueue<Integer>();
        
      for(int i=1;i<=n;i++)p.offer(i);
        
    }
    
    public int reserve() {
     return  p.poll();
    }
    
    public void unreserve(int seatNumber) {
      p.offer(seatNumber);
        
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
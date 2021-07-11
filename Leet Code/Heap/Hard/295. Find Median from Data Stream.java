




//ArrayList Solution(TLE)


class MedianFinder {

    /** initialize your data structure here. */
    List<Integer> l ;
    public MedianFinder() {
        l =  new ArrayList<>();
        
    }
    
    public void addNum(int num) {
        l.add(num);
        Collections.sort(l);
    }
    
    public double findMedian() {
        int size = l.size();
        if(size % 2 == 0){
            return (l.get(size/2 - 1) + l.get(size/2)) / 2.0d;
        }else{
            return l.get(size/2)*1.0d;
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */



 //Priority Queue Solution



 class MedianFinder {

    /** initialize your data structure here. */
    //List<Integer> l ;
    
    PriorityQueue<Integer> lower;
    PriorityQueue<Integer> upper;
    public MedianFinder() {
       // l =  new ArrayList<>();
        
        lower = new PriorityQueue<>(Collections.reverseOrder());
        upper = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        // l.add(num);
        // Collections.sort(l);
        
        
        if(lower.isEmpty()||num<=lower.peek()){
            lower.offer(num);
        }else{
            upper.offer(num);
        }
        
        
        if(lower.size()<upper.size()){
            lower.offer(upper.poll());
        }else if(lower.size()>upper.size()+1){
            upper.offer(lower.poll());
        }
    }
    
    public double findMedian() {
       if(lower.size() == upper.size()){
            return (double)(lower.peek() + upper.peek())/2;
        }else{
             return (double)(lower.peek());
        }
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
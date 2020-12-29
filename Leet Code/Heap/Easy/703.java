//703. Kth Largest Element in a Stream



class KthLargest {
    PriorityQueue<Integer> que;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
            que = new PriorityQueue<>(k);
            for (int val : nums)
                add(val);
        
    }
    
    public int add(int val) {
        if (que.size() < k)que.offer(val);
        else if (que.peek() < val) {
                que.poll();
                que.offer(val);
            }
            return que.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */


//Kth Largest Element in an Array

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
    Queue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
    for(int i:nums)
     maxheap.add(i);
     
     int large=0;
     
    for(int i=0;i<k;i++)
      large=maxheap.poll();
      
    return large;
        
    }
}
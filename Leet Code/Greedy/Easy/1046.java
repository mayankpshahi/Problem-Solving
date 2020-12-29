//1046. Last Stone Weight

//1ms maxheap
class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==0) return 0;
        Queue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int stone : stones)
            maxheap.add(stone);
	   while (maxheap.size() > 1)
           maxheap.offer(maxheap.poll() - maxheap.poll());
	return maxheap.poll();
        
    }
}



//0ms Solution
class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        while (stones[stones.length - 2] != 0) {
            stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
            stones[stones.length - 2] = 0;
            Arrays.sort(stones);
        }
        return stones[stones.length - 1];
    }
}
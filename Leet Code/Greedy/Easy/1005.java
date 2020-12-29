//1005. Maximize Sum Of Array After K Negations


class Solution {
    public int largestSumAfterKNegations(int[] A, int k) {
        if(A.length==0) return 0;
        Queue<Integer> minheap = new PriorityQueue<>();
        int lsum = 0;
        for (int a : A)
            minheap.add(a);
        int num = 0;
	   while (k--> 0){
           num = minheap.poll();
           minheap.offer(-num);
           
       }
       while(minheap.size()>0){
           lsum+=minheap.poll();
       }
           
	return lsum;
        
        
    }
}
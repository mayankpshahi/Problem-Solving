



//977. Squares of a Sorted Array



class Solution {
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> pq  =  new PriorityQueue<>();
        
        for(int i:nums){
            pq.offer((i*i));
        }
        
        int res [] =  new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=pq.poll();
        }
        
        return res;
    }
}



//O(n)



class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}
//908. Smallest Range I

//O(n)time and O(1) space
class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = A[0], min=A[0];

        for(int x: A){
            max = Math.max(max, x);
            min = Math.min(min, x);
        }

        return Math.max(0, max-min-2*K);
    }
}

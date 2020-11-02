//910. Smallest Range II

//O(nlogn) time and O(1) space

class Solution {
    public int smallestRangeII(int[] A, int K) {
         Arrays.sort(A);
        int current_min=A[0]-K,current_max=A[A.length-1]-K;
        int result=current_max-current_min;

        for (int i=0;i<A.length-1;i++){
            current_min=Math.min(A[0]+K,A[i+1]-K);
            current_max=Math.max(A[i]+K,A[A.length-1]-K);
            result=Math.min(result,current_max-current_min);
        }
        return result;



    }
}

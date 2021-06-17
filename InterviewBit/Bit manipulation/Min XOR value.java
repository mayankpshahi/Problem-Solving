


//Min XOR value


public class Solution {
    public int findMinXor(int[] A) {
        int ans=Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++)
        ans=Math.min(ans,A[i]^A[i+1]);
        return ans;
    }
}

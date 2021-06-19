



//Single Number

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int xor = A[0];
        for(int i=1;i<A.length;i++){
            xor^=A[i];
        }
        
        return xor;
    }
}

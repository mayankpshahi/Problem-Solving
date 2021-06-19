


//XOR-ing the Subarrays!


public class Solution {
    public int solve(int[] A) {
        if(A.length%2==0) return 0;
        int res=0;
        for(int i=0;i<A.length;i=i+2){
            res=res^A[i];
            
        }
        return res;   
    }
}

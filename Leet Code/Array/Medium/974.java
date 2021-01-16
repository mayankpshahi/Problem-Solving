//974. Subarray Sums Divisible by K


//Logic - if sum[0, i] % K == sum[0, j] % K, sum[i + 1, j] is divisible by by K.
class Solution {
    public int subarraysDivByK(int[] A, int K) {
         int res = 0, sum = 0;
        
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);//m={(0,1)}
        
         for(int i : A) {
            sum = (sum + i) % K;//sum= {4,4,4,2,-1,0}
             
            if(sum < 0) sum += K;  //positive mod
             // sum = {4,4,4,2,4} Instead of doing this we can use sum+=((sum+i)%k+k)%k
             
             
            res += m.getOrDefault(sum, 0);//res={0,1,3,6,7}
             
            m.put(sum, m.getOrDefault(sum, 0) + 1);//m={(0,2),(4,4),(2,1)}
        }
        return res;
        
    }
}
//1664. Ways to Make a Fair Array



class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] oddPrefixSum  = new int[n];
        int[] evenPrefixSum = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(i%2 == 0){
                evenPrefixSum[i] = i > 0 ? evenPrefixSum[i-1] + nums[i] : nums[i] ;
                oddPrefixSum[i] = i > 0 ? oddPrefixSum[i-1] : 0;
            }
            else{
                oddPrefixSum[i] = i > 0 ? oddPrefixSum[i-1] + nums[i] : nums[i] ;
                evenPrefixSum[i] = i > 0 ? evenPrefixSum[i-1] : 0;
            }
        }
        int res = 0;
        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                if(evenPrefixSum[n-1] - evenPrefixSum[0] == oddPrefixSum[n-1] - oddPrefixSum[0]) res++;
            }
            else if(i == n-1){
                if(oddPrefixSum[i-1] == evenPrefixSum[i-1]) res++;
            }
            else{
                int even = evenPrefixSum[i-1] + oddPrefixSum[n-1] - oddPrefixSum[i];
                int odd = oddPrefixSum[i-1] + evenPrefixSum[n-1] - evenPrefixSum[i];
                if(even == odd) res++;
            }
        }
        return res;
    }
}
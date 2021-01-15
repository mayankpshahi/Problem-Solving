//1588. Sum of All Odd Length Subarrays


class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, n = arr.length;
        for (int i = 0; i < n; ++i) {
            sum += ((i + 1) * (n - i) + 1) / 2 * arr[i];
        }
        return sum;
        
    }
}
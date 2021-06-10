




//1043. Partition Array for Maximum Sum


class Solution {
    int [] t;
    public int maxSumAfterPartitioning(int[] arr, int k) {
        t = new int[arr.length];
        Arrays.fill(t,-1);
        
        return maxSumAfterPartitioning(arr, k, 0);
        
    }
    private int maxSumAfterPartitioning(int[] arr, int k, int i) {
		if (i == arr.length) {
			return 0;
		}
		if (t[i] !=-1) {
			return t[i];
		}

		int curr = 0;
		int sum = 0;
		for (int j = 0; j < k; j++) {
			int p = i + j;
			if (p >= arr.length) {
				break;
			}
			curr = Math.max(curr, arr[p]);
			sum = Math.max(sum, (curr * (j +1)) + maxSumAfterPartitioning(arr, k, p +1));
		}
		return t[i] = sum;
	}
}
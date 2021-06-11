



//Ways to form Max Heap


public class Solution {
   
    int MOD = 1000000007;
  
   // Calculate nCk % MOD
private long[][] calculate_combinations(int n, int k) {
    long[][] result = new long[n+1][k+1];
    for(int i = 0; i <= n; i++) {
        for(int j = 0; j <= Math.min(i, k); j++) {
            if(j == 0 || j == i) {
                result[i][j] = 1;
            }
            else {
                result[i][j] = (result[i - 1][j - 1] % MOD + result[i - 1][j] % MOD) % MOD;
            }
        }
    }
    
    return result;
}
private int log2(int N){
  
        // calculate log2 N indirectly
        // using log() method
        int result = (int)(Math.log(N) / Math.log(2));
  
        return result;
    }
 private  int left_subtree_elements(int total_elements) {
    if(total_elements == 1) {
        return 0;
    }

    int height = log2(total_elements);
    int max_elements_last = (1 << height);
    int actual_elements_last = total_elements - ((1 << height) - 1);

    // If last level is more than half filled
    if(actual_elements_last >= (max_elements_last / 2)) {
        return (1 << height) - 1;
    }
    // If last level is less than half filled
    return (1 << height) - 1 - (max_elements_last / 2) + actual_elements_last;
}

    public int solve(int A) {
        
        long [][] ncr = calculate_combinations(A, A);
    
    long[] dp =  new long[A+1];
    dp[0] = dp[1] = 1;
    for(int i = 2; i <= A; i++) {
        int left = left_subtree_elements(i);
        dp[i] = ((ncr[i - 1][left] * dp[left]) % MOD * dp[i - 1 - left]) % MOD;
    }

    return (int)dp[A];
    }
}

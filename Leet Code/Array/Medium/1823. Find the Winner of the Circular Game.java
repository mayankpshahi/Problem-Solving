

//1823. Find the Winner of the Circular Game


class Solution {

   private int josephus(int n, int k) {
    if (n == 1)
        return 0;
    if (k == 1)
        return n-1;
    if (k > n)
        return (josephus(n-1, k) + k) % n;
    int cnt = n / k;
    int res = josephus(n - cnt, k);
    res -= n % k;
    if (res < 0)
        res += n;
    else
        res += res / (k - 1);
    return res;
}

    public int findTheWinner(int n, int k) {
        
      
        
        
        return josephus(n,k)+1;
        
        
    }
}
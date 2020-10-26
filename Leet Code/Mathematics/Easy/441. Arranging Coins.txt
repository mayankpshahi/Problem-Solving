//441. Arranging Coins
//O(n) 6ms
class Solution {
    public int arrangeCoins(int n) {
       int i=1;
        int count=0;
        while(n>=i){
            n=n-i;
            i++;
            count++;
        }
        return count;
    }
}




//O(logn) 1ms
class Solution {
    public int arrangeCoins(int n) {
       if(n <= 0) return 0;

        long left  = 0, right = n;
      while(left <= right) {
        long mid = left + (right - left)/2;
        long coins = mid* (mid+1)/2;
         if(coins == n) return (int)mid;
         else if(coins > n) right = mid -1;
         else
             left = mid + 1;
      }
        return (int)right;

    }
}




/*As a reminder, the constraint of the problem can be expressed as follows:

k(k + 1) \le 2Nk(k+1)≤2N

This could be solved by completing the square technique,

\left(k + \frac{1}{2}\right)^2 - \frac{1}{4} \le 2N(k+
2
1
​
 )
2
 −
4
1
​
 ≤2N

that results in the following answer:

k = \left[\sqrt{2N + \frac{1}{4}} - \frac{1}{2}\right]k=[
2N+
4
1
​

​
 −
2
1
​
 ]*/



//O(1) 1ms
 class Solution {
    public int arrangeCoins(int n) {
       return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);

    }
}
